package com.gt.myshop.entities.user;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:49:09
 * @description �����û���Ϣ��
 *
 */
public class OnlineUserInfo {
	private int olid;			//�����û����
    private int uid;			//�����û�id
    private String sid;			//�����û�sid
    private String nickname;	//�û��ǳ�
    private String ip;			//�����û�ip
    private int regionid = -1;	//����id
    private Date updatetime;	//����ʱ��
    
    //������ getter setter ����
	public int getOlid() {
		return olid;
	}
	public void setOlid(int olid) {
		this.olid = olid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getRegionid() {
		return regionid;
	}
	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
}
