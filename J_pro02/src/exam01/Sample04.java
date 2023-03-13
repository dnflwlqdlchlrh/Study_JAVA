package exam01;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * 문자열에서 문자만 추출하는 방법
		 */
		String str = "Hello Java Programming";

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (str.charAt(i)== ' ') {
				System.out.print("\n");
			}
		}
		System.out.println("\n------------------------");
		
		// 1. 다음의 문자열에서 대문자의 수와 소문자의 수를 구하시오.
		int cnt1 = 0, cnt2 = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				cnt1++;
			} else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cnt2++;
			}
		}
		System.out.printf("대문자 수 : %d\n소문자 수 : %d", cnt1, cnt2);

		System.out.println("\n------------------------");
		
		//2. 다음의 문자열에서 단어의 수를 구하시오.(단어는 공백을 기준으로 구분하여 보면 된다.)
		boolean sStart = false;
		boolean sEnd = false;
		int wordCount = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sStart = true;
			} else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sStart = true;
			} else if(str.charAt(i) == ' ') {
				sEnd = true;
			}
			
			if(sStart && sEnd) {
				wordCount++;
				sStart = false;
				sEnd = false;
			}
			
			if(i == str.length() - 1) {
				if(sStart) {
					wordCount++;
				}
			}
		}
		System.out.println("단어 수 : " + wordCount);
	}
}
