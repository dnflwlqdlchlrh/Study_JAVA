package exam02;

public class Teacher extends Person{
	
	private int classLevel;	// 담당 학년
	private int classRoom;	// 담당 반
	private String Subject;	// 담당 과목
	
	public int getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [Name =" + getName() + ", Gender =" + getGender() + ", Age =" + getAge()
				+ ", classLevel=" + classLevel + ", classRoom=" + classRoom + ", Subject=" + Subject + "]";
	}
	
	
	

	
}
