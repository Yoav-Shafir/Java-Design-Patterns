package structural.proxy.dynamicProxy;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		System.out.println("Saving customer...");
	}

}
