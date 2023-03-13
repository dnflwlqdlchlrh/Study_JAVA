package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample05 {

	public static void main(String[] args) throws IOException{
		/*
		 * 문자열 비교 연산
		 * 	문자열은 일반 연산 기호로는 비교할 수 없다.
		 * 	기본 메소드를 사용해 비교해주면 된다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String sample = "안녕하세요";
		
		System.out.print("텍스트를 입력하시오 : ");
		String sInput = br.readLine();
		
		System.out.printf("%s / %s\n", sample, sInput);
		
		if(sample.equals(sInput)) {
			System.out.printf("동일한 문자열 입니다.");
		} else {
			System.out.println("동일하지 않은 문자열 입니다.");
		}
		
	}

}
