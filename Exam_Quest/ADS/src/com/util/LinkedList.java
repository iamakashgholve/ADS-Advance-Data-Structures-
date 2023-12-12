package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkedList {

	private Node head;

	public LinkedList() {
		super();
		this.head = null;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	public String addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;

		}
		return "Node added Successfully";
	}

	public Node removeNodeFormLast() {
		if (head == null) {
			return null;
		} else if (head.next == null) {
			Node temp = head;
			head = null;
			return temp;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		Node tmp = curr.next;
		curr.next = null;
		return tmp;
	}

	public void addAtIndex(int data, int index) {
		Node newNode = new Node(data);
		if (index == 0) {
			Node tmp = head;
			head = newNode;
			newNode.next = tmp;
		} else {

			int count = 1;
			Node curr = head;
			while (count < index && curr != null) {
				curr = curr.next;
				count++;
			}
//	

			Node tmp = curr.next;
			curr.next = newNode;
			newNode.next = tmp;
		}

	}

	public void removeAllOccurances(int val) {
		while (head.data == val) {
			head = head.next;
		}

		Node prev = head;
		Node curr = head.next;
		while (curr != null) {
			if (curr.data == val) {
				curr = curr.next;
				prev.next = curr;
			} else {

				prev = curr;
				curr = curr.next;
			}

		}

	}

	public Node removeNodeFromIndex(int index) {
		if (index == 0) {
			Node tmp = head;
			head = head.next;
			return tmp;
		} else {
			int count = 1;
			Node curr = head;
			while (count < index && curr.next != null) {
				curr = curr.next;
				count++;
			}
			Node tmp = curr.next;
			curr.next = curr.next.next;
			return tmp;
		}
	}

	public Node reverseList() {
		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null;

		while (head != null) {
			Node next = head.next;
			head.next = prev;
			prev = head;
			head = next;

		}
		head = prev;
		return head;
	}

	public void display() {
		Node tmp = head;

		while (tmp != null) {
			System.out.print(tmp.data + "->");
			tmp = tmp.next;
		}
		System.out.println("null");

	}

	public Node getFirst() {
		return head;
	}

	public int size() {
		if (head == null) {
			return 0;

		}
		Node curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	public void sort() {
		List<Integer> list = new ArrayList<Integer>();

		while (head != null) {
			list.add(head.data);
			head = head.next;
		}

		Collections.sort(list);
		LinkedList temp = new LinkedList();
		for (int i = 0; i < list.size(); i++) {
			temp.addNode(list.get(i));
		}

		head = temp.getFirst();
		temp = null;
	}

	public void addAll(List<Integer> list) {
		Node curr = head;

//		while (curr != null) {
//			curr = curr.next;
//		}
		if (head == null) {
			curr = new Node(list.get(0));
			head = curr;
			for (int i = 1; i < list.size(); i++) {
				Node tmp = new Node(list.get(i));
				curr.next = tmp;
				curr = curr.next;
			}
		} else {
			while (curr.next != null) {
				curr = curr.next;
			}
			for (int i = 1; i < list.size(); i++) {
				Node tmp = new Node(list.get(i));
				curr.next = tmp;
				curr = curr.next;
			}

		}

	}
	
	public String toString() {
		Node curr = head;
		String ans="";
		if(curr==null) {
			return "Empty List";
		}
		while(curr!=null) {
			ans+=curr.data;
			if(curr.next!=null)
				ans+=",";
			curr=curr.next;
		}
		return ans;
	}

}
