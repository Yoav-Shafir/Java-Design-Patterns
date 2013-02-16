package behavioral.interpreter.exe1;

import java.util.Map;

public class Minus implements Expression {
	Expression leftOperand;
    Expression rightOperand;
    
    public Minus(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
    
	@Override
	public int interpret(Map<String, Expression> valuesMap) {
		return leftOperand.interpret(valuesMap) - rightOperand.interpret(valuesMap);
	}

}
