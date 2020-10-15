package com.zhiyou.model;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{

	private Integer id;
	private String name;
	private String password;
	private String qian;
	private Date date;
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", qian=" + qian + ", date=" + date
				+ "]";
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
