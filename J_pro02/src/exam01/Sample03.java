package exam01;

public class Sample03 {

	public static void main(String[] args) {
		/*
		 * while 
		 * 		while(조건식) {
		 * 			반복 수행할 코드 작성
		 * 		}
		 */
		
		int i = 0;
		while(i < 5) {
			System.out.println("i : " + i);
			i++;
		}
		
		System.out.println("-------------");
		
		/*
		 * do ... while 
		 * 		do {
	 	 *			 반복 수행할 코드 작성
		 * 		} while(조건식);
		 * 
		 * 조건에 따라 반복을 계속할지를 결정할 때 사용하는 것은 while 문과 동일
		 * 다만, 무조건 중괄호 {} 블럭을 한번 실행하고, 조건을 검사하여 반복을 결정
		 */
		
		i = 0;
		do {
			System.out.println("i : " + i);
			i++;
		} while(i < 5);
		
		System.out.println("-------------");
		
		/*
		 * break 문
		 * 	- 반복문을 통해 명령문을 반복해서 수행하다보면 프로그램의 흐름상 특정 조건을 만족할 때, 
		 *  더 이상 반복문을 수행하지 않고 그 즉시 해당 반복문을 빠져나가야 할 경우가 생깁니다.
		 *  - 이러한 경우에는 break 키워드를 사용하여 반복 조건에 상관없이 가장 가까운 
		 *  반복문을 즉시 탈출할 수 있습니다.
		 * 
		 *  continue 문
		 *   - continue 키워드는 해당 루프만을 즉시 종료하고 다음 루프를 실행시킵니다.
		 *   -  continue 키워드는 해당 키워드 바로 다음 명령문부터 해당 반복문의 마지막 명령문까지를 모두 건너뛰고 
		 *   바로 다음 반복을 실행하는 것입니다.
		 */
		i = 0;
		while(i < 10) {
			i++;
			if(i % 3 == 0) {
				System.out.println("i : " + i);
			} else {
				continue;
			}
			System.out.println("continue 가 되면 이 출력은 동작 안함");
		}
	}
}
