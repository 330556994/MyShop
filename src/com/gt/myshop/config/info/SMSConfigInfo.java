package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:48:57
 * @description 短信配置信息类 
 *
 */
public class SMSConfigInfo {
	
	private String url;				//短信服务器地址
    private String username;		//短信账号
    private String password;		//短信密码
    private String findpwdbody;		//找回密码内容
    private String scverifybody;	//安全中心验证手机内容
    private String scupdatebody;	//安全中心确认更新手机内容
    private String webcomebody;		//注册欢迎信息
    
    //以下是 getter setter 方法
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFindpwdbody() {
		return findpwdbody;
	}
	public void setFindpwdbody(String findpwdbody) {
		this.findpwdbody = findpwdbody;
	}
	public String getScverifybody() {
		return scverifybody;
	}
	public void setScverifybody(String scverifybody) {
		this.scverifybody = scverifybody;
	}
	public String getScupdatebody() {
		return scupdatebody;
	}
	public void setScupdatebody(String scupdatebody) {
		this.scupdatebody = scupdatebody;
	}
	public String getWebcomebody() {
		return webcomebody;
	}
	public void setWebcomebody(String webcomebody) {
		this.webcomebody = webcomebody;
	}
    
}
