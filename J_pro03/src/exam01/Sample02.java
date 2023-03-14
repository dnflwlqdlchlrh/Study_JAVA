package exam01;

public class Sample02 {

	public static void main(String[] args) {

		/*
		 * 배열의 크기가 10인 배열을 선언하고 10 ~ 1 까지의 값으로 초기화 한다
		 */
		int[] arr1 = new int[10];

		int N1 = 10;
		for (int i = 0; i < 10; i++) {
			arr1[i] = N1;
			N1--;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> %d\n", i, arr1[i]);
		}
		
		System.out.println("--------------");
		
		/*
		 * 배열의 크기가 10인 배열을 선언하고 2 부터 시작하여 짝수 값에 해당하는 값으로 초기화 하도록 한다.
		 */
		int[] arr2 = new int[10];

		int N2 = 2;
		for (int i = 0; i < 10; i++) {
			arr2[i] = N2;
			N2 += 2;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("arr2[%d] -> %d\n", i, arr2[i]);
		}
		
		System.out.println("--------------");
		
		/*
		 * 배열의 크기가 5인 실수 배열을 선언하고 1 부터 시작하여 0.5 씩 증가된 값으로 초기화 하도록 한다.
		 */
		double[] arr3 = new double[5];

		double N3 = 1;
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = N3;
			N3 += 0.5;
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.printf("arr3[%d] -> %.1f\n", i, arr3[i]);
		}

		System.out.println("--------------");
		
		/*
		 * 배열의 크기가 5인 문자 배열을 선언하고 'A' ~ 'E' 까지의 문자 값으로 초기화 하도록 한다.
		 */
		char[] arr4 = new char[5];
		
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = (char)('A' + i);
		}
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.printf("arr4[%d] -> %c\n", i, arr4[i]);
		}

	}

}
