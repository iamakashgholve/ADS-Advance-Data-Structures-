package linkedList;

import java.util.Scanner;

class SinglyLinkedListMain {
	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);

		// instantiation
		SinglyLinkedList singlist = new SinglyLinkedList();

		// fields: choice, val, pos, exit
		int val;
		int pos;
		boolean exit = false;

		int choice;
		// try
	try {
		// loop
		while (!exit) {
			singlist.menu();
			System.out.println(" Enter your choice:(0-9) ");
			choice = sc.nextInt();
			// switch cases
			switch (choice) {
			case 1:
				System.out.println(" Enter data of element to add at First position ");
				val = sc.nextInt();
				singlist.addFirst(val);
				break;

			case 2:
				System.out.println(" Enter data of element to add at Last ");
				val = sc.nextInt();
				singlist.addLast(val);
				break;
			case 3:
				System.out.println(" Enter position to add element ");
				pos = sc.nextInt();
				System.out.println(" Enter val of element ");
				val = sc.nextInt();
				singlist.addAtPos(val, pos);
				break;
			case 4://				
				singlist.delFirst();
				
				break;
			case 5:
				singlist.delLast();
				break;
			case 6:
				System.out.println("Enter positoion of an element to be deleted: ");
				pos = sc.nextInt();
				singlist.delAtPos(pos);
				
				break;
			case 7:
				singlist.display();
				break;
			case 8:
				singlist.delAll();
				System.out.println("\n Successfully Deleted the whole list\n");
				
				break;
			case 9:
				singlist.delLast();
				break;
			case 0:
				exit = true;
				System.out.println("Exiting the menu...");
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		}
		// catch

	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}

}///
