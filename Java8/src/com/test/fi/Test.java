package com.test.fi;

public	class Test {
	public static void main(String[] args) {
		MyInterface myInterface = (a, b) -> a + b;
		System.out.println(myInterface.sum(10, 15));
	}
}