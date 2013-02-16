package structural.composite;

public class Subtracter extends BinaryExpression {
	
	public Subtracter(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public double getValue() {
		return this.left.getValue() - this.right.getValue();
	}

}
