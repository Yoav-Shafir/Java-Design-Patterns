package behavioral.visitor.exe2;

public class Tabaco implements Visitable {
	
	private double price;
	
	public Tabaco(double price) {
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
