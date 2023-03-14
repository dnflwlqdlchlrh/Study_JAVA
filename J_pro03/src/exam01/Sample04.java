package exam01;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * 변수에 저장된 값을 복사
		 * 	문제 없이 사용 가능
		 */
		
		int n1 = 10;
		int n2 = n1;	// n1 에 저장된 값을 n2로 복사
		
		System.out.printf("n1 -> %d, n2 -> %d\n", n1, n2);
		
		n1 += 1;
		n2 += 2;
		
		System.out.printf("n1 -> %d, n2 -> %d\n", n1, n2);
		
		System.out.println("-----------------");
		/*
		 * 배열 복사
		 * 	- 얕은 복사 : '실제 값'을 새로운 메모리 공간에 복사하는 것을 의미
		 *  - 깊은 복사 : '주소 값'을 복사한다는 의미
		 */
		
		// 얕은 복사
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		
		System.out.printf("arr1[0] -> %d, arr2[0] -> %d\n", arr1[0], arr2[0]);
		
		arr1[0] += 1;
		arr2[0] += 2;
		
		System.out.printf("arr1[0] -> %d, arr2[0] -> %d\n", arr1[0], arr2[0]);
		
		System.out.println("-----------------");
		
		// 깊은 복사
		int[] arr3 = new int[] {1, 2, 3, 4, 5};
		int[] arr4 = new int[5];
		
		arr4[0] = arr3[0];
		arr4[1] = arr3[1];
		arr4[2] = arr3[2];
		arr4[3] = arr3[3];
		arr4[4] = arr3[4];
		
		System.out.printf("arr3[0] -> %d, arr4[0] -> %d\n", arr3[0], arr4[0]);
		
		arr3[0] += 1;
		arr4[0] += 2;
		
		System.out.printf("arr3[0] -> %d, arr4[0] -> %d\n", arr3[0], arr4[0]);
		
		
		

	}
}
