package com.dreamworks.portal.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.dreamworks.portal.bean.User;

@Component(value = "userdao")
public class UserDao {
	@PersistenceContext
	protected EntityManager entityManager;

	public User findById(int userId) {
		User user = entityManager.find(User.class, userId);
		return user;
	}

	public void saveUser(User user) {
		entityManager.persist(user);
	}
}
