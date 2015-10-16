package com.esrichina.dao.impl;

import org.springframework.stereotype.Repository;

import com.esrichina.base.impl.BaseDaoImpl;
import com.esrichina.dao.ServerInfoDao;
import com.esrichina.entity.ServerInfo;

@Repository("serverInfoDao")
public class ServerInfoDaoImpl extends BaseDaoImpl<ServerInfo> implements ServerInfoDao{

}
