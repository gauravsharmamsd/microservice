package com.test;

import java.util.StringJoiner;

public class Test1 {
	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner("-","[","]");
		joiner.add("india").add("is").add("my").add("country");
		System.out.println(joiner);
		
		
		Test2 test2=new Test2();
		test2.test();

	}
	
	public int count(){
		return 5;
	}
	public String string(){
		return "hello";
	}

}

