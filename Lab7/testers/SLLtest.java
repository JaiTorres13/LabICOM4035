package testers;

import java.util.ArrayList;

import recursionExamples.Pair;
import recursionExamples.SLL;


public class SLLtest {

	public static void main(String[] args) {
		
	
		SLL<Integer> list = new SLL<Integer>();
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(3);
		list.addFirst(7);
		list.addFirst(1);
		list.addFirst(8);
		list.addFirst(4);
		list.addFirst(3);
		
		
		System.out.println("original list: " + list.toString());
		//test 2
		list.reverse();
		System.out.println("reverse: " + list.toString());

		SLL<Integer> list1= new SLL<Integer>();
		
		list1.addFirst(3);
		list1.addFirst(4);
		list1.addFirst(5);
		list1.addFirst(3);
		list1.addFirst(7);
		list1.addFirst(1);
		list1.addFirst(8);
		list1.addFirst(4);
		list1.addFirst(3);
		
		
		
		System.out.println("List after using ConsecutiveIncreasingPairs method:");
		System.out.print(list1.consecutiveIncreasingPairs());
	
	}
}
