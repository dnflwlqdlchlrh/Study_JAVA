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
		System.out.println("오버라이딩 이전 부모 Class의 멤버 변수 값 : " + this.number);	// 3번
		System.out.println("부모의 setNumber Method 동작 시작");	// 4번
		this.number = number;	// 5번
		System.out.println("오버라이딩 이후 부모 Class의 멤버 변수 값 : " + this.number);	// 6번
		System.out.println("부모의 setNumber Method 동작 끝"); // 7번
	}
	
	
}
