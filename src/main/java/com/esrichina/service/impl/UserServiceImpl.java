package com.esrichina.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esrichina.dao.UserDao;
import com.esrichina.entity.Roles;
import com.esrichina.entity.User;
import com.esrichina.service.UserService;
import com.esrichina.util.PageView;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	public PageView query(PageView pageView, User user) {
		List<User> list = userDao.query(pageView, user);
		pageView.setRecords(list);
		return pageView;
	}

	public void add(User user) {
		userDao.add(user);
		
	}

	public void delete(String id) {
		userDao.delete(id);
		
	}

	public User getById(String id) {
		return userDao.getById(id);
	}

	public void modify(User user) {
		userDao.modify(user);
	}

	public int countUser(String userName, String userPassword) {
		return userDao.countUser(userName, userPassword);
	}

	public User querySingleUser(String userName) {
		return userDao.querySingleUser(userName);
	}

	public Roles findbyUserRole(String userId) {
		return userDao.findbyUserRole(userId);
	}
}
