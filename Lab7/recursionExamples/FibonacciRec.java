package recursionExamples;


public class FibonacciRec {

public static void main(String[] args) {
		//tester
	long startTime = System.nanoTime();  // Measure system’s clock time before.
		fib1(50);
	long endTime = System.nanoTime(); 
	 long elapsedTime = endTime - startTime;
	 System.out.println(elapsedTime);
	 long startTime1 = System.nanoTime();  // Measure system’s clock time before.
		fib(50);
	long endTime1 = System.nanoTime(); 
	 long elapsedTime1 = endTime1 - startTime1;
	 System.out.println(elapsedTime1);
		
		
	}
	public static long fib(int n) { 
		   if (n == 1 || n == 0) return 1; 
		   else return fib(n-1) + fib(n-2); 
		} 
	
	public static Pair<Integer> fib1(int n) {
		   if (n==0 || n==1) return new Pair<>(1,1); 
		   Pair<Integer> p = fib1(n-1); 
		   return new Pair<>(p.getFirst() + p.second(), p.getFirst());
	}
}
