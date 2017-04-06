package com.gt.myshop.config.info;


public class EmailConfigInfo {

	private String host;			//服务器地址
    private int port;				//服务器端口
    private String username;		//邮箱账号
    private String password;		//邮箱密码
    private String from;			//发送邮箱
    private String fromname;		//发送邮箱的昵称
    private String findpwdbody;	//找回密码内容
    private String scverifybody;	//安全中心验证邮箱内容
    private String scupdatebody;	//安全中心确认更新邮箱内容
    private String webcomebody;	//注册欢迎信息
    
    //以下是 getter setter 方法
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getFromname() {
		return fromname;
	}
	public void setFromname(String fromname) {
		this.fromname = fromname;
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
