package behavioral.interpreter.exe1;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String expression = "w x z - +";
		
		// building the Expression tree.
        Evaluator sentence = new Evaluator(expression);
        
        // create a map of vaules.
        Map<String, Expression> valuesMap = new HashMap<>();
        valuesMap.put("w", new Number(5));
        valuesMap.put("x", new Number(10));
        valuesMap.put("z", new Number(42));
        
        // get the value.
        int result = sentence.interpret(valuesMap);
        System.out.println(result);
	}
}
