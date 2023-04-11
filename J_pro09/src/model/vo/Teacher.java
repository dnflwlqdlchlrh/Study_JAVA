package model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher extends Account{
	
	private Date loginDate;
	
	public Teacher(String name) {
		setName(name);
		setPassword("1111");
	}
	
	public Teacher(String name, String password) {
		setName(name);
		setPassword(password);
	}


	public Date getLoginDate() {
		return loginDate;
	}
	
	public String getLoginDateFormat() {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		return sFormat.format(loginDate);
	}

	public void setLoginDate(Date loginate) {
		this.loginDate = loginate;
	}
	
	@Override
	public String resetPassword() {
		String prefix = "TCH_";
		String newPass = super.resetPassword();
		setPassword(prefix + newPass); 
		return newPass;
	}
}
