package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * �̳ǲ�����־��Ϣ��
 *
 */
public class MallAdminLogInfo {

	private int _logid;				//��־id
    private int _uid;				//�û�id
    private String _nickname;		//�û��ǳ�
    private int _mallagid;			//����Ա��id
    private String _mallagtitle;	//����Ա�����
    private String _operation;		//��������
    private String _description;	//��������
    private String _ip;				//ip
    private Date operatetime;		//����ʱ��
    
    //������ getter setter ����
	public int get_logid() {
		return _logid;
	}
	public void set_logid(int _logid) {
		this._logid = _logid;
	}
	public int get_uid() {
		return _uid;
	}
	public void set_uid(int _uid) {
		this._uid = _uid;
	}
	public String get_nickname() {
		return _nickname;
	}
	public void set_nickname(String _nickname) {
		this._nickname = _nickname;
	}
	public int get_mallagid() {
		return _mallagid;
	}
	public void set_mallagid(int _mallagid) {
		this._mallagid = _mallagid;
	}
	public String get_mallagtitle() {
		return _mallagtitle;
	}
	public void set_mallagtitle(String _mallagtitle) {
		this._mallagtitle = _mallagtitle;
	}
	public String get_operation() {
		return _operation;
	}
	public void set_operation(String _operation) {
		this._operation = _operation;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public String get_ip() {
		return _ip;
	}
	public void set_ip(String _ip) {
		this._ip = _ip;
	}
	public Date getOperatetime() {
		return operatetime;
	}
	public void setOperatetime(Date operatetime) {
		this.operatetime = operatetime;
	}
    
	
}
