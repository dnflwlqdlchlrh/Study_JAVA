package exam09;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * Circle Class, Rectangle Class, Triangle Class를 만든다.
		 * 
		 * 	1. 위의 만들어진 클래스를 이용하여 각 도형의 너비를 구하기 위한 메서드를 만들어 본다.
		 * 	(Method 명은 'area'로 한다.)
		 * 
		 * 	2. 위의 만들어진 클래스를 이용하여 각 도형의 둘레를 구하기 위한 메서드를 만들어 본다.
		 *  (Method 명은 'round'로 한다.)
		 */
		
		Circle circle01 = new Circle();
		
		System.out.printf("원의 너비 : %.2f\n",circle01.area(4.0));
		System.out.printf("원의 둘레 : %.2f\n",circle01.round(4.0));
		
		System.out.println("---------------------");
		
		Rectangle rectangle01 = new Rectangle();
		
		System.out.printf("직사각형의 너비 : %d\n", rectangle01.area(5, 6));
		System.out.printf("직사각형의 둘레 : %d\n", rectangle01.round(5, 6));
		
		System.out.println("---------------------");
		
		Triangle triangle01 = new Triangle(); 
		
		System.out.printf("삼각형의 너비 : %d\n", triangle01.area(5, 6));
		System.out.printf("삼각형의 둘레 : %d\n", triangle01.round(5, 6, 7));
		

	}

}
