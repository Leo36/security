package com.esrichina.dao.impl;
import org.springframework.stereotype.Repository;

import com.esrichina.base.impl.BaseDaoImpl;
import com.esrichina.dao.LogDao;
import com.esrichina.entity.Log;


@Repository("logDao")
public class LogDaoImpl extends BaseDaoImpl<Log> implements LogDao
{
}
