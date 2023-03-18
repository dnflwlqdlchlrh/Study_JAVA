package exam03.pack1;

public class AccessMain extends AccessParent {
	
	/*
	 * 접근 제한자
	 * 	
	 * 	public 
	 * 	: 단어 뜻 그대로 외부 클래스가 자유롭게 사용할 수 있도록 합니다.
	 * 	
	 * 	protected 
	 * 	: 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 합니다.
	 *  
	 *  private 
	 *  : 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 합니다.
	 *  
	 *  default 
	 *  : 같은 패키지에 소속된 클래스에서만 사용할 수 있도록 합니다.
	 */
	
	public int v1;
	protected int v2;
	int v3;
	private int v4;

	public void method() {
		// 해당 Class 내부에 있는 멤버 변수에 접근
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);

		/*
		 *  객체지향 프로그래밍에서는, 
		 *   부모 클래스의 멤버를 자식 클래스에게 물려줄 수 있다.
		 *  
		 *  extends(상속)
		 *   - 사실 extends가 상속의 대표적인 형태다.
		 *   - 부모의 메소드를 그대로 사용할 수 있으며,
		 *   오버라이딩 할 필요 없이 부모에 구현되있는 것을 직접 사용 가능하다.
		 *   
		 *   	예시)
		 *   	class 자식 extends 부모{
		 *   		
		 *   	}
		 */
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
