package orderedStructures;

import java.security.InvalidParameterException;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException{
		if (firstVal == false) {
			throw new InvalidParameterException("First Value is not executed previously");  
		}
		current = current + commonDifference; 
		return current;
	}
	
	public String toString() {
		return "Arith(" + firstValue() + ", " + commonDifference + ")" ;
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException {
		return firstValue() + commonDifference*(n - 1);
	}

}
 