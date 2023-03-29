package exam05;

public class Main {

	public static void main(String[] args) {

		/*
		 * 다형성 - 객체 지향 프로그래밍의 3대 특징 중 하나(캡술화, 상속, 다형성) - 하나의 객체가 여러 형태를 가진다는 의미 - 상속을
		 * 사용하여 부모 타입으로 부터 파생된 여러 타입의 자식 객체를 부모 클래스로 다룰 수 있도록 하는 기능
		 */

		/*
		 * 업 캐스팅 - 하나의 데이터 타입을 다른 타입으로 바꾸는 것을 타입 변환 혹은 형 변환(캐스팅)이라고 한다. - 자식(하위) 클래스의
		 * 객체가 부모(상위) 클래스 타입으로 형 변환 되는 것 - 자동으로 변환이 이루어지기 때문에 별도의 캐스팅 연산자를 사용할 필요가 없다.
		 */
		Person student = new Student("심청이", 17);
		Person teacher = new Teacher("심봉사", 30);

		Person[] person = new Person[3];
		person[0] = new Teacher("김흥부", 31);
		person[1] = new Student("김놀부", 18);
		person[2] = new Student("김제비", 19);

		for (int i = 0; i < person.length; i++) {
			System.out.println("이름 : " + person[i].getName());
			System.out.println("나이 : " + person[i].getAge() + "세");
			System.out.println("------------");
		}

		/*
		 * 다운 캐스팅 - 업 캐스팅 된 것을 다시 원상태로 돌리는 것을 말한다. - 하위 클래스로의 다운 캐스팅을 할때는 타입을 명시적으로
		 * 지정해줘야한다는 특징이 있다. • Student s = (Student)p
		 */

		Person s1 = new Student("김거북", 16);
		Student s2 = (Student) s1;	// 다운 캐스팅한 상태
		s2.setClassLevel(3);
		s2.setClassRoom(6);

		Person t1 = new Teacher("박토끼", 35);
		Teacher t2 = (Teacher) t1;	
		t2.setClassLevel(2);
		t2.setClassRoom(1);
		t2.setSubject("영어");

		Person[] p = new Person[2];
		p[0] = s2;	p[1] = t2;	// 다시 업 캐스팅한 상태

		for (int i = 0; i < p.length; i++) {
			int level, room;
			String subject = "";
			
			// p[i]의 값이 Student 객체의 instance인지, 만약 true이면 조건문을 실행
			if (p[i] instanceof Student) {	
				level = ((Student) p[i]).getClassLevel();
				room = ((Student) p[i]).getClassRoom();
				System.out.printf("%d 학년 %d 반\n%s 학생\n", level, room, p[i].getName());
				System.out.printf("%d세\n", p[i].getAge());
				System.out.println("-------------------");
			} else if (p[i] instanceof Teacher) {
				level = ((Teacher) p[i]).getClassLevel();
				room = ((Teacher) p[i]).getClassRoom();
				subject = ((Teacher) p[i]).getSubject();
				System.out.printf("%d 학년 %d 반\n%s 담당\n%s 선생님\n", level, room, subject, p[i].getName());
				System.out.printf("%d세\n", p[i].getAge());
			}
		}
	}
}
