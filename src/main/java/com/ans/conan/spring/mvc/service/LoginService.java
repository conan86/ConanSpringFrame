package com.ans.conan.spring.mvc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ans.conan.spring.jdbcTemplate.bean.UserInfo;
import com.ans.conan.spring.mvc.dao.AbstractDAO;
import com.ans.conan.spring.mvc.dao.LoginDAO;

@Service("loginService")
public class LoginService extends AbstractService {
	
	
	private AbstractDAO dao ;
	@Resource(name="loginDAO")
	@Override
	public void setDAO(AbstractDAO dao) {
		this.dao = dao;
	}
	
	public boolean  verifyUser(String username, String password) {
		int i =  ((LoginDAO) dao).verifyUser(username, password);
		if(i >0) {
			return true;
		}
		return false;
	}
	
	public List<UserInfo> getAllUserInfo() {
		return ((LoginDAO) dao).getAllUserInfo();
	}
	
}
