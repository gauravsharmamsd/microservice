package com.test;

interface A {
	void a();

	default void test() {
		System.out.println("default of a ");
	}
}

interface B {
	void b();

	default void test1() {
		System.out.println("default of b ");
	}
}

public class Test2 implements A, B {

	@Override
	public void a() {
		// TODO Auto-generated method stub

	}

	@Override
	public void b() {
		// TODO Auto-generated method stub

	}

}
