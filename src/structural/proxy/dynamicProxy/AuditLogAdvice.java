package structural.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AuditLogAdvice implements InvocationHandler {
	
	private Object target;
	
	public AuditLogAdvice(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		// before method invokation.
		System.out.println("Creating the audit log...");
		
		// method invokation.
		Object result = method.invoke(this.target, args);
		
		// after method invokation.
		System.out.println("After method invokation...");
		return result;
	}

}
