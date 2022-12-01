package com.practise1;

public class FibaonacciSeries {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		int arr[] = new int[15];

		for (int i = 0; i < 15; i++) {
			if (i == 0 || i == 1) {
				arr[i] = i;
				continue;
			}
			int c = firstNumber + secondNumber;
			arr[i] = c;
			firstNumber = secondNumber;
			secondNumber = c;
		}
		for (int no : arr) {
			System.out.println("the numbers in arr " + no);
		}
	}
}
