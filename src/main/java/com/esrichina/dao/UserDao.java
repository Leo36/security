package com.esrichina.dao;


import com.esrichina.base.BaseDao;
import com.esrichina.entity.Roles;
import com.esrichina.entity.User;


public interface UserDao extends BaseDao<User>{
	public int countUser(String userName,String userPassword);
	
	public User querySingleUser(String userName);
	
	public Roles findbyUserRole(String userId);
}
