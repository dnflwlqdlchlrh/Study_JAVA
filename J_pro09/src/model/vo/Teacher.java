package model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
