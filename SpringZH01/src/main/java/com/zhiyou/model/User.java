package com.zhiyou.model;

public class User {

	private Integer id;
	private String name;
	private String password;
	private String qian;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQian() {
		return qian;
	}
	public void setQian(String qian) {
		this.qian = qian;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", qian=" + qian + "]";
	}
	public User(Integer id, String name, String password, String qian) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.qian = qian;
	}
	public User() {
		
	}
	
	
}
