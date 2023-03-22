package exam01;

public class Run {

	public static void main(String[] args) {
		
		Grade g1 = new Grade("국어");
		
		g1.setScore(73.4);
		
		System.out.println(g1.getName());
		System.out.println(g1.getScore());
		System.out.println(g1.getRank());
		

	}

}
