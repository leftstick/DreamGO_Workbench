package com.dreamworks.portal.services;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dreamworks.portal.bean.User;
import com.dreamworks.portal.daos.UserDao;

@Component(value = "userservice")
@Transactional
public class UserService {
	@Resource(name = "userdao")
	private UserDao userdao;

	public User findById(int userId) {
		return userdao.findById(userId);
	}
	
	public User findByUserName(String userName) {
		return userdao.findByUserName(userName);
	}

	public void registerUser(User user) {
		user.setUserPassword(DigestUtils.md5Hex(user.getUserPassword()));
		userdao.saveUser(user);
	}
}
