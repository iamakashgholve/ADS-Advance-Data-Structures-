package com.tester;

import java.util.Arrays;

import com.util.LinkedList;
import com.util.Stack;

public class StackTester {
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		try {
			
		
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(6);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.push(4);
		stack.display();
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
