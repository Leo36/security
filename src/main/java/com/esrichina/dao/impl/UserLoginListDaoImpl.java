package com.esrichina.dao.impl;

import org.springframework.stereotype.Repository;

import com.esrichina.base.impl.BaseDaoImpl;
import com.esrichina.dao.UserLoginListDao;
import com.esrichina.entity.UserLoginList;

@Repository("userLoginListDao")
public class UserLoginListDaoImpl extends BaseDaoImpl<UserLoginList> implements UserLoginListDao{

}
