package exam01;

public class Member {
	
	private String name;
	private int age;
	
	/*
	 * 생성자
	 *  - 생성자는 Class 이름과 같다.
	 *  - 생성자는 반환 타입이 없다.
	 */
	public Member() {
		
	}
	
	/*
	 * void란, return 되는 타입이 없음을 의미
	 * 
	 * 반환 타입이 void 일 경우에는  리턴 타입이 없다.
	 *  - return 문이 없는 Method 를 만들 때 void 키워드를 사용한다.
	 * 
	 * 반환 타입이 void가 아닌 경우에는 필수적으로 return 문이 존재해야 한다.
	 *  1. 클래스내의 어떠한 메소드가 실행되고 해당 메소드 실행에 따라 나온 값을 호출한 곳에서 돌려받고자 할때
	 *  
	 *  2. 해당 메소드 실행중 특정 조건에 따라 해당 메소드의 진행을 멈추고 빠져나올때
	 *  	1번의 경우는 return 명령어 뒤에 반환하고자 하는 값 또는 변수를 써주시면되구요 ( return a; 이런식으로요 )
	 *  	
	 *  	2번의 경우는 return; 만 써주시면되는 경우입니다
	 *  		
	 *  		(ex  a 가 10 이라면 메서드 빠져나가기
	 *  		
	 *  		if( a == 10 ) {
	 *  			return;
	 *  		} 
	 */
	
	// 반환 타입 : String
	public String getName() {
		return name;
	}
	
	// 반환 타입 : void
	public void setName(String name) {
		this.name = name;
	}
	
	// 반환 타입 : int
	public int getAge() {
		return age;
	}
	
	// 반환 타입 : void
	public void setAge(int age) {
		this.age = age;
	}
	

}
