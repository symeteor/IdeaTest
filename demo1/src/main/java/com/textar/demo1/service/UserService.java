package com.textar.demo1.service;


import com.textar.demo1.pojo.User;

import java.util.List;

public interface UserService {
	
	User getUser(Long id);

	List<User> findUsers(String userName, String note);

}
