package com.gt.myshop.entities.user;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:00:51
 * @description 完整用户信息
 *
 */
public class UserInfo extends PartUserInfo {
	
	private Date lastvisittime = new Date();	//最后访问时间
    private String lastvisitip = "";			//最后访问ip
    private int lastvisitrgid = -1;				//最后访问区域id
    private Date registertime = new Date();		//用户注册时间
    private String registerip = "";				//用户注册ip
    private int registerrgid = -1;				//用户注册区域id
    private int gender = 0;						//用户性别(0代表未知，1代表男，2代表女)
    private String realname = "";				//用户真实名称
    private Date bday = new Date();				//用户出生日期
    private String idcard = "";					//身份证号
    private int regionid = 0;					//区域id
    private String address = "";				//所在地
    private String bio = "";					//简介
    
    //以下是 getter setter 方法
	public Date getLastvisittime() {
		return lastvisittime;
	}
	public void setLastvisittime(Date lastvisittime) {
		this.lastvisittime = lastvisittime;
	}
	public String getLastvisitip() {
		return lastvisitip;
	}
	public void setLastvisitip(String lastvisitip) {
		this.lastvisitip = lastvisitip;
	}
	public int getLastvisitrgid() {
		return lastvisitrgid;
	}
	public void setLastvisitrgid(int lastvisitrgid) {
		this.lastvisitrgid = lastvisitrgid;
	}
	public Date getRegistertime() {
		return registertime;
	}
	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}
	public String getRegisterip() {
		return registerip;
	}
	public void setRegisterip(String registerip) {
		this.registerip = registerip;
	}
	public int getRegisterrgid() {
		return registerrgid;
	}
	public void setRegisterrgid(int registerrgid) {
		this.registerrgid = registerrgid;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public int getRegionid() {
		return regionid;
	}
	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio.trim();
	}
    
}
