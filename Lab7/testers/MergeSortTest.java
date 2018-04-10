package testers;

import java.util.ArrayList;

import recursionExamples.MergeSort;

public class MergeSortTest {
	public static void main(String[] args) {
		

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(2);
		myList.add(1);
		myList.add(10);
		myList.add(6);
		myList.add(3);
		
		System.out.println(myList);
		MergeSort.sort(myList);
		System.out.println(myList);
		
		}
}
