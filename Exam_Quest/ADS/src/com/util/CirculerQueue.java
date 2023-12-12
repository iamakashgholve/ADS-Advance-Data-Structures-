package com.util;

import com.exception.EmptyListException;

public class CirculerQueue {

	String[] arr;
	int front;
	int rear;

	public CirculerQueue() {
		this.arr = new String[5];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(String data) {
		if(isEmpty()) {
			front=0;
			rear=0;
			arr[rear]=data;
			return;
		}else if(isFull()) {
			System.out.println("Full...");
			return;
		}else {
			rear=(rear+1)%arr.length;
			arr[rear]=data;
			
		}
		
	}
	
	
	
	public String dequeue() throws EmptyListException {
		if(isEmpty()) {
			throw new EmptyListException("List is empty...");
		}
		
		if(front==rear) {
			String element=arr[front];
			front=-1;
			rear=-1;
			return element;
		}
		
		String element=arr[front];
		front=(front+1)%arr.length;
		return element;
	}
	
	
	public void display() {
		int i=front;
		if(front==-1 && rear==-1) {
			System.out.println("Empty....");
		}else {
			System.out.println("Elements are:");
			while(i<rear) {
				System.out.print(arr[i]+"->");
				i=(i+1)%arr.length;
			}
			System.out.print(arr[rear]+"->");
			System.out.println(arr[front]);
			}
		}
	
	
	
	
	
	

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if ((rear + 1) % arr.length == front)
			return true;
		return false;
	}

}
