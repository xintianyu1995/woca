package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhiyou.dao.UserDao;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userdao;
	public void add(User user) {
		userdao.add( user);
	}
	public void update(User user) {
		userdao.update( user);	
	}
	public void delete(int id) {
		userdao.delete(id);
	}
	public List<User> select() {
		return  userdao.select();
	}

	public User selectById(int id) {
		return userdao.selectById(id);
	}

}
