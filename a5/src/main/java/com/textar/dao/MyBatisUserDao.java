package com.textar.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.textar.pojo.User;


@Repository
//@Repository(value = "MyBatisUserDao")
//@Mapper
public interface MyBatisUserDao {
	public User getUser(Long id);

}
