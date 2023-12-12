package com.tester;

import com.util.CustomStack;

public class CustomStackTester {

	public static void main(String[] args) {
		CustomStack stack =new  CustomStack(5);
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		System.out.println("Popped : "+stack.pop());
		
		System.out.println(stack.getMax());
	}

}
