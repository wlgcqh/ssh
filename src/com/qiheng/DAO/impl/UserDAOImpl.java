package com.qiheng.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.qiheng.DAO.UserDAO;
import com.qiheng.bean.User;

public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveUser(User user) {
		Session session = getSession();
		session.save(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Session session = getSession();
		List<User> list = null;
		list = (List<User>) session.createQuery("from User as u order by u.id")
				.setCacheable(true)
				.list();
		return list;
	}

	public void deleteUser(int id) {
		Session session = getSession();
		User user = (User) session.get(User.class, id);
		session.delete(user);
	}

	public void updateUser(User user) {
		Session session = getSession();
		session.update(user);
	}

	public User findUserById(int id) {
		Session session = getSession();
		User user = null;
		user = (User) session.get(User.class, id);
		return user;
	}

}
