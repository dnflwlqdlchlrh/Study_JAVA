package exam10.model.vo;

public class Circle {
	
	private final double PI = 3.14;
	private int radius = 1;
	
	public void incrementRadius() {
		radius++;
	}
	
	public void getAreaOfCircle() {
		System.out.println(PI * Math.pow(radius, 2));
	}
	
	public void getSizeOfCircle() {
		System.out.println(PI * radius * 2);
	}

}
