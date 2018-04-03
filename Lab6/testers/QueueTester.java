package testers;

import implementationQueues.ArrayQueue;
import implementationQueues.SLLQueue;

public class QueueTester {

	public static void main (String[] args) {
		SLLQueue<Integer> sllQueue = new SLLQueue<Integer>();
		ArrayQueue<Integer> arrQueue = new ArrayQueue<Integer>();
		int[] list = {1, 2 ,3};
			
	
		for(Integer n: list) {
			//Enqueue for sllQueue
			sllQueue.enqueue(n);
		//Enqueue for arrQueue
			arrQueue.enqueue(n);
		}
		
		//prints the first element
		System.out.println("First element in sllQueue: " + sllQueue.first());
		System.out.println("First element in arrQueue: " + arrQueue.first());
		
		
		for(int i= 0; i < 3; i++) {
			
		System.out.println("\n Element #" + (i + 1) + " in sllQueue: " + sllQueue.dequeue());
		System.out.println(" Element #" + (i + 1) + " in arrQueue: " + arrQueue.dequeue());

		}
		
	}
}
