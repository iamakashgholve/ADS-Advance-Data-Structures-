package com.util;

public class CustomStack {

	int[] arr;
	int top;
	int max;

	public CustomStack(int size) {
		this.arr = new int[size];
		this.top = -1;
		this.max = Integer.MIN_VALUE;
	}

	public void push(int data) {
		if (isFull()) {
			int[] tmp = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++)
				tmp[i] = arr[i];
			arr = tmp;
		}

		if (data > max) {
			arr[++top] = 2 * data - max;
			max = data;
		} else {
			arr[++top] = data;
		}
	}
	
	public int pop() {
		int tmp=arr[top--];
		
		if(tmp>max) {
			int tmp1=max;
			max=2*max-tmp;
			return tmp1;
		}else {
			return tmp;
		}
		
		
	}
	
	public int getMax() {
		return max;
	}

	public boolean isFull() {
		if (top == arr.length - 1)
			return true;
		return false;
	}

}
