package com.dreamworks.portal.services;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

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

	public void login(User user, BindingResult errors) {
		User u = userdao.findByUserName(user.getUserName());
		if (u == null) {
			errors.rejectValue("userName", "username.nonexists");
			return;
		}
		String encodePwd = DigestUtils.md5Hex(user.getUserPassword());
		if (!encodePwd.equals(u.getUserPassword())) {
			errors.rejectValue("userPassword", "userpassword.unmatched");
			return;
		}
	}

	public User findByUserName(String userName) {
		return userdao.findByUserName(userName);
	}

	public void registerUser(User user) {
		user.setUserPassword(DigestUtils.md5Hex(user.getUserPassword()));
		userdao.saveUser(user);
	}
}
