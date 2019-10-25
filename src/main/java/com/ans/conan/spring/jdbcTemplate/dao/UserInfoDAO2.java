package com.ans.conan.spring.jdbcTemplate.dao;

import com.ans.conan.spring.jdbcTemplate.bean.UserInfo;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserInfoDAO2 extends JdbcDaoSupport {
	
	public void addUserInfo(UserInfo userInfo) {
		String INSERT_USER_INFO ="INSERT INTO `user_info` ( `username`, `age`, `password`) VALUES (?,?,?);" ;
		this.getJdbcTemplate().update(INSERT_USER_INFO,userInfo.getUsername(), userInfo.getAge(),userInfo.getPassword());
	}
	
	
	
}
