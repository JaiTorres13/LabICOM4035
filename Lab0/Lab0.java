import java.lang.Math;
import java.util.Scanner;

public class Lab0{
public static void main (String args[]){
	
	double area;
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();
	area = Math.pow(radius, 2) * Math.PI;
	System.out.println("The area is: " + area);
	sc.close();
}
}
