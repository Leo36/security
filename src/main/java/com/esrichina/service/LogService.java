package com.esrichina.service;


import java.util.List;

import com.esrichina.entity.Log;
import com.esrichina.util.PageView;

public interface LogService{
	public PageView query(PageView pageView,Log log);
	
	public void add(Log log);
	
	public void delete(String id);
	
	public void modify(Log log);
	
	public Log getById(String id);
	
	public List<Log> findAll(Log log);
	
}
