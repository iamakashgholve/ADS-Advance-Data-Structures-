package com.util;

import com.exception.EmptyLinkedListException;
import com.exception.InvalidIndexException;

public class CustomLinkedList {
	Node head;
	
	class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head=newNode;
			return;
		}
		
		Node curr =head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		
		curr.next=newNode;
	}

	private boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}
	
	public void list() throws EmptyLinkedListException {
		if(head==null) {
			throw new EmptyLinkedListException("Linked list is empty!!!");
		}
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}

	public int getSize() {
		if(head==null) {
			return 0;
		}
		int count=0;
		Node curr=head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		return count;
	}
	
	public void add(int data , int index) throws InvalidIndexException {
		Node newNode = new Node(data);
		if(getSize()+1<index) {
			throw new InvalidIndexException("Invalid Index to add element, List have only "+getSize()+ " elements");
		}
		if(index==1) {
			newNode.next=head;
			head=newNode;
		}else {
			int count=1;
			Node curr=head;
			while(curr!= null && count+1<index) {
				count++;
				curr=curr.next;
			}
			Node tmp=curr.next;
			curr.next=newNode;
			newNode.next=tmp;
		}
		
	}
	
	public void reverse() {
		if(head==null || head.next==null) {
			return;
		}
		
		Node curr=head;
		Node prev=null;
		while(curr!=null) {
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	public void remove(int data) throws EmptyLinkedListException {
		if(head==null) {
			throw new EmptyLinkedListException("List is Empty!!!");
		}
		
		while(head!=null) {
			if(head.data==data)
				head=head.next;
			else
				break;
		}
		Node curr =head;
		while(curr.next   !=null) {
			if(curr.next.data==data) {
				curr.next=curr.next.next;
			}else {
				curr=curr.next;
			}
			
		}
	}
	
}
