package exam08;

import java.util.Random;

public class MethodSample {
	
	public void method01() {
		/*
		 *  결과를 반환 후 코드를 종료한다.
		 *   - 결과 반환은 호출한 인스턴스를 통해 반환하게 된다.
		 */
		System.out.println("반환 타입은 void이고, 매개변수가 없는 Method");
	}

	public int method02() {
		System.out.println("반환 타입은 int(기본 자료형)이고, 매개변수가 없는 Method");
		// 반환(return)해야 할 값이 없을 경우에는 '0'으로 처리하면 된다.
		return 0;
	}
	
	public int[] method03() {
		int[] arr = new int[5];
		System.out.println("반환 타입은 int[](배열)이고, 매개변수가 없는 Method");
		return arr;
//		return을 통해 배열을 반환해도 된다.
//		return new int[5];
	}
	
	public String method04() {
		String str = new String();
		System.out.println("반환 타입은 String(클래스/객체)이고, 매개변수가 없는 Method");
		return str;
	}
	
	public void method05(int[] arr) {
		System.out.println("반환 타입은 void이고, 매개변수가 배열인 Method");
		System.out.println(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
	
	public void method06(Random rand) {
		System.out.println("반환 타입은 void이고, 매개변수가 클래스(객체)인 Method");
		System.out.println("Random 값 : " + rand.nextInt(10));
	}
}
