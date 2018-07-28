package behavioral.iterator.custom;

import java.util.Iterator;

// In order for a class to be iterable it needs to implement the Iterable<T> interface.
// This enforces it to implement the iterator() method that returns the actual Iterator<T>.
// So usually we define an inner class that implements the Iterator<T> interface which enforces it
// to implement the hasNext and next methods.

class A1 implements Iterable<Integer> {
	int[] nums = { 1, 2, 3, 4, 5 };

	@Override
	public Iterator<Integer> iterator() {
		return new A2(nums);
	}

	class A2 implements Iterator<Integer> {

		private int[] nums;
		private int index;

		A2(int[] nums) {
			this.nums = nums;
		}

		@Override
		public boolean hasNext() {
			return index < nums.length;
		}

		@Override
		public Integer next() {
			return nums[index++];
		}
	}
}

public class Exe1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		Iterator<Integer> iter = a1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
