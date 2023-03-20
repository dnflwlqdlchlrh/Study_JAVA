package exam05;

import java.util.Random;

public class Sample01 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		c1.radius = 1.5;	c2.radius = 3.5;
		
		c1.diamiter = c1.radius * 2;
		c2.diamiter = c2.radius * 2;
		
		c1.area = Circle.pi * Math.pow(c1.radius, 2);
		c2.area = Circle.pi * Math.pow(c2.radius, 2);
		
		System.out.printf("c1 인스턴스 -> radius : %.2f, diamiter : %.2f, area : %.2f\n", c1.radius, c1.diamiter, c1.area	);
		System.out.printf("c2 인스턴스 -> radius : %.2f, diamiter : %.2f, area : %.2f\n", c2.radius, c2.diamiter, c2.area	);
		

		System.out.println("---------------");
		
		r1.width = c1.diamiter;
		r2.width = c2.diamiter;
		
		r1.height = rand.nextInt(7) + 3;
		r2.height = rand.nextInt(7) + 3;
		
		r1.area = r1.width * r1.height;
		r2.area = r2.width * r2.height;
		
		System.out.printf("r1 인스턴스 -> width : %.2f, height : %.2f, area : %.2f\n", r1.width, r1.height, r1.area);
		System.out.printf("r2 인스턴스 -> width : %.2f, height : %.2f, area : %.2f\n", r2.width, r2.height, r2.area);
	}

}
