package com.esrichina.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esrichina.dao.ServerInfoDao;
import com.esrichina.entity.ServerInfo;
import com.esrichina.service.ServerInfoService;
import com.esrichina.util.PageView;

@Transactional
@Service("serverInfoService")
public class ServerInfoServiceImpl implements ServerInfoService{
	@Autowired
	private ServerInfoDao serverInfoDao;

	public void add(ServerInfo serverInfo) {
		serverInfoDao.add(serverInfo);
	}

	public void delete(String id) {
		serverInfoDao.delete(id);
	}

	public ServerInfo getById(String id) {
		return serverInfoDao.getById(id);
	}
	
	//编译指令
	public PageView query(PageView pageView, ServerInfo serverInfo) {
		List<ServerInfo> list = serverInfoDao.query(pageView, serverInfo);
		pageView.setRecords(list);
		return pageView;
	}
	
	public List<ServerInfo> queryAll(ServerInfo serverInfo) {
		return serverInfoDao.queryAll(serverInfo);
	}

	public void modify(ServerInfo serverInfo) {
		serverInfoDao.modify(serverInfo);
	}
	
}
