package exam01;

public class Parent {
	
	private int number = 1;
	
	public Parent() {
		
	}
	
	public Parent(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		System.out.println("부모의 setNumber Method 동작 시작");
		this.number = number;
		System.out.println("부모의 setNumber Method 동작 끝");
	}
	
	
}
