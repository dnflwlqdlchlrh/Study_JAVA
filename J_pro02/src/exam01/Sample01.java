package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Sample01 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 1 ~ 10 까지의 누적합을 구하시오.
		 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
		 */
		int tot = 0;
		for(int i = 1; i <= 10; i++) {
			tot += i; // 복합 할당 연산
			// tot = tot + i;
		}
		System.out.println("1 ~ 10까지의 누적 값 : " + tot);
		
		/*
		 * 사용자가 입력한 정수 값에 해당하는 구구단을 출력하시오
		 */
		
		System.out.print("정수 값 입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num1, i, num1 * i);
		}
		
		/*
		 * 구구단을 출력할 때 한 주에 3개의 결과가 출력되도록 하시오.
		 */
		System.out.print("정수 값 입력 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\t", num2, i, num2 * i);
			cnt++;
			if(cnt == 3) {
				System.out.print("\n");
				cnt = 0;
			}
		}
	}
}
