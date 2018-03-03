package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		Progression p1;
		
		
		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Equals Method(Arith):"); 
		p = new Arithmetic(4, 3); 
		p1 = new Arithmetic(4, 3); 
		System.out.println(p.equals(p1));
		
		System.out.println("\n\n\nTesting Equals Method(Geom):"); 
		p = new Geometric(2, 3); 
		p1 = new Geometric(2, 3); 
		System.out.println(p.equals(p1));
		
		System.out.println("\n\n\nTesting Equals Method(Fibo):"); 
		p = new Fibonacci(); 
		p1 = new Fibonacci();
		p.printAllTerms(2);
		p1.printAllTerms(2);
		System.out.println(p.equals(p1));
	}

}
