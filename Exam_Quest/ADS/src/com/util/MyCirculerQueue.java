package com.util;

public class MyCirculerQueue implements ICircularQueue {

	String[] arr;
	int size;
	int front;
	int rear;

	public MyCirculerQueue(int size) {

		this.arr = new String[size];
		this.front = -1;
		this.rear = -1;
		this.size = 0;
	}

	@Override
	public int size() {
		if (rear - front > 0)
			return (rear - front) + 1;
		else
			return (rear - front) + arr.length + 1;

	}

	@Override
	public boolean add(String element) {
		if (isFull()) {
			return false;
		}

		if (isEmpty()) {
			arr[++front] = element;
			rear++;
			return true;
		} else {
			rear = (rear + 1) % arr.length;
			arr[rear] = element;
			return true;
		}

	}

	private boolean isEmpty() {
		if (front == -1 || rear == -1)
			return true;
		return false;
	}

	private boolean isFull() {
		if (front == rear % arr.length + 1) {
			return true;
		}
		return false;
	}

	@Override
	public String remove() {
		if (isEmpty())
			return null;
		String s = arr[front];
		front = (front + 1) % arr.length;
		return s;
	}

	@Override
	public String toString() {

		String s = "";
		for (int i = front; i != rear; i = (i + 1) % arr.length) {
			s += arr[i] + ",";

		}
		s += arr[rear];
		return s;
	}

}
