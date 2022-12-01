package com.test;

class Demo {
	public Demo() {
		this(2,3f);
		System.out.println("0 or default constructor called-----");
		
	}
	public Demo(int a,float b ) {
		this(5,6f,7777);
		System.out.println("2 parametrized constructor----------");
	}
	public Demo(int a,float b,double c ) {
		
		System.out.println("3 parametrized constructor----------");
	}
}

public class ConstructorChainingTest {
	public static void main(String[] args) {
		Demo demo = new Demo();
	}

}
