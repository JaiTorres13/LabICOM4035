package PriorityQueueLab_Student.src.testerClasses;

import priorityQueue1.HeapListPriorityQueue;
import priorityQueue1.HeapPriorityQueue;
import priorityQueue1.SortedListPriorityQueue;
import priorityQueue1.UnsortedListPriorityQueue;
import priorityQueueInterfaces1.PriorityQueue;

public class PriorityQueueTester3 {

	public static void main(String[] args) {
		String[] arr = {"barrio", "pepe", "julia", "maria", "oliva", "meme", "parada", "baile", "enjendro", 
		         "vagabundo", "nota", "tienda", "zapato", "caballo", "cafe", "diodo", "multiplica"}; 

		PriorityQueue<String, String> pq; 
		
		pq = new UnsortedListPriorityQueue<String, String>(new StringComparator1());    // 1
//		pq = new SortedListPriorityQueue<String, String>(new StringComparator1());    // 2
//		pq = new HeapListPriorityQueue<String, String>(new StringComparator1());      // 3
//		pq = new HeapPriorityQueue<String, String>(new StringComparator1());          // 4

		TesterUtils.displayArray("Content of the array before ", arr); 
		TesterUtils.what(arr, pq); 
		TesterUtils.displayArray("Content of the array after ", arr); 
	}

}
