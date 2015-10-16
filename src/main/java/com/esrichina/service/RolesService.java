package com.esrichina.service;


import java.util.List;

import com.esrichina.entity.Roles;
import com.esrichina.entity.UserRoles;
import com.esrichina.util.PageView;

public interface RolesService{
	public PageView query(PageView pageView,Roles roles);
	
	public void add(Roles roles);
	
	public void delete(String id);
	
	public void modify(Roles roles);
	
	public Roles getById(String id);
	
	public List<Roles> findAll();
	
	public void saveUserRole(UserRoles userRoles);
}
