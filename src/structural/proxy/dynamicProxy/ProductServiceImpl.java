package structural.proxy.dynamicProxy;

public class ProductServiceImpl implements ProductService {

	@Override
	public void saveProduct() {
		System.out.println("Saving product...");
	}

}
