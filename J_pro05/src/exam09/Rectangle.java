package exam09;

public class Rectangle {
	
	public int area(int width) {
		return (int) Math.pow(width, 2);
	}
	
	public int area(int width, int height) {
		return width * height;
	}
	
	public int round(int width, int height) {
		return (width * height) * 2;
	}

}
