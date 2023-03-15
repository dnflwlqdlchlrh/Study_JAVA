package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) throws IOException {
		/*
		 * 사용자가 입력한 영문자열에서 입력된 문자의 수를 구하는 코드를 작성하시오. 1. 영문자를 제외한 다른 문자는 무시한다. 2. 영문자의
		 * 대/소문자를 구분하지 않고 문자 수를 구한다.
		 * 
		 * 
		 * 예제 영문자 입력 : hello java programming
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String text = br.readLine();

		int[] result = new int[26];

		for (int i = 0; i < text.length(); i++) {
			int idx = 0;
			char c = text.charAt(i);

			if (c >= 65 && c <= 90) {
				idx = c - 65;
				result[idx] += 1;
			} else if (c >= 97 && c <= 122) {
				idx = c - 97;
				result[idx] += 1;
			}
		}

		System.out.println(Arrays.toString(result));

	}
}
