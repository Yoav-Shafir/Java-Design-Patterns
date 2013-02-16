package structural.composite;

public class Adder extends BinaryExpression {
	
	public Adder(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double getValue() {
		return this.left.getValue() + this.right.getValue();
	}

}
