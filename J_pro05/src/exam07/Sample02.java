package exam07;

public class Sample02 {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("Java Programming");
		Book book3 = new Book("Programming",123456789);
		Book book4 = new Book("자바",123456789, "미상");
		Book book5 = new Book("Class Book", 12345, "홍길동", 5);
		
		System.out.printf("book2 인스턴스의 'name' : %s\n", book2.name);
		System.out.printf("book3 인스턴스의 'name' : %s\n"
				+ "book3 인스턴스의 'codeNumber' : %d\n", book3.name, book3.codeNumber);
		
		
	}

}
