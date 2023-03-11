package exam01;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 중첩 반복문
		 */
		for(int i = 1; i <= 3; i++) {
			System.out.println("i가 1번 반복할 때마다");
			for(int j = 1; j <= 3; j++) {
				System.out.println("j의 반복은 3번씩 총 9번 출력된다.");
			}
		}
		System.out.println("--------------------");
		
		/*
		 * 중첩 반복문을 사용해 구구단을 만들어 보시오.
		 */
		int cnt = 0;
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
				}
			System.out.print("\n");
			}
		System.out.println("--------------------");
		/*
		 * 아래와 같은 형태로 출력되게 만드시오.
		 * 1
		 * 2	3
		 * 4	5	6
		 * 7	8	9	10
		 * 11	12	13	14	15
		 */
		
		int num3 = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(++num3 + "\t");
			}
			System.out.print("\n");
		}
		
		
		}
	}

