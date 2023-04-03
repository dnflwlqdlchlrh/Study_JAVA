package exam01;

import java.util.StringTokenizer;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * StringTokenizer
		 *  - String Class에서 제공하는 split() Method와 유사한 기능을 제공하는 Class
		 */
		
		String phone = "010-1234-5678";
		StringTokenizer st = new StringTokenizer(phone, "-");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
