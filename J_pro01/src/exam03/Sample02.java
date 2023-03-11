package exam03;

public class Sample02 {

	public static void main(String[] args) {
		
		/*
		 * 지역 변수(local variable)를 사용할 때 주의사항
		 * 		지역 변수를 사용할 때 반드시 초기화가 되어 있어야 한다.
		 */
		int i1;	// 선언만 한 상태
		
		i1 = 1;	// 초기화
		
		i1 = 2; // 값을 바꾸는 할당(Allocation)
		
		System.out.println(i1);
		
		
		/*
		 * 상수 : 변하지 않는 값을 의미한다.
		 * 자바 프로그램에서 한 번 초기화를 한 후에는 변경되지 않는다.
		 */
		
		// final 예약어를 사용하면 변수에 저장된 값은 상수가 된다.
		final int number ;
		number = 2;
		
		/*
		 * 변수명 명명 규칙
		 * 	 1. 한글도 가능하나 가급적 지양 O
		 *  2. 영문자는 대소문자 구분하여 사용
		 *  3. 띄어쓰기는 사용할 수 없고 _(언더바)를 사용
		 *  4. 숫자는 영문자 뒤에서 사용, 숫자를 먼저 작명 X
		 *  5. 예약어를 사용 X
		 *  6. 자바에서는 $ 특수 문자도 사용할 수 있다.
		 *  
		 *  권고 사항
		 *  	상수명을 작명할 때 반드시 대문자로만 작명할 것.
		 */
		
		

	}

}