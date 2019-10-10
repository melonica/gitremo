package com.capgemini;

import com.capgemini.LoginDao;

public class LoginService {
	public boolean validateLogin(String username, String password) {
		LoginDao dao = new LoginDao();
		int result = dao.checkLogin(username, password);
		if(result==1)
			return true;
		else
			return false;
	}
	
	
}
