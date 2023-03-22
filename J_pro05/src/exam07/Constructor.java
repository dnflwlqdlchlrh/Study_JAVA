package exam07;

public class Constructor {

	public int num1;
	public int num2;
	public int num3;
	public int num4;

	/*
	 * 생성자 규칙 
	 * - 생성자의 선언은 Method 선언과 유사하나 반환 값이 없다. 
	 * - 생성자 이름은 클래스 이름과 동일하게 생성해야 한다. 
	 * - 생성자는 반드시 생성해야 하는 것은 아니다. 
	 *  • JVM에서 기본적으로 생성자를 생성 
	 *  • 사용자가 확인할 수 없는 이유는 생략이 되어 있기 때문이다. 
	 *  • 객체를 생성후 매개변수를 입력하게 된다면, 매개변수를 필요로 하는 생성자를 생성해야 한다. 
	 *  • 매개변수가 있는 생성자를 만들 때는 반드시 기본 생성자도 생성해야 한다.
	 * 
	 * 
	 */
	public Constructor() {

	}

	// 매개변수가 있는 생성자
	public Constructor(int num1) {
		// 전달 받은 매개변수 값을 이용하여 초기화
		this.num1 = num1;
	}

	/*
	 * 오버로딩(Overloading) 
	 * - 하나의 Class 내부에 동일한 Method를 여러 개 작성하는 기법 
	 * • Method의 이름이 같아야 한다. 
	 * • 매개변수의 개수가 다르던지, 매개변수의 타입이 달라야 한다.
	 */
	
	public Constructor(int num1, int num2) {
		this(num1);
		this.num2 = num2;
	}

	public Constructor(int num1, int num2, int num3) {
		this(num1, num2);
		this.num3 = num3;
	}

	public Constructor(int num1, int num2, int num3, int num4) {
		this(num1, num2, num3);
		this.num4 = num4;
	}

}
