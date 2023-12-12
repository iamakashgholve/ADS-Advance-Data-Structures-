package com.util;

import java.util.List;

public class SortedList<T extends Comparable<T>> {

	Node head;
	T data;

	class Node {

		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public void add(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (head.next == null) {
			if (newNode.data.compareTo(head.data) <= -1) {
				newNode.next = head;
				head = newNode;
				return;
			} else {
				head.next = newNode;
				return;
			}
		}

		if (newNode.data.compareTo(head.data) < 0) {
			newNode.next = head;
			head = newNode;
			return;
		} else {
			Node prev = head;
			Node curr = head.next;
			while (curr != null) {
				if (curr.data.compareTo(newNode.data) > 0) {
					prev.next = newNode;
					newNode.next = curr;
					return;
				}
				prev = prev.next;
				curr = curr.next;
			}

			if (prev.next == null) {
				prev.next = newNode;
				return;
			}

		}

	}

	public String toString() {
		if (head == null) {
			return "Empty List!!!";
		} else {
			String s = "";
			Node curr = head;
			while (curr != null) {
				s += curr.data;
				s += ",";
				curr = curr.next;
			}
			s+="null";
			return s;
		}

	}

	public void addAll(List<T> list) {
		for (T t : list) {
			add(t);
		}
	}

}
