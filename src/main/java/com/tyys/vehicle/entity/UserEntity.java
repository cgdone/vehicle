package com.tyys.vehicle.entity;

import java.io.Serializable;
import java.util.List;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int user_id         ;
	private String	user_name   ;
	//private int	user_type       ;
	private int	user_status    ;
	private String user_password;
	//private int	creater_id      ;
	private int	create_time     ;
	//private int	modify_user_id  ;
	//private int	last_modify_time;
	
	public UserEntity() {
		super();
	}
	
	public int getId() {
		return user_id;
	}

	public void setId(int id) {
		this.user_id = id;
	}

	public String getUserName() {
		return user_name;
	}

	public void setUserName(String userName) {
		this.user_name = userName;
	}

	public void setUserStatus(int status) {
		this.user_status= status;
	}
	
	public int getUserStatus() {
		return this.user_status;
	}
	public String getPassWord() {
		return user_password;
	}

	public void setPassWord(String passWord) {
		this.user_password = passWord;
	}

	public int getCreateTime() {
		return create_time;
	}

	public void setCreateTime(int create_time) {
		this.create_time = create_time;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userName:" + this.user_name + ", pasword:" + this.user_password + "create_time:" + this.create_time;
	}
}
