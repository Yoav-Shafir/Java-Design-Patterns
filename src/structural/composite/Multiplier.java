package structural.composite;

public class Multiplier extends BinaryExpression {
	
	public Multiplier(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double getValue() {
		return this.left.getValue() * this.right.getValue();
	}

}
