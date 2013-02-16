package structural.composite.test;

import static org.junit.Assert.*;
import structural.composite.Adder;
import structural.composite.Constant;
import structural.composite.Divider;
import structural.composite.Expression;
import structural.composite.Multiplier;
import structural.composite.Subtracter;

public class Test {
	
	@org.junit.Test
	public void testConstant() {
		double testValue = 3.0;
		Expression e = new Constant(testValue);
		assertEquals(testValue, e.getValue(), 0.0);
	}
	
	@org.junit.Test
	public void testAdder() {
		double testValueA = 2.0;
		double testValueB = 4.0;
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		Expression e = new Adder(left, right);
		assertEquals((testValueA + testValueB), e.getValue(), 0.0);	
	}
	
	@org.junit.Test
	public void testSubtracter() {
		double testValueA = 2.0;
		double testValueB = 4.0;
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		Expression e = new Subtracter(left, right);
		assertEquals((testValueA - testValueB), e.getValue(), 0.0);	
	}
	
	@org.junit.Test
	public void testDivider() {
		double testValueA = 2.0;
		double testValueB = 4.0;
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		Expression e = new Divider(left, right);
		assertEquals((testValueA / testValueB), e.getValue(), 0.0);
	}
	
	@org.junit.Test
	public void testMultiplier() {
		double testValueA = 2.0;
		double testValueB = 4.0;
		Expression left = new Constant(testValueA);
		Expression right = new Constant(testValueB);
		Expression e = new Multiplier(left, right);
		assertEquals((testValueA * testValueB), e.getValue(), 0.0);	
	}
	
	// (3 + 5) * 100	/	2 + 64 	
	@org.junit.Test
	public void testComplexExpression() {
		Expression e = 
			new Divider(
				new Multiplier(
					new Adder(new Constant(3.0), new Constant(5.0)),
					new Constant(100.0)
				),
				new Adder(new Constant(2.0), new Constant(64.0))
			);
		assertEquals(12.1212121212, e.getValue(), 0.00001);	
	}
}
