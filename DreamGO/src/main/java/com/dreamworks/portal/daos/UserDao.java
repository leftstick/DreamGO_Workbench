package com.dreamworks.portal.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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

	public User findByUserName(String userName) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<User> createQuery = builder.createQuery(User.class);
		Root<User> from = createQuery.from(User.class);
		createQuery.where(builder.equal(from.get("userName"), userName));
		TypedQuery<User> query = entityManager.createQuery(createQuery);
		List<User> list = query.getResultList();
		if (list != null && !list.isEmpty())
			return list.get(0);
		return null;
	}

	public void saveUser(User user) {
		entityManager.persist(user);
	}
}
