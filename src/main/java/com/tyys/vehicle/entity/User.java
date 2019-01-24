package com.tyys.vehicle.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private long user_id         ;
	private String	user_name   ;
	private int	userType        ;
	private int	user_status     ;
	private String user_password;	
	private long	createrID       ;
	private Date	createTime     ;
	private int	modifyUserID  ;
	private Date	lastModifyTime;
	
	public User() {
		super();
	}
	
	public long getUserId() {
		return user_id;
	}

	public void setUserId(long id) {
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
	
	public long getCreaterID() {
		return createrID;
	}

	public void setCreatorID(long createrID) {
		this.createrID = createrID;
	}
	
	
	public String getPassWord() {
		return user_password;
	}

	public void setPassWord(String passWord) {
		this.user_password = passWord;
	}

	public int getUseType() {
		return userType;
	}

	public void getUseType(int userType) {
		this.userType = userType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public int getModifyUserID() {
		return modifyUserID;
	}

	public void setModifyUserID(int modifyUserID) {
		this.modifyUserID = modifyUserID;
	}
	
	public Date getLastModifyTimeTime() {
		return lastModifyTime;
	}

	public void setLastModifyTimeTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{user_id:" + user_id + "userName:" + this.user_name + ", pasword:" + this.user_password + "create_time:" + this.createTime + "}";
	}
}
