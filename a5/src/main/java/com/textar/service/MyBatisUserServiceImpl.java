package com.textar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.textar.dao.MyBatisUserDao;
import com.textar.pojo.User;

@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {
	@Autowired
	private MyBatisUserDao myBatisUserDao=null;
	@Override
	public User getUser(Long id) {
		return myBatisUserDao.getUser(id);
	}
}
