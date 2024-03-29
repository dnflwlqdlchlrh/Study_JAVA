package exam01;

public class Sample05 {

	public static void main(String[] args) {
		/*
		 * Wrapper Class
		 *  - 기본 자료형을 객체로 만들어서 다룰 수 있게 해주는 클래스
		 *  - 문자열 객체를 Wrapper 클래스로 변환하여 사용할 수 있게 된다.
		 *  
		 *  Boolean, Byte, Character, Short, Integer, Long, Float, Double Class이다.
		 */
		
		// 문자열을 기본 자료형으로 변경하기(Wrapper 사용)
		boolean b1 = Boolean.parseBoolean("true");
		byte b2 = Byte.parseByte("10");
		short s1 = Short.parseShort("20");
		int i1 = Integer.parseInt("30");
		long l1 = Long.parseLong("50");
		float f1 = Float.parseFloat("50.50");
		double d1 = Double.parseDouble("60.60");
		
		// 기본 자료형을 문자열 변경(기존 방식)
		String s2 = new String("" + 10);
		s2 = new String("" + true);
		

	}

}
