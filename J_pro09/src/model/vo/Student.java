package model.vo;

import java.util.Random;

// 학생 정보를 가지는 클래스
public class Student extends Account {
	private Grade[] grades;


	public Student(String name) {
		setName(name);
		setPassword("1111");
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public String resetPassword() {
		String prefix = "TCH_";
		Random rand = new Random();
		String newPass = "";
		
		int cnt = 0;
		while(true) {
			boolean tf = rand.nextBoolean();
			if(tf == true) {
				newPass += (char)(rand.nextInt(26) + 65);
				cnt++;
				if(cnt == 6) {
					break;
				}
			}
			if(tf == false) {
				newPass += (char)(rand.nextInt(26) + 97);
				cnt++;
				if(cnt == 6) {
					break;
				}
			}
		}
		return prefix + newPass;
	}
	
	
}
