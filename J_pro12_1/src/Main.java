import java.util.Scanner;

import game.updown.Correct;
import game.updown.Fail;
import game.updown.GuessNum;
import game.updown.Result;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			GuessNum game = new GuessNum();
			
			while(game.remainCount()) {
				System.out.print("임의의 숫자 입력 : ");
				int num = sc.nextInt();
				
				Result res = game.guessing(num);
				System.out.println(res);
				
				if(res instanceof Correct || res instanceof Fail) {
					System.out.println("게임을 다시 시작합니다.");
					break;
				}
			}
		}
	}
}
