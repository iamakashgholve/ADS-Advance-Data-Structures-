package com.tester;

import com.util.MyCirculerQueue;

public class MyQueueTester {

	public static void main(String[] args) {
		MyCirculerQueue queue =new MyCirculerQueue(5);
		
		queue.add("abc");
		queue.add("xyz");
		queue.add("d");
		queue.add("e");
		queue.add("f");
		System.out.println(queue.toString());
		System.out.println(queue.size());
		queue.remove();
		System.out.println(queue.toString());
		System.out.println(queue.size());
		queue.remove();
		System.out.println(queue.toString());
		System.out.println(queue.size());

	}

}
