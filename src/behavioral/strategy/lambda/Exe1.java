package behavioral.strategy.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

// Simple example of the Strategy design pattern using lambdas.
// The idea is to pass different implementations of doing a sum operation on integers.

public class Exe1 {

	// Imperative.
	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
		int total = 0;
		for (int number : numbers) {
			if (selector.test(number)) {
				total += number;
			}
		}

		return total;
	}

	// Declarative + using Streams.
	public static int totalValuesStream(List<Integer> numbers, Predicate<Integer> selector) {
		return numbers.stream().filter(selector).mapToInt(num -> num).sum();
	}

	public static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number - 1).noneMatch(index -> number % index == 0);
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(totalValuesStream(numbers, num -> true)); // sum all numbers.
		System.out.println(totalValuesStream(numbers, num -> num % 2 == 0)); // sum all even numbers.
		System.out.println(totalValuesStream(numbers, num -> num < 3)); // sum all numbers less than 3.
		System.out.println(totalValuesStream(numbers, Exe1::isPrime)); // sum all prime numbers.
	}
}
