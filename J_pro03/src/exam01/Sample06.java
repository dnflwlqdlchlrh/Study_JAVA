package exam01;

import java.util.Arrays;

public class Sample06 {

	public static void main(String[] args) {
		
		/*
		 * 자바에서 제공하는 기능으로 배열의 깊은 복사
		 */
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		
		
		// 자바의 기본 기능을 사용한 깊은 복사
		int[] arr3 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		
		
		arr1[0] = 10;
		System.out.printf("arr1[0] -> %d\narr3[0] -> %d\n", arr1[0], arr3[0]);
		
		System.out.println("------------");
		
		// Arrays 객체를 사용한 깊은 복사
		int[] arr4 = Arrays.copyOf(arr1, arr1.length);
		arr1[0] = 20;
		System.out.printf("arr1[0] -> %d\narr4[0] -> %d\n", arr1[0], arr4[0]);
		
		System.out.println("arr4 -> " + Arrays.toString(arr4));
		
		System.out.println("------------");
		
		// .clone() 을 사용한 깊은 복사
		int[] arr5 = arr1.clone();
		
		arr1[0] = 15;
		System.out.printf("arr1[0] -> %d\narr5[0] -> %d\n", arr1[0], arr5[0]);
		

	}

}
