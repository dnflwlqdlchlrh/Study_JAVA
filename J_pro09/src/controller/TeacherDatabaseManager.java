package controller;

import java.util.Date;

import model.vo.Teacher;

public class TeacherDatabaseManager {

	private Teacher[] datas;
	
	// 테스트용 초기 데이터, 이후 삭제 될 예정.
	{
		datas = new Teacher[2];
		datas[0] = new Teacher("고선생", "1234");
		datas[0].setLoginDate(new Date());
		
		datas[1] = new Teacher("박선생", "1111");
		datas[1].setLoginDate(new Date());
	}
	
	public Teacher login(String name, String password) {
		
		// Teacher 배열에 존재하는 객체들 중 동일한
		// 이름, 패스워드를 사용하는 객체가 있는지 검사 후
		// 동일한 객체가 있으면 해당하는 Teacher 객체를 반환
		// 동일한 객체가 없으면 null 반환.
		for(int i = 0; i < datas.length; i++) {
			if(name.equals(datas[i].getName()) && password.equals(datas[i].getPassword())) {
				return datas[i];
			}
		}
		return null;
	}
}
