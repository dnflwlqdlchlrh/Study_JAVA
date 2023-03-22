package exam07;

public class Book {
	
	public String name;
	public String writer;
	public int rentDays;
	public int codeNumber;
	public int rentPrice;
	public String publisher;
	public String category;
	public String librayName;
	
	public Book() {}
	
	public Book(String name) {
		this.name = name;
	}
	
	public Book(String name, int codeNumber) {
		this(name);
		this.codeNumber = codeNumber;
	}
	
	public Book(String name, int codeNumber, String writer) {
		this(name,codeNumber);
		this.writer = writer;
	}
	
	public Book(String name, int codeNumber, String writer, int rentDays) {
		this(name,codeNumber, writer);
		this.rentDays = rentDays;
	}
	
	public Book(String name, int codeNumber, String writer, int rentDays, int rentPrice) {
		this(name,codeNumber, writer, rentDays);
		this.rentPrice = rentPrice;
	}

}
