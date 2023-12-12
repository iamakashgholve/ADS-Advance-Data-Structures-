package com.util;

import com.exception.EmptyStackException;

public class Stack {

	private int[] arr;
	private int top;

	public Stack() {
		arr = new int[5];
		top = -1;
	}

	public void push(int data) {

		if (isFull()) {
			int[] temp = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}

		arr[++top] = data;
	}

	public int pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Stack is empty , can't pop element!!!");
		}
		return arr[top--];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	private boolean isFull() {
		if(top==arr.length-1)
			return true;
		return false;
	}

	public void display() {
		if (top == -1)
			System.out.println("Stack is empty...");
		for (int i = top; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}

	}

}
