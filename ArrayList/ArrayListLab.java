import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListLab {

	public static void main(String args[]) {
		 boolean quit = false;
		 int command;
		 int num;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<Integer>();
		do {
			System.out.println("Welcome to ArrayLists, Command List:");
			System.out.println("1. Add Number X to end of list");
			System.out.println("2. Remove All Numbers Y from list");
			System.out.println("3. Print size of list");
			System.out.println("4. If you want it to end.");
			System.out.println("Enter a command & Number:" );
			 command = sc.nextInt();
			
			switch(command) {
			case 1:
				System.out.println("Enter a number (X) to the list: ");
				myList.add(myList.size(), sc.nextInt());
				break;
			case 2:
				System.out.println("Enter a number (Y) to remove from the list: ");
				num = sc.nextInt();
				for(int i = 0; i < myList.size(); i++) {
					if( myList.get(i) == num) {
						myList.remove(i);
						i-- ;
					}
					
				}
				break;
			case 3:
				System.out.println("The size of the ArrayList is: " + myList.size());
				break;
			case 4:
				System.out.println("Thanks for playing!");
				break;
			default:
				System.out.println("Invalid Command. Try again!");
			}
			System.out.println("");
		} while (command != 4);
		sc.close();
	}
}
