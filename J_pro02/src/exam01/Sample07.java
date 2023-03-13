package exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Sample07 {

	public static void main(String[] args) throws IOException { 
		/*
		 * Random Class를 활용한 실습 가위 바위 보 문제
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();

		
		// while 문, if 문, switch 문 활용
		String user, uInput, cInput = "";
		int com;
		int result = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		user = br.readLine();

		int total = 0, lose = 0, win = 0, draw = 0;

		while (true) {

			System.out.print("가위 바위 보 : ");
			uInput = br.readLine();

			com = rand.nextInt(3);
			
			if(com == 0) {
				cInput = "가위";
			} else if(com == 1) {
				cInput = "바위";
			} else if(com == 2) {
				cInput = "보";
			}

			if (uInput.equals("exit")) {
				break;
			} else if (uInput.equals("가위")) {
				if (com == 0) {
					result = 0;
					total++;	draw++;
				} else if (com == 1) {
					result = 1;
					total++;	win++;
				} else if (com == 2){
					result = -1;
					total++;	lose++;
				}
			} else if (uInput.equals("바위")) {
				if (com == 0) {
					result = 1;
					total++;	win++;
				} else if (com == 1) {
					result = 0;
					total++;	draw++;
				} else if (com == 2){
					result = -1;
					total++;	lose++;
				}
			} else if (uInput.equals("보")) {
				if (com == 0) {
					result = -1;
					total++;	lose++;
				} else if (com == 1) {
					result = 1;
					total++;	win++;
				} else if (com == 2){
					result = 0;
					total++;	draw++;
				}
			} else {
				System.out.println("잘못 입력했습니다, 다시 입력하세요.");
				System.out.print("\n");
			}
			
			System.out.printf("컴퓨터 : %s\n%s : %s\n", cInput, user, uInput);
			
			switch(result) {
				case -1 :
					System.out.println("졌습니다");
					break;
				case 0 :
					System.out.println("비겼습니다.");
					break;
				case 1 :
					System.out.println("이겼습니다");
					break;
			}
		}
		System.out.printf("%d전 %d승 %d무 %d패", total, win, draw, lose);
		

//		if 문, while 문 활용
//		String user, uInput;
//		int com;

//		while (true) {
//			
//			System.out.print("가위 바위 보 : ");
//			uInput = br.readLine();
//			
//			com = rand.nextInt(3);
//			if (uInput.equals("exit")) {
//				break;
//			} else if (uInput.equals("가위")) {
//				if (com == 0) {
//					System.out.println("컴퓨터 : 가위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("비겼습니다.");
//					System.out.print("\n");
//					total++;
//					draw++;
//				} else if (com == 1) {
//					System.out.println("컴퓨터 : 바위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("졌습니다.");
//					System.out.print("\n");
//					lose++;
//				} else {
//					System.out.println("컴퓨터 : 보");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("이겼습니다.");
//					System.out.print("\n");
//					total++;
//					win++;
//				}
//			} else if (uInput.equals("바위")) {
//				if (com == 0) {
//					System.out.println("컴퓨터 : 가위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("이겼습니다.");
//					System.out.print("\n");
//					total++;
//					win++;
//				} else if (com == 1) {
//					System.out.println("컴퓨터 : 바위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("비겼습니다.");
//					System.out.print("\n");
//					total++;
//					draw++;
//				} else {
//					System.out.println("컴퓨터 : 보");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("졌습니다.");
//					System.out.print("\n");
//					total++;
//					lose++;
//				}
//			} else if (uInput.equals("보")) {
//				if (com == 0) {
//					System.out.println("컴퓨터 : 가위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("졌습니다.");
//					System.out.print("\n");
//					total++;
//					lose++;
//				} else if (com == 1) {
//					System.out.println("컴퓨터 : 바위");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("이겼습니다.");
//					System.out.print("\n");
//					total++;
//					win++;
//				} else {
//					System.out.println("컴퓨터 : 보");
//					System.out.printf("%s : %s\n", user, uInput);
//					System.out.println("비겼습니다.");
//					System.out.print("\n");
//					total++;
//					draw++;
//				}
//			} else {
//				System.out.println("잘못 입력했습니다, 다시 입력하세요.");
//				System.out.print("\n");
//			}
//			
//		}
//		System.out.printf("%d전 %d승 %d무 %d패", total, win, draw, lose);
	}
}
