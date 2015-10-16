package com.esrichina.dao;


import java.util.List;

import com.esrichina.base.BaseDao;
import com.esrichina.entity.Roles;
import com.esrichina.entity.UserRoles;


public interface RolesDao extends BaseDao<Roles>{
	public List<Roles> findAll();
	public void deleteUserRole(String userId);
	public void saveUserRole(UserRoles userRoles);
}
