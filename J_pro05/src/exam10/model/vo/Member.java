package exam10.model.vo;

public class Member {
	private String memberId;
	private String memberpwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
