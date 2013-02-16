package structural.proxy.staticProxy;

public class BusinessObjectImplementation extends BusinessObject {
	
	/* (non-Javadoc)
	 * @see structural.proxy.BusinessObject#sayHi()
	 */
	@Override
	public void sayHi() {
		System.out.println("Hello! Have a nice day");
	}
}
