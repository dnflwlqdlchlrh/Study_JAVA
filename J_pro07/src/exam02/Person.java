package exam02;

public class Person {
	
	private String name;
	private char gender;
	private int age;
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * 모든 Class는 'Object'라는 Class 기본적으로 상속되어 있다.
	 * 그렇기 때문에 Override를 부모 Class에서 사용할 수 있는 것이다.
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		/*
//		 *  동일 객체인지를 참조 값으로 비교하는 것이 아닌 객체의 멤버 변수 값으로
//		 *  비교 하고자 할 때 활용.
//		 */
//		Person p = (Person)obj;
//		if(this.getName().equals( p.getName() )) {
//			if(this.getAge() == p.getAge()) {
//				if(this.getGender() == p.getGender()) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

}
