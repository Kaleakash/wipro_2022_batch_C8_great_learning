package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {
	LoginDao ld = new LoginDao();
	
	public String checkLoginDetails(Login ll) {
		if(ld.checkLoginDetails(ll)) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public String createLoginDetails(Login ll) {
		if(ld.createLoginDetails(ll)>0) {
			return "accont created successfully";
		}else {
			return "account didn't create";
		}
	}
}
