package orderedStructures;

import java.security.InvalidParameterException;

import interfaces.Combinable;

public class Arithmetic extends Progression implements Combinable {
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
	
	

	@Override
	public Progression add(Progression p) {
		Progression other = new Arithmetic(this.firstValue() + p.firstValue(), this.commonDifference + (p.getTerm(2) - p.firstValue()));
		return other;
	}

	@Override
	public Progression substract(Progression p) {
		Progression other = new Arithmetic(this.firstValue() - p.firstValue(), this.commonDifference - (p.getTerm(2) - p.firstValue()));
		return other;
	}

	@Override
	public boolean equals(Progression p) {
		return this.firstValue() == p.firstValue() && this.commonDifference == (p.getTerm(2) - p.firstValue()); 
			
	}
	

}
 