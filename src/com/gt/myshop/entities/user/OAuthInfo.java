package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:47:39
 * @description ������Ȩ��Ϣ��
 *
 */
public class OAuthInfo {
	private int id;				//����id
    private int uid;			//�û�id
    private String openid;		//����id
    private String server;		//������
    
    //������ getter setter ����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid.trim();
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server.trim();
	}
    
}
