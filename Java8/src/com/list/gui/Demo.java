package com.list.gui;

import java.util.Base64;

public class Demo {
	public static void main(String[] args) {
		String originalInput = "test input";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		System.out.println(encodedString);
		byte[] decString=Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decString);;
		System.out.println(decodedString);
		
		
	}
}
