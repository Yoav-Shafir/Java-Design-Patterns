package behavioral.interpreter.exe1;

import java.util.Map;

public class Number implements Expression {
	
	private int number;
	
	public Number(int n) {
		this.number = n;
	}
	
	@Override
	public int interpret(Map<String, Expression> valuesMap) {
		return number;
	}
}
