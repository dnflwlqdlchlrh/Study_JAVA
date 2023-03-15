package exam01;


public class Sample03 {

	public static void main(String[] args) {
		String[] arr1 = new String[] {"A", "B", "C", "D", "E"};
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> %s\n", i, arr1[i]);
		}
		
		System.out.println("-------------");
		
		char[] arr2 = new char[5] ;
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = (char)('a' + i);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("arr2[%d] -> %s\n", i, arr2[i]);
		}
	}
}
