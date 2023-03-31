package exam07_1;

//사원
public class Staff extends Employee {
	
	public Staff(String name, int age) {
		super(name, age);
		this.setSalary(2800);
	}
	
	@Override
	public void bonus(int month) {
		switch(month) {
			case 6: case 12:
				System.out.printf("보너스 : %,.0f 원\n", getSalary() * 0.25 * 10000);
		}
	}
	
}
