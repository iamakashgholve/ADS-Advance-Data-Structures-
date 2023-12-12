package com.tester;

import com.util.CirculerQueue;

public class CirculerQueueTester {
	
	public static void main(String[] args) {
		CirculerQueue cll = new CirculerQueue();
		try {
			cll.enqueue("a");
			cll.enqueue("b");
			cll.enqueue("c");
			cll.enqueue("d");
			cll.enqueue("e");
//			cll.enqueue("e");
//			cll.enqueue("f");
//			cll.enqueue("g");
			System.out.println(cll.dequeue());
			System.out.println(cll.dequeue());
			System.out.println(cll.dequeue());
			System.out.println(cll.dequeue());
			System.out.println(cll.dequeue());
			System.out.println(cll.dequeue());
			
//			cll.display();
			
//			cll.removeNode(1);
//			cll.display();
		
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
