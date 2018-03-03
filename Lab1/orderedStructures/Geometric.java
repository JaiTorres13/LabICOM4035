package orderedStructures;

import java.security.InvalidParameterException;

import interfaces.Combinable;

public class Geometric extends Progression implements Combinable{

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

	@Override
	public boolean equals(Progression p) {
		return this.firstValue() == p.firstValue() && this.commonFactor == (p.getTerm(2) / p.firstValue()); 
	}

	@Override
	public Progression add(Progression p) {
		Progression other = new Geometric(this.firstValue() + p.firstValue(), this.commonFactor + (p.getTerm(2) / p.firstValue()));
		return other;
	}

	@Override
	public Progression substract(Progression p) {
		Progression other = new Geometric(this.firstValue() - p.firstValue(), this.commonFactor - (p.getTerm(2) / p.firstValue()));
		return other;
	}
	
}
