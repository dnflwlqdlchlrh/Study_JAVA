package exam01;

import java.util.Random;

public class Sample06 {

	public static void main(String[] args) {
		/*
		 * 난수값 생성
		 */
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(rand.nextInt(10));
		}

	}

}
