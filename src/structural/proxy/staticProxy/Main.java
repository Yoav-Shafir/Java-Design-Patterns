package structural.proxy.staticProxy;

public class Main {
	public static void main(String[] args) {
		
		// interacting directly with the proxy object.
		BusinessObject obj1 = new BusinessObjectProxy(new BusinessObjectImplementation());
		obj1.sayHi();
		
		System.out.println("--------------------");
		
		// better approach - hide the complexity of the proxy.
		BusinessObject obj2 = BusinessObject.create(new BusinessObjectImplementation());
		obj2.sayHi();
	}
}	
