package structural.proxy.staticProxy;

public class BusinessObjectProxy extends BusinessObject {
	
	private BusinessObject target;

	public BusinessObjectProxy(BusinessObject target) {
		this.target = target;
	}
	
	@Override
	public void sayHi() {
		System.out.println("About to call real...");
		this.target.sayHi();
		System.out.println("Completed call to real...");	
	}

}
