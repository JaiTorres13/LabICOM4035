package orderedStructures;

import java.security.InvalidParameterException;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if (firstVal == false) {
			throw new InvalidParameterException("First Value is not executed previously");  
		}
		current = current * commonFactor; 
		return current;
	}

	public String toString() {
		return "Geom(" + firstValue() + ", " + commonFactor + ")" ;
	}
	
	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException {
		return firstValue() * Math.pow(commonFactor, n - 1);
	}
	
}
