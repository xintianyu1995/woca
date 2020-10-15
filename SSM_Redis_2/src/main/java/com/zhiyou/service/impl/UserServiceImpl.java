package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
	//用来标记需要清除缓存的方法，以及清除指定的缓存
	@CacheEvict(value="userSelect",allEntries=true)
	public void delete(int id) {
		userdao.delete(id);
	}
	//指定下面这个方法需要使用缓存，使用缓存的名字叫userSelect
	@Cacheable(value="userSelect")
	public List<User> select() {
		return  userdao.select();
	}
	@Cacheable(value="userSelect",key="#id")
	public User selectById(int id) {
		return userdao.selectById(id);
	}

}
