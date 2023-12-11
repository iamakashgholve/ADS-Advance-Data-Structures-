package linkedList;

import javax.management.RuntimeErrorException;

class SinglyLinkedList {///
	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	static class Node {//
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}//

	// methods of operations
	// display
	// addAtFirst
	// addAtLast
	// addAtPos

	// delFirst
	// delLast
	// delAtPos
	// delAll

	// menu
	public void menu() {
		System.out.println("Press 1 to add element at begining");
		System.out.println("Press 2 to add element at last");
		System.out.println("Press 3 to add element at position");
		System.out.println("Press 4 to delete element at begining");
		System.out.println("Press 5 to delete element at last");
		System.out.println("Press 6 to delete element at position");
		System.out.println("Press 7 to display elements");
		System.out.println("Press 8 to delete all");
		System.out.println("Press 0 to exit the menu");
	}

	// display
	public void display() {
		Node trav = head;
		// show with msg:
		System.out.println("List: ");
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	// addFirst
	public void addFirst(int val) {
		Node newNode = new Node(val);
		// spl cases: 1.isEmpty
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	// addlast
	public void addLast(int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			head = newNode;
		}
		Node trav = head;
		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
	}

	// addAtPos
	public void addAtPos(int val, int pos) {
		Node newNode = new Node(val);
		Node trav = head;
		// isempty
		if (isEmpty()) {
			head = newNode;
		}

		// pos may be at last node
		if (trav.next == null) {
			addLast(val);
		}
		// pos less than 1 or 1st
		if (pos <= 1) {
			addFirst(val);
		}

		else {
			// intermediate position
			for (int i = 1; i < pos - 1 && trav.next != null; i++) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	// delAll
	public void delAll() {
		head = null;
	}

	// delFirst
	public void delFirst() {
		if (isEmpty()) {
			throw new RuntimeException("List empty, cannot delete anything");
		}
		head = head.next;
		System.out.println("\n Deleted node at first position unless it's empty \n");
	}

	// delAtPos
	public void delAtPos(int pos) {
		Node trav = head;
		Node temp = trav;
		Node newNode = new Node();
		// if el is 1st: no need bc position may entered as 1
		
		// if el is last : no need is also deleted like above
		
//		if (trav==null) {
//			throw new RuntimeException("Position is beyond list, can not deleted");
//		}
		
		// el at pos
		for (int i = 1; i < pos; i++) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = trav.next;
	}
	
	//delLast
	public void delLast() {
		if (isEmpty()) {
			throw new RuntimeException("List is empty, can not deleted");
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node trav = head;
		Node temp = null;
		while (trav.next  != null) {
			 temp = trav;
			trav = trav.next;
		}
		temp.next = null;
		System.out.println("Last node has been deleted successfully");
		
	}

}///
