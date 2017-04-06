package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:47:39
 * @description 开放授权信息类
 *
 */
public class OAuthInfo {
	private int id;				//自增id
    private int uid;			//用户id
    private String openid;		//开放id
    private String server;		//服务商
    
    //以下是 getter setter 方法
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
