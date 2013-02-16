package structural.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

// Dynamic proxy & generative/automatic programming
// http://www2.sys-con.com/itsg/virtualcd/java/archives/0702/mclachlan/index.html

/**
 *  A Proxy is an automatically generated class that implements an interface 
 *  that you choose. When any of the methods it implements gets called, 
 *  the Proxy object will call an InvocationHandler's invoke() method. 
 *  invoke() can then do whatever it wishes, including forwarding 
 *  the call onto the "real" object.
 *  
 *  Proxy builds a Java class into a byte array and then loads it 
 *  into the JVM with a private native defineClass0 method.
 */
public class Main {
	public static void main(String[] args) {
		
		// no advice.
		
		CustomerService cs1 = new CustomerServiceImpl();
		cs1.saveCustomer();
		
		System.out.println("--------------------");
		
		// using the AuditLogAdvice with the 'CustomerService' 	
		ClassLoader classLoader1 = Main.class.getClassLoader();
		
		AuditLogAdvice advice1 = new AuditLogAdvice(new CustomerServiceImpl());
		CustomerService proxidService1 = 
				
				// dynamically at run time generates a class/byte code in memory
				(CustomerService) Proxy.newProxyInstance(
					classLoader1, 
					// the dynamically generated class implements this interfaces.
					new Class[] {CustomerService.class}, 
					// and will call the 'invoke()' method on the 'advice' which implements InvocationHandler.
					advice1);
		proxidService1.saveCustomer();
		
		System.out.println("--------------------");
		
		// using the AuditLogAdvice with the 'ProductService' 	
		ClassLoader classLoader2 = Main.class.getClassLoader();
		AuditLogAdvice advice2 = new AuditLogAdvice(new ProductServiceImpl());
		ProductService proxidService2 = (ProductService) Proxy.newProxyInstance(
				classLoader2, new Class[] {ProductService.class}, advice2);
		proxidService2.saveProduct();
	}	
}
