package sortersTesterClasses;

import java.util.Comparator;
import java.util.Random;

import interfaces.Sorter;
import sorterClasses.BubbleSortSorter;

public class BubbleSortTester {

	public static void main (String[] args) {

		Integer[] arrayInt = {5, 9, 20, 22, 20, 5, 4,13, 17, 8, 22, 1, 3, 7, 11, 9, 10} ;
		BubbleSortSorter<Integer> sorter = new BubbleSortSorter<>();
		IntegerComparator1 cmp1 = new IntegerComparator1();
		IntegerComparator2 cmp2 = new IntegerComparator2();

		System.out.println("\n\n*******************************************************");
		System.out.println("***\t\t  Sorting Using Bubble Sort\t\t\t***");
		System.out.println("*******************************************************");
		showArray("Original List: ", arrayInt );
		sorter.sort(arrayInt , cmp1);
		showArray("List Increasing: ",arrayInt );
		sorter.sort(arrayInt , cmp2);
		showArray("List Decreasing: ",arrayInt);


	}

	private static void showArray(String msg, Integer[] a) {
		System.out.print(msg); 
		for (int i=0; i<a.length; i++) 
			System.out.print("\t" + a[i]); 
		System.out.println();
	}


}
