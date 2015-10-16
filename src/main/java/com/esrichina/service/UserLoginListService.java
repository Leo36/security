package com.esrichina.service;

import com.esrichina.entity.UserLoginList;
import com.esrichina.util.PageView;

public interface UserLoginListService {
	public PageView query(PageView pageView,UserLoginList userLoginList);
	
	public void add(UserLoginList userLoginList);

}
