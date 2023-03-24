package exam01;

public class Run {

	public static void main(String[] args) {
		
		Grade g1 = new Grade("국어");
		
		g1.setScore(73.4);
		
		System.out.println(g1.getName());
		System.out.println(g1.getScore());
		System.out.println(g1.getRank());
		
		Grade g2 = new Grade("수학", 87);
		
		System.out.println(g2.getName());
		System.out.println(g2.getScore());
		System.out.println(g2.getRank());
		

	}

}
