package com.util;

import com.exception.EmptyQueueException;

public class Queue {

	private int head;
	private int tail;
	private int[] arr;

	public Queue() {
		head = -1;
		tail = -1;
		arr = new int[5];

	}

	public void enqueue(int data) {
		if (isFull()) {
			int[] tmp = new int[arr.length * 2];
			for (int i = 0; i <= tail; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;
		}
		if(isEmpty())
			head++;
		arr[++tail] = data;
	}

	public int dequeue() throws EmptyQueueException {
		if (isEmpty()) {
			throw new EmptyQueueException("Queue is empty, can't dequeue elemet!!!!!");
		}
		return arr[head++];
	}

	public boolean isEmpty() {
		if (tail == -1)
			return true;
		return false;
	}

	private boolean isFull() {
		if (tail == arr.length - 1)
			return true;
		return false;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Queue is empty....");
		System.out.print("Head->");
		for(int i=head;i<=tail;i++) {
			System.out.print(arr[i]+"->");
		}
		System.out.print("Tail");
		System.out.println();
	}
}
