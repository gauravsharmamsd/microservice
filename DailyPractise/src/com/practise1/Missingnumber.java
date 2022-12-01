package com.practise1;

public class Missingnumber {

	public static void main(String[] args) {
		int array[] = new int[] { 1, 3, 4, 5, 6, 7,8, 9, 10 };
		findMissingNumber(array);

	}

	private static void findMissingNumber(int[] array) {
		int length = array.length + 1;
		int sum = (length * (length + 1)) / 2;
		int actualSum = 0;
		for (int i = 0; i < array.length; i++) {
			actualSum = actualSum + array[i];
		}
		System.out.println("missing no is " + (sum - actualSum));
	}

}
