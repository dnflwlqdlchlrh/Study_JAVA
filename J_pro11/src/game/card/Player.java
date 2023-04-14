package game.card;

public interface Player {
	
	// 임의의 가위, 바위, 보가 반환되도록 한다.
	public Hand randomCardHand();
	
	// 가위, 바위, 보 대결을 진행한다.
	public boolean versus(Hand h1, Hand h2);

}
