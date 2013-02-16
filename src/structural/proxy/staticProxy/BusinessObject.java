package structural.proxy.staticProxy;

abstract public class BusinessObject {
	public abstract void sayHi();
	
	// get the user specific implementation and wrap it with a proxy object.
	public static BusinessObject create(BusinessObject target) {
		return new BusinessObjectProxy(target);
	}
}