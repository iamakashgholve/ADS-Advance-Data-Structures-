package com.tester;

import com.util.CustomLinkedList;

public class CustomeLinkedListImpl {

	public static void main(String[] args) {
		CustomLinkedList list =new CustomLinkedList();
		try {
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		list.list();
		list.add(9, 8);
		list.list();
		list.remove(4);
		list.list();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
