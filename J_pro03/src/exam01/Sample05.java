package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Sample05 {

	public static void main(String[] args) throws IOException{
		
		/*
		 * 카이사르 암호 만들기
		 * 	- 사용자 입력으로 영단어를 입력 받는다.
		 *  - 입력 받은 영단어는 문자 배열로 생성한다.
		 *  - 생성된 문자 배열에 대해 암호화된 배열을 저장하기 위한 배열을 새로 만든다.
		 *  - 문자 쉬프트는 3으로 하고 만약 'z' 문자에 대한 쉬프트가 필요한 경우 'a'로 넘어가게 해야 한다.
		 *  
		 * 출력 양식
		 * 	암호화 전 : apple
		 *  암호화 후 : dssoh
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("영단어 입력 : ");
		String sInput = br.readLine();
		
		char[] origin = new char[sInput.length()];
		for(int i = 0; i < sInput.length(); i++) {
			origin[i] = sInput.charAt(i);
		}
		
		char[] crypto = new char[sInput.length()];
		for(int i = 0; i < sInput.length(); i++) {
			if(origin[i] + 3 > 'z') {
				crypto[i] = (char)(origin[i] + 3 - 26);
			} else {
				crypto[i] = (char)(origin[i] + 3);
			}
		}
		
		String res1 = "";
		String res2 = "";
		for(int i = 0; i < sInput.length(); i++) {
			res1 += origin[i];
			res2 += crypto[i];
		}
		System.out.printf("암호화 전 : %s\n", res1);
		System.out.printf("암호화 전 : %s\n", res2);
		
	}

}
