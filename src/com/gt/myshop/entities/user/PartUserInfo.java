package com.gt.myshop.entities.user;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:55:07
 * @description 部分用户信息类
 *
 */
public class PartUserInfo {
	
	private int uid;				//用户id
    private String username = "";	//用户名称
    private String email = "";		//用户邮箱
    private String mobile = "";		//用户手机
    private String password = "";	//用户密码
    private int userrid;			//用户等级id
    private int storeid;			//店铺id
    private int mallagid;			//商城管理员组id
    private String nickname = "";	//用户昵称
    private String avatar;			//用户头像
    private int paycredits;			//支付积分
    private int rankcredits;		//等级积分
    private int verifyemail;		//是否验证邮箱
    private int verifymobile;		//是否验证手机
    private Date liftbantime = new Date();//解禁时间
    private String salt;			//盐值
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username.trim();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.trim();
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile.trim();
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password.trim();
	}
	public int getUserrid() {
		return userrid;
	}
	public void setUserrid(int userrid) {
		this.userrid = userrid;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getMallagid() {
		return mallagid;
	}
	public void setMallagid(int mallagid) {
		this.mallagid = mallagid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname.trim();
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar.trim();
	}
	public int getPaycredits() {
		return paycredits;
	}
	public void setPaycredits(int paycredits) {
		this.paycredits = paycredits;
	}
	public int getRankcredits() {
		return rankcredits;
	}
	public void setRankcredits(int rankcredits) {
		this.rankcredits = rankcredits;
	}
	public int getVerifyemail() {
		return verifyemail;
	}
	public void setVerifyemail(int verifyemail) {
		this.verifyemail = verifyemail;
	}
	public int getVerifymobile() {
		return verifymobile;
	}
	public void setVerifymobile(int verifymobile) {
		this.verifymobile = verifymobile;
	}
	public Date getLiftbantime() {
		return liftbantime;
	}
	public void setLiftbantime(Date liftbantime) {
		this.liftbantime = liftbantime;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
    
}
