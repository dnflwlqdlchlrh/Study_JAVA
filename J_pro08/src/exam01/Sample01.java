package exam01;

import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {
		// 문자열 생성
		String s1 = "문자열 메서드";
		String s2 = new String("문자열");
		
		char[] cArr = new char[] {'문', '자', '열'};
		String s3 = new String(cArr);
		
		// 아스키 코드를 사용할 때
		byte[] bArr = new byte[] {65, 66, 67, 68};
		String s4 = new String(bArr);
		
		System.out.printf("%s | %s | %s | %s\n", s1, s2, s3, s4);
		
		// 문자열 관련 메서드
		boolean equal = s1.equals(s2);
		System.out.println("동일한 문자열 값 비교 : " + equal);
		
		for(int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			System.out.println("\"문자열\"에서 문자 추출 : " + c1);
		}
		
		// 인스턴스에 저장된 값을 contain Method의 매개변수를 통해 포함 되어 있는지 확인 유무
		boolean contain = s1.contains("문자");
		System.out.println("\"문자열\"에서 \"문자\" 포함 유무 : " + contain);
		
		int index = s1.indexOf("문자");
		System.out.println("\"문자열\"에서 \"문자\"가 포함되어 있으면 그 위치가 어디인지? : " + index);
		
		// 문자열 내부의 값을 변경
		s1 = s1.replace("메서드", "Method");
		System.out.println("\"문자열 메서드\"에서 " +"\""+ s1 + "\""+ "로 변경");
		
		// 문자열을 분리해서 배열에 저장
		String[] sArr = s1.split(" ");
		System.out.println(Arrays.toString(sArr));
		
		// 구분자를 통해 문자를 분리
		s1 = "010-1234-5678";
		sArr = s1.split("-");
		System.out.println(Arrays.toString(sArr));
		
		// 구분자를 통해 분리된 문자열을 결합
		s1 = String.join("/", sArr);
		System.out.println(s1);
		
		// 가장 앞•뒤의 공백을 구분해 제거
		s1 = "	앞/뒤로 공백이 포함된 문자열	";
		s1 = s1.trim();
		System.out.println(s1);
		
		// 문자열을 문자 배열로 반환
		cArr = s1.toCharArray();
		System.out.println(Arrays.toString(cArr));
		
		// 정규표현식으로 문자열의 배치를 비교해, 맞으면 true, 틀리면 false를 반환
		s1 = "010-1234-5678";
		boolean isPhone = s1.matches("\\d{3}-\\d{4}-\\d{4}");
		System.out.println(isPhone);
		
		
		

	}

}
