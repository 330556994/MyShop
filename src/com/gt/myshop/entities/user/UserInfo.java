package com.gt.myshop.entities.user;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:00:51
 * @description �����û���Ϣ
 *
 */
public class UserInfo extends PartUserInfo {
	
	private Date lastvisittime = new Date();	//������ʱ��
    private String lastvisitip = "";			//������ip
    private int lastvisitrgid = -1;				//����������id
    private Date registertime = new Date();		//�û�ע��ʱ��
    private String registerip = "";				//�û�ע��ip
    private int registerrgid = -1;				//�û�ע������id
    private int gender = 0;						//�û��Ա�(0����δ֪��1�����У�2����Ů)
    private String realname = "";				//�û���ʵ����
    private Date bday = new Date();				//�û���������
    private String idcard = "";					//���֤��
    private int regionid = 0;					//����id
    private String address = "";				//���ڵ�
    private String bio = "";					//���
    
    //������ getter setter ����
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
