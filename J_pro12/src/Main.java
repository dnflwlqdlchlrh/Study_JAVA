import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import game.upanddown.Fail;
import game.upanddown.GuessNum;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		GuessNum game = new GuessNum();
		Fail fail = new Fail();
		
		System.out.println("Up And Down 게임을 시작합니다.");
		System.out.println("사용자는 임의의 숫자를 하나 입력해주세요.");
		System.out.println("숫자의 범위는 1 ~ 20 입니다.");
		
		while(true) {
			System.out.print("입력 : ");
			int num = Integer.parseInt(br.readLine());
			
			game.getuserNum(num);
			if(game.getCount() == 0) {
				fail.getresult();
				break;
			} else if(game.getrandNum() == num) {
				break;
			}
			
		}
			
		
	}
}
