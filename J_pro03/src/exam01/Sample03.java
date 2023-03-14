package exam01;


public class Sample03 {

	public static void main(String[] args) {
		String[] arr1 = new String[5];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = "Hello";
		}
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.printf("arr1[%d] -> %s\n", i, arr1[i]);
		}

	}

}
