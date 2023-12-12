package com.util;

import com.exception.EmptyListException;
import com.exception.LinkedListFullException;

public class CirculerLinkedList {
//	static final int size=5;
	Node head;
	Node tail;
//	int count=0;
	

	class Node {
		Node next;
		int data;

		public Node(int data) {
			this.next = null;
			this.data = data;
		}

	}
	
	
	public void addNode(int data) throws LinkedListFullException {
		Node newNode=new Node(data);
		
//		if(isFull()) {
//			
//				throw new LinkedListFullException("Linked List is full...");
//		}
		if(head==null) {
			head=tail=newNode;
			tail.next=head;
//			count++;
		} else /* if(count<size) */{
			tail.next=newNode;
			tail=tail.next;
			tail.next=head;	
//			count++;
		}
	}
	
	public Node removeNode(int data) throws EmptyListException {
		Node newNode=new Node(data);
		Node tmp;
		if((head==null)) {
			throw new EmptyListException("Can't remove element list is empty!!!!!");
		}
		if(head.data==newNode.data ) {
			if(head!=head.next) {
			 tmp=head;
			head=head.next;
			tail.next=head;
//			count--;
			return tmp;
			}
			else {
				head=null;
				tail=null;
				return null;
			}
		}else {
			
			Node curr=head;
			while(curr.next.data!=newNode.data) {
				curr=curr.next;
			}
			tmp=curr.next;
			curr.next=curr.next.next;
//			count--;
			return tmp;
		}
	}
	
	
	public void display() {
		Node curr=head;
		if(curr==null) {
			System.out.println("List is empty!!!");
		}
		else {
			do {
				System.out.print(curr.data+"->");
				curr=curr.next;
			}while(head!=curr);
			System.out.print(curr.data);
			System.out.println();
		}
		
		
	}

//
//	private boolean isFull() {
//		if(count==size)
//			return true;
//		return false;
//	}
//	
	
	

}
