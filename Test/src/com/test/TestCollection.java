package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollection {
	static {
		int l = 55;
	}
	protected static final ArrayList<Integer> FIELDS_NOT_IN_USE = new ArrayList<>(
			Arrays.asList(new Integer[] { Integer.valueOf(4033), Integer.valueOf(3015), Integer.valueOf(4044),
					Integer.valueOf(3021), Integer.valueOf(4056), Integer.valueOf(1009), Integer.valueOf(1010),
					Integer.valueOf(1012), Integer.valueOf(1013), Integer.valueOf(1016),
					/*      */
					/* 277 */ Integer.valueOf(4046), Integer.valueOf(4047), Integer.valueOf(4048),
					Integer.valueOf(4049), Integer.valueOf(4050) }));

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>(2);
		int cnt = 0;
		while (cnt < 5) {
			integers.add(cnt);
			cnt++;
		}
//		System.out.println(FIELDS_NOT_IN_USE.size());
//		FIELDS_NOT_IN_USE.forEach(integer -> {
//			System.out.println(integer);
//		});

		int typ = Integer.valueOf(PaymentObjectE.PRIORITY.getType());
		System.out.println(typ);
		
		Test1 test1=new Test1();
		test1
	}
}
