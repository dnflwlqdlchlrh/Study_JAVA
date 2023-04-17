package game.upanddown;

import java.util.Random;

public class GuessNum {
	
	Random rand = new Random();
	private int randNum = rand.nextInt(20) + 1;
	private int count = 5;
	
	Up up = new Up();
	Down down = new Down();
	Correct correct = new Correct();
	Fail fail = new Fail();
	
	public void getuserNum(int num) {
			if(count == 0) {
				fail.getresult();
			} else if(randNum > num) {
				count -= 1;
				up.getresult();
			}else if(randNum < num) {
				count -= 1;
				down.getresult();
			} else if(randNum == num) {
				correct.getresult();
			} 
	}
	
	public int getrandNum() {
		return randNum;
	}
	
	public int getCount() {
		return count;
	}
	
	

	
	
	
		

}
