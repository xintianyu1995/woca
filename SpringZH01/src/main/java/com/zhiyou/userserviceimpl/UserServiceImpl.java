package com.zhiyou.userserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.zhiyou.model.User;
import com.zhiyou.userservice.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	com.zhiyou.user.dao.UserDao userdao;
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
		// TODO Auto-generated method stub
		return userdao.selectById(id);
	}


}
