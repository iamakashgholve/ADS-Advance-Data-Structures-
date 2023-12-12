package com.tester;

import java.util.Arrays;

import com.util.LinkedList;
import com.util.Queue;
import com.util.Stack;

public class QueueTester {
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		try {
			
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(51);
		queue.enqueue(1);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(6);
		queue.display();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.display();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
