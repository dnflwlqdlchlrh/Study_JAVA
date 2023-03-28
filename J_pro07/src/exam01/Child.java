package exam01;

public class Child extends Parent{
	
//	public Child() {
//		super(1);
//	}
	
	public void printNumber() {
		setNumber(3);
	}
	
	
	@Override
	public void setNumber(int number) {
		System.out.println("자식의 setNumber Method 동작 시작");
		super.setNumber(number);
		System.out.println("자식의 setNumber Method 동작 끝");
	}

}
