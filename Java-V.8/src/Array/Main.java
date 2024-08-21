package Array;

public class Main {
	/*
	 * Arrays in Java are a fundamental data structure that allows you to store
	 * multiple values of the same type in a single variable. Arrays are fixed in
	 * size, meaning that once they are created, their size cannot be changed.
	 */

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] copy = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int number : numbers) {
			System.out.println(number);
		}
		for (int i = 0; i < numbers.length; i++) {
			copy[i] = numbers[i];
			System.out.print(copy[i]);
		}
		System.out.println();
		// Using System.arraycopy
		System.arraycopy(numbers, 0, copy, numbers.length, 0);

		Student[] student = { 
				new Student("Alex", 20), 
				new Student("Bob", 22), 
				new Student("Charlie", 19) 
				};
		for (Student std : student) {
			System.out.println(std.name + " is " + std.age + " years old.");
		}

		// Bubble sort
		int[] num = { 5, 1, 6, 2, 8 };
		bubbleSort(num);
		for (int n : num) {
			System.out.print(n + " ");

		}
	}

	public static void bubbleSort(int[] ar) {
		int n = ar.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					// Swap ar[j] and ar[j+1]
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}

	}
}
