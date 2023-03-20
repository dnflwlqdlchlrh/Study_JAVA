package exam07;

public class Sample01 {

	public static void main(String[] args) {
		
		Initialize init = new Initialize();
		System.out.println("JVM 초기값 : " + init.num1 + ", " + Initialize.name1);

		System.out.println("명시적 초기값 : " + init.num2 + ", " + Initialize.name2);

		System.out.println("초기화 블럭 : " + init.num3 + ", " + Initialize.name3);
	}
}
