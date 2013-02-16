package behavioral.visitor.exe2;

public class Liquor implements Visitable {
	
	private double price;
	
	public Liquor(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
