package com.lambda;

public class TestLambda {
	public static void main(String[] args) {
		/*
		 * BankImpl sbi=()->{ System.out.println("opening account for sbi "); };
		 * sbi.openAccount();
		 * 
		 */
		/*
		 * BankImpl sum = ( x, y) -> { System.out.println("sum of the no is " + (x +
		 * y));
		 * 
		 * }; sum.sum(55, 4);
		 */
		
		BankImpl findLength=(String str)->{
			return str.length();
		};
		System.out.println("The length of Given string is " +findLength.calculateLength("Gaurav kaushik"));
	}
}
