package exam08;

import java.util.Random;

public class Sample01 {

	public static void main(String[] args) {
		
		MethodSample ms1 = new MethodSample();
		
		// Method를 호출
		ms1.method01();
		
		int test01 = ms1.method02();
		
		int[] test02 = ms1.method03();
		
		String test03 = ms1.method04();
		
		// 같은 참조값을 사용한다.
		int[] test04 = new int[] {1, 2, 3};
		System.out.println(test04);
		ms1.method05(test04);
		
		Random rand = new Random();
		ms1.method06(rand);

	}

}
