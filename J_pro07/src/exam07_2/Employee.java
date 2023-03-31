package exam07_2;

import java.util.Random;

public class Employee {

	private String position;
	private String name;
	private int pay;
	private int bonus;
	private int copCradit;
	private int copCraditCharge;

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, String position) {
		this(name);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public int getPay() {
		return pay;
	}

	public String getName() {
		return name;
	}

	public int getBonus() {
		return bonus;
	}

	public void payment(int pay) {

		for (int i = 0; i < 12; i++) {
			this.pay += pay / 12;
		}

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (position.equals("사원")) {
				this.pay += 2800 * 0.25;
				this.bonus += 2800 * 0.25;
				cnt++;
				if (cnt == 2) {
					cnt = 0;
					break;
				}
			} else if (position.equals("대리")) {
				this.pay += 3000 * 0.25;
				this.bonus += 3000 * 0.25;
				cnt++;
				if (cnt == 2) {
					cnt = 0;
					break;
				}
			} else if (position.equals("과장")) {
				this.pay += 4000 * 0.25;
				this.bonus += 4000 * 0.25;
				cnt++;
				if (cnt == 3) {
					cnt = 0;
					break;
				}
			} else if (position.equals("차장")) {
				this.pay += 5500 * 0.25;
				this.bonus += 5500 * 0.25;
				cnt++;
				if (cnt == 3) {
					cnt = 0;
					break;
				}
			} else if (position.equals("부장")) {
				this.pay += 8000 * 0.25;
				this.bonus += 8000 * 0.25;
				cnt++;
				if (cnt == 1) {
					cnt = 0;
					break;
				}
			}
		}
	}
	
	public void copCradit() {
		if(position.equals("사원")) {
			System.out.println("사원 직급은 법인 카드를 사용할 수 없습니다.");
		}
	}

	public void copCradit(int pay) {
		
		Random rand = new Random();
		this.pay = pay;
		
		int eventCard = rand.nextInt(10) + 1;
		
		if(!this.position.equals("사원") && eventCard == 4 || eventCard == 8) {
			if(position.equals("대리")) {
				this.copCraditCharge = (int) (this.pay * 0.15);
				System.out.printf("%s님은 법인 카드 %,dk원을 사용하실 수 있습니다.\n", this.name, this.copCraditCharge);
			} else if(position.equals("과장")) {
				this.copCraditCharge = (int) (this.pay * 0.15);
				System.out.printf("%s님은 법인 카드 %,dk원을 사용하실 수 있습니다.\n", this.name, this.copCraditCharge);
			} else if(position.equals("차장")) {
				this.copCraditCharge = (int) (this.pay * 0.15);
				System.out.printf("%s님은 법인 카드 %,dk원을 사용하실 수 있습니다.\n", this.name, this.copCraditCharge);
			} else if(position.equals("부장")) {
				this.copCraditCharge = (int) (this.pay * 0.15);
				System.out.printf("%s님은 법인 카드 %,dk원을 사용하실 수 있습니다.\n", this.name, this.copCraditCharge);
			}
		} else {
			System.out.println("법인 카드를 사용하실 수 없습니다.");
		}
		
	}

//	public int getCopCradit() {
//		return copCradit;
//	}
//
//	public void setCopCradit(int pay) {
//		this.copCradit = copCradit;
//	}
//
//	public int getCopCraditCharge() {
//		return copCraditCharge;
//	}
//
//	public void setCopCraditCharge(int copCraditCharge) {
//		this.copCraditCharge = copCraditCharge;
//	}

	

//	
//	public void setPosition(String position) {
//		this.position = position;
//		
//	}
//	
//	
//	public void setPay(int pay) {
//		this.pay = pay;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

}
