package com.gt.myshop.entities.user;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:55:07
 * @description �����û���Ϣ��
 *
 */
public class PartUserInfo {
	
	private int uid;				//�û�id
    private String username = "";	//�û�����
    private String email = "";		//�û�����
    private String mobile = "";		//�û��ֻ�
    private String password = "";	//�û�����
    private int userrid;			//�û��ȼ�id
    private int storeid;			//����id
    private int mallagid;			//�̳ǹ���Ա��id
    private String nickname = "";	//�û��ǳ�
    private String avatar;			//�û�ͷ��
    private int paycredits;			//֧������
    private int rankcredits;		//�ȼ�����
    private int verifyemail;		//�Ƿ���֤����
    private int verifymobile;		//�Ƿ���֤�ֻ�
    private Date liftbantime = new Date();//���ʱ��
    private String salt;			//��ֵ
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
