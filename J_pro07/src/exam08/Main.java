package exam08;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 추상 클래스
		 *  - 몸체 없는 메서드(추상 메서드)를 포함하는 클래스, abstract 키워드를 사용해서 만든다.
		 *  - 미완성된 클래스(추상 클래스)를 만들어서 이를 상속하는 자식 클래스들이 미완성된
		 *    부분을 완성할 수 있게 강제시키기 위한 용도로 사용한다.
		 *  - 추사 클래스를 상속하는 모든 자식들은 미완성된 부분을 완성해야 하기 때문에 일관성이 높아진다.
		 *    (단, 참조 타입으로는 사용할 수 있다.)
		 */
		
		Shape s1 = new Circle();
		Shape s2 = new Square();
		Shape s3 = new Triangle(); 

	}

}
