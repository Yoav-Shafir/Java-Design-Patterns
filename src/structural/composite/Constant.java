package structural.composite;

public class Constant implements Expression {
	
	private double value;

	public Constant(double value) {
		this.value = value;
	}
	
	@Override
	public double getValue() {
		return this.value;
	}

}
