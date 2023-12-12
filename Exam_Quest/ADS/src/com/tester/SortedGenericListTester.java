package com.tester;

import java.util.List;

import com.util.SortedList;

public class SortedGenericListTester {

	public static void main(String[] args) {

		SortedList<Integer> list = new SortedList<>();
		list.add(1);
		list.add(10);
		list.add(4);
		list.add(14);
		list.add(6);
		list.add(19);

		System.out.println(list.toString());

		System.out.println();
		list.addAll(List.of(1, 2, 3, 4, 56, 7, 8, 9, 8, 6, 4, 2, 456));
		System.out.println(list.toString());

	}

}
