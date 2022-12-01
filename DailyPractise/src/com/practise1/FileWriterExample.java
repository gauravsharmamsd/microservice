package com.practise1;

import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String args[]) {
		try {
			FileWriter fw = new FileWriter("test.text");
			for (int i = 0; i < 5; i++) {

				fw.write("Welcome to javaTpoint."+i);
			}
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Success...");
	}
}