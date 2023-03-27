package exam02;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(16);
		p.setGender('M');
		System.out.println(p);
		
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(16);
		s.setGender('M');
		s.setClassLevel(3);
		s.setClassRoom(5);
		System.out.println(s);

		Teacher t = new Teacher();
		t.setName("박주영");
		t.setAge(30);
		t.setGender('M');
		t.setClassLevel(2);
		t.setClassRoom(6);
		t.setSubject("과학");
		System.out.println(t);
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("김정수");		p1.setAge(25);	p1.setGender('F');
		p2.setName("김정수");		p2.setAge(25);	p2.setGender('F');
		
		System.out.println(p1.equals(p2));
		
		
	}

}
