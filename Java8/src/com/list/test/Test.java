package com.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		long id =554656;
		
		Comparator<Integer> mycomparator = (a, b) -> {
			return (a > b) ? -1 : (a < b) ? 1 : 0;
		};
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(1);
		al.add(12);
		al.stream().forEach(System.out::println);
		Collections.sort(al, mycomparator);
		System.out.println("*********************");
		al.stream().forEach(System.out::println);
		
		Integer li = al.stream().filter(d -> d == 12).findFirst().get();
		System.out.println(li);

	}
}
