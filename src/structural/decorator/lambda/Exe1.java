package structural.decorator.lambda;

import java.util.function.Function;

// Example of how to wrap 2 lambda functions similar to the Decorator design pattern.

public class Exe1 {

	// Passing lambda that accepts an int and returns an int.
	public static int doWork(int number, Function<Integer, Integer> func) {
		return func.apply(number);
	}

	public static void main(String[] args) {
		// Decorator - combining 2 lambdas.
		Function<Integer, Integer> increment = number -> number + 1;
		Function<Integer, Integer> doubleIt = number -> number * 2;

		int result = doWork(6, increment.andThen(doubleIt)); // Here is the decoration using 2 lambdas.
		System.out.println(result);
	}
}
