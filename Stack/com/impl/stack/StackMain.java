package com.impl.stack;

import java.util.Scanner;

//our own stack class for operations
class Stack {
	// array
	private int[] arr;
	// fields
	private int top;

	// ctor for size of arr
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	// methods(OPerations)

	// menu
	static void menus() {
		System.out.println("press 1 to Push");
		System.out.println("press 2 to Pop");
		System.out.println("press 3 to Peek");
		System.out.println("press 0 to Exit");

	}

	// push
	public void push(int val) {
		if (isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		top++;
		arr[top] = val;
	}

	// pop
	public void pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty, can't pop");
		}
		top--;
	}

	// peek
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is Empty, nothing to peek");
		}
		return arr[top];
	}

	// isEmpty
	public boolean isEmpty() {
		return top == -1;
	}

	// isFull
	public boolean isFull() {
		return top == arr.length - 1;
	}

}//

//main
public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(6);
		boolean exit = false;

		while (!exit) {
			Stack.menus();
			int choice, val;
			choice = sc.nextInt();
			System.out.println("press 1 to Push");
			System.out.println("press 2 to Pop");
			System.out.println("press 3 to Peek");
			System.out.println("press 0 to Exit");

			switch (choice) {
			case 1://push
				try {
					System.out.println("Enter element to Push to stack: ");
					val = sc.nextInt();
					s.push(val);
					System.out.println("Element pushed :"+val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2://pop
				try {
					val = s.peek();
					s.pop();
					System.out.println("Popped :"+ val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3://peek
				try {
					val = s.peek();
					System.out.println("\n TopMost while Peeking: "+ val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
				//mby mistake imm taking multiple choices

			case 0:
				exit = true;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid i/p...");
				sc.next();
				break;
			}
		}

	}

}
//
