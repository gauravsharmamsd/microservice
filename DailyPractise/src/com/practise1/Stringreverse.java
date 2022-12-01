package com.practise1;

public class Stringreverse {
	public static void main(String[] args) {
		String originalString = "hitting";
		System.out.println("original String is " +originalString);
		System.out.println("reverse String is " + reverseString(originalString));
	}

	private static String reverseString(String originalString) {
		String reverseString = "";
		for (int i = originalString.length()-1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}
		return reverseString;
	}
}
