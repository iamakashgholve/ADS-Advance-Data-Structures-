//Linked list
package com.tester;

import java.util.Arrays;

import com.util.LinkedList;

public class Test {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println(list.addNode(1));
		System.out.println(list.addNode(2));
		System.out.println(list.addNode(7));
		System.out.println(list.addNode(2));
		System.out.println(list.addNode(5));
		System.out.println(list.addNode(1));
		System.out.println(list.addNode(0));
		
//		System.out.println(list.size());
//		list.display();
//		
//		list.removeAllOccurances(2);
		list.display();
		list.sort();
		list.display();
		
		list.addAll(Arrays.asList(2,4,5,2,1,7));
		list.sort();
		list.display();
		System.out.println(list.toString());
		
	}

}
