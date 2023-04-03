package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample02 {
	
	public String str;
	
	public void ex01(String str) {
		/*
		 * 사용자 입력으로 정수값 입력을 받을 때 한 번의 입력으로 1개 이상의 정수값을
		 * 받을 수 있도록 한다.(nextLine() Method를 사용해야 한다.)
		 */
		this.str = str;
		int num = Integer.parseInt(this.str);
		System.out.println(num);
		
	}
	
	public void ex02(String str) {
		/*
		 * 사용자 입력으로 전화번호를 입력 받을 때 xxx-xxxx-xxxx 형식으로 입력하지 않은 경우
		 * 다시 입력하도록 한다.
		 */
		this.str = str;
		boolean isPhone = this.str.matches("\\d{3}-\\d{4}-\\d{4}");
	
		if(isPhone == true) {
			System.out.println(this.str);
		} else {
			System.out.println("다시 입력해주세요.");
		}
		
	}
	
	public void ex03(String str) {
		/*
		 * 사용자 입력으로 전화번호를 입력 받고 출력할 때 전화번호 마지막 4자리 숫자는
		 * 다음의 문자로 마스킹 처리하여 출력되도록 한다. (마스킹 문자 -> *)
		 */
		this.str = str;
		String[] sArr1 = this.str.split("-");
		for(int i = 0; i < 4; i++) {
			sArr1[i + 7] = "*";
		}
		String sArr2 = String.join("-", sArr1);
		System.out.println(sArr2);
		
	}
	
	public void ex04(String str) {
		/*
		 * 사용자 입력으로 이메일 주소 형식을 받을 때 xxxxx@gmail.com 또는 xxxxx@naver.com,
		 * xxxxx@nate.com의 주소 형식만 받을 수 있도록 한다. (아이디 글자 수 제한 X)
		 */
		
		this.str = str;
		
		String[] emailDomain = new String[] {
				"gmail.com", "naver.com", "nate.com"
		};
		
		while(true) {
			// @가 포함된 이메일 주소 형식인지 확인
			String[] email = this.str.split("@");
			if(email.length == 2) {
				boolean isValiad =false;
				// 지정된 도메인 주소가 맞는지 확인
				for(int i = 0; i < emailDomain.length; i++) {
					if(email[1].equals(emailDomain[i])) {
						isValiad = true;
						break;
					}
				}
				if(isValiad) {
					System.out.println("이메일 주소를 확인하였습니다.");
					break;
				} else {
					System.out.println("허용된 이메일 주소 도메인이 아닙니다.");
					break;
				}
			} else {
				System.out.println("이메일 주소 형식이 아닙니다. 다시 입력하세요.");
				break;
			}
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Sample02 exam01 = new Sample02();
		exam01.ex01(br.readLine());
		
		Sample02 exam02 = new Sample02();
		exam02.ex02(br.readLine());
		
		Sample02 exam04 = new Sample02();
		exam04.ex04(br.readLine());
		
		

	}

}
