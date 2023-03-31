package exam07_2;

public class Staff extends Employee {
	
//	private String name;
//	private int age;
	private String position;
	private int pay = 2800;
	
	public Staff() {
		
	}
	
	public Staff(String name) {
		super(name);
	}

	public Staff(String name, String position) {
		super(name, position);
		this.position = position;
	}
	
	public void payment() {
		if(this.position.equals("사원")) {
			super.payment(this.pay);
			System.out.printf("올 해 받으신 보너스는 %dk원 입니다.\n", super.getBonus());
			System.out.printf("%s %s님의 연봉은 : %,dk원 입니다.\n", super.getName(), super.getPosition(), super.getPay());

		} else {
			System.out.println("직책을 다시 입력해주세요.");
		}
	}
	
	
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public String getPosition() {
//		return position;
//	}
	
//	public void setPosition(String position) {
//		if(position.equals("사원")) {
//			super.setPosition(position);
//		} else {
//			System.out.printf("%s만 입력 가능합니다.", position);
//		}
//	}
//	
//	public void payment() {
//		this.setPosition(position);
//		System.out.printf("이름 : %s\n나이 : %d세\n%s님의 연봉은 %,d만원 입니다.\n", 
//				getName(), getAge(), getName(), super.getPay());
//	}
	
	
	
	
	
	
}
