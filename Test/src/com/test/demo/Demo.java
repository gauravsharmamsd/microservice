package com.test.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
//		List<Integer> list = List.of(1, 2, 3, 6);
//		Stream<Integer> streamOfInteger = list.stream();
//	//	streamOfInteger.filter(no -> no > 1).forEach(System.out::println);
//
//		List<Integer> integers = streamOfInteger.filter(no -> no < 5).collect(Collectors.toList());
//		System.out.println(integers);
		

        List<Integer> list1 = Arrays.asList(3, 6, 9, 12, 15);
  
        list1.stream().map(number -> number * 3).collect(Collectors.toList()).forEach(System.out::println);

	}
}
