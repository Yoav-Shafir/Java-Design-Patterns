package behavioral.interpreter.exe1;

import java.util.Map;

public class Plus implements Expression {
	Expression leftOperand;
    Expression rightOperand;
    
    public Plus(Expression left, Expression right) {
    	this.leftOperand = left; 
        this.rightOperand = right;
	}
    
	@Override
	public int interpret(Map<String, Expression> valuesMap) {
		return leftOperand.interpret(valuesMap) + rightOperand.interpret(valuesMap);
	}

}
