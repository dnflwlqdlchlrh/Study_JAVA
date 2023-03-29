package exam01;

public class Child extends Parent{
	
//	public Child() {
//		super(1);
//	}
	
	public void printNumber() {
		setNumber(3);	// 자식 setNumber Method에 매개 변수 값 입력
		System.out.println("오버라이딩 결과 값 : " + getNumber());	// 9번
	}
	
	
	@Override
	public void setNumber(int number) {
		System.out.println("자식의 setNumber Method 동작 시작");	// 1번
		super.setNumber(number);	// 2번, 입력 된 값으로 부모의 setNumber로 호출
		System.out.println("자식의 setNumber Method 동작 끝"); // 8번
	}

}
