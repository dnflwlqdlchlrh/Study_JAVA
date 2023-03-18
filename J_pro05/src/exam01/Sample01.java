package exam01;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * Java_객체 지향 언어
		 * 	자바(Java)는 C++과는 달리 처음부터 객체 지향 언어로 개발된 프로그래밍 언어입니다.
		 * 	또한, 자바는 자바 가상 머신(JVM)을 사용하여 어느 운영체제에서나 같은 형태로 실행될 수 있습니다.
		 * 	현재 자바는 전 세계에서 가장 많이 사용하는 프로그래밍 언어 중 하나입니다.
		 */
		
		Person p1 = new Person();
		
		p1.Upage(5);
		p1.setPrint("안녕");
		System.out.println("이름 : " + p1.getPrint());
		
		
		Member m1 = new Member();
		
		m1.setName("안녕하세요.");
		
		System.out.println(m1.getName());
		
		m1.setName("반갑습니다.");
		
		System.out.println(m1.getName());
		
		
	}

}

