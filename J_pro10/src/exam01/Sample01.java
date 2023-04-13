package exam01;

public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyException m = new MyException();
		
		System.out.println("에러 발생 전");
		try {
			m.exceptionThrows();
		} catch(Exception e) {
//			System.out.println("Sample01.main 10번 줄 Exception 발생!");
			e.printStackTrace();
		}
//		m.exceptionNonThrows();
		System.out.println("에러 발생 후 처리 완료!");
	}
}
