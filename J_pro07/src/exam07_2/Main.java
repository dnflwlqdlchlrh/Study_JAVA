package exam07_2;

public class Main {

	public static void main(String[] args) {
		
		Staff staff = new Staff("김사원", "사원");
		staff.copCradit();
		
		DepartmentManager dmg = new DepartmentManager("박대리", "과장");
		dmg.copCradit();
		
		AssistantManager asm = new AssistantManager("김거북", "대리");
		asm.copCradit();
	}
}
