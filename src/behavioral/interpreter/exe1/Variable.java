package behavioral.interpreter.exe1;

import java.util.Map;

public class Variable implements Expression {
	private String name;
	
	public Variable(String name) { 
		this.name = name; 
	}
	
	@Override
	public int interpret(Map<String, Expression> valuesMap) {
		if(null == valuesMap.get(name)) 
			return 0; //Either return new Number(0).
        return valuesMap.get(name).interpret(valuesMap); 
	}

}
