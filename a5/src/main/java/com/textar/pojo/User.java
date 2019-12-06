package com.textar.pojo;

import org.apache.ibatis.type.Alias;

@Alias(value="user")
public class User {
	private Long id=null;
	private String userName=null;
	private String note=null;
	private SexEnum sex=null;
//	private String sex=null;
	//	private int sex=11;
	public User() {
	}
	public Long getId() { return this.id;}
	public void setId(Long id) { this.id=id; }
	//	public int getSex() { return this.sex;}
//	public void setSex(int id) { this.sex=id; }
//	public SexEnum getSex() { return this.sex; }
//	public void setSex(SexEnum id) { this.sex=id; }
	public String getSex() { return this.sex.getName(); }
	public void setSex(SexEnum id) { this.sex=id; }
	public String getUserName() { return this.userName;}
	public void setUserName(String s) { this.userName=s; }
	public String getNote() { return this.note;}
	public void setNote(String s) { this.note=s; }
}
