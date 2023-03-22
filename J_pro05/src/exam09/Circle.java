package exam09;

public class Circle {
	public final static double PI = Math.PI;
	
	public double area(double radius) {
		return PI * radius * radius;
		
	}
	
	public double round(double radius) {
		double result;
		result = PI * radius * 2;
		return result;
	}

}
