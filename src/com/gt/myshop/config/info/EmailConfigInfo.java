package com.gt.myshop.config.info;


public class EmailConfigInfo {

	private String host;			//��������ַ
    private int port;				//�������˿�
    private String username;		//�����˺�
    private String password;		//��������
    private String from;			//��������
    private String fromname;		//����������ǳ�
    private String findpwdbody;	//�һ���������
    private String scverifybody;	//��ȫ������֤��������
    private String scupdatebody;	//��ȫ����ȷ�ϸ�����������
    private String webcomebody;	//ע�Ỷӭ��Ϣ
    
    //������ getter setter ����
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
