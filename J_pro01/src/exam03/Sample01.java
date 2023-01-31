package exam03;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable) : 값을 저장하기 위한 공간(namespace)
		 * 공간에 저장된 값은 언제든지 바뀔 수 있다.
		 * 사람 입장에서 값은 정수, 실수, 문자열 등의 값을 지칭을 함.
		 * 기계 입장에서 값은 01010011010111 (2진수 값 - bit 값)이다.
		 * 
		 * 저장된 값은 필요하면 언제든 "재사용" 할 수 있다.
		 * 값이 긴 경우 짧은 변수명으로 사용할 수 있다.
		 * 값이 변경될 경우 변수에 저장될 값만 변경하면 되기 때문에 유지 보수가 좋다.
		 * 
		 * 변수는 메모리(RAM)에 값을 저장하기 때문에 프로그램이 동작하는 동안에만 사용된다.
		 * 프로그램이 종료되면 변수에 저장된 값은 사라진다.
		 */
		
		/*
		 * 1. 변수 선언 형식
		 * 			ex) 자료형 변수명;
		 * 
		 * 2. 변수 선언 후 즉시 값을 지정하는 형식
		 * 			ex) 자료형 변수명 = 값;
		 * 
		 * 3. 변수 선언 후 나중에 값을 지정하는 형식
		 * 			ex) 자료형 변수명;
		 * 				   변수명 = 값;
		 */

		// 1. 변수 선언 형식
		int n1;
		
		// 2. 변수 선언 후 즉시 값을 지정하는 형식
		int n2 = 0;
		
		// 3. 변수 선언 후 나중에 값을 지정하는 형식
		int n3;
		n3 = 0;
		
		/*
		 * 자료형 : 변수 공간에 저장할 값의 종류(Type)를 지정하기 위해 사용한다.
		 * 		boolean : 참, 거짓에 해당하는 논리 값 -> true & false로 사용
		 * 		char : 문자 값, 문자 값을 저장할 때 반드시 작은 따옴표를 사용 -> ''
		 * 		String : 문자열 값, 문자열 값을 저장할 때 반드시 큰 따옴표를 사용 -> ""
		 * 		byte : 정수 값 저장을 위해 사용, 타입별로 저장 크기가 다름(1Byte -> 8bit)
		 * 		short : 정수 값 저장을 위해 사용, 타입별로 저장 크기 다름(1Byte -> 16bit)
		 * 		int : 정수 값 저장을 위해 사용, 타입별로 저장 크기 다름(1Byte -> 32bit)
		 * 		long : 정수 값 저장을 위해 사용, 타입별로 저장 크기 다름(1Byte -> 64bit)
		 * 		float : 실수 값, 타입별로 저장 크기 다름(4Byte)
		 * 		double : 실수 값, 타입별로 저장 크기 다름(8Byte)
		 */
		
		
		boolean b1 = true;		
		boolean b2 = false;
		
		char c1 = 'a';
		String s1 = "a";
		
		byte b3 = 1;
		short s2 = 2;
		int i1 = 3;
		long l1 = 4;
		long l2 = 4L;
		
		float f1 = 5.0f;
		double d1 = 6.0;
		
	}

}
