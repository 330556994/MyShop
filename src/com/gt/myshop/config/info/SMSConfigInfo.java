package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����11:48:57
 * @description ����������Ϣ�� 
 *
 */
public class SMSConfigInfo {
	
	private String url;				//���ŷ�������ַ
    private String username;		//�����˺�
    private String password;		//��������
    private String findpwdbody;		//�һ���������
    private String scverifybody;	//��ȫ������֤�ֻ�����
    private String scupdatebody;	//��ȫ����ȷ�ϸ����ֻ�����
    private String webcomebody;		//ע�Ỷӭ��Ϣ
    
    //������ getter setter ����
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
