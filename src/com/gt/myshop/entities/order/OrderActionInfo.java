package com.gt.myshop.entities.order;

import java.util.Date;

/**
 * 
 * @author GongTao
 * ����������Ϣ��
 *
 */
public class OrderActionInfo {

	private int _aid;				//����id
    private int _oid;				//����id
    private int _uid;				//�û�id
    private String _realname;		//��ʵ����
    private int _actiontype;		//��������
    private Date _actiontime;		//����ʱ��
    private String _actiondes = "";	//��������
    
    //������ getter setter ����
	public int get_aid() {
		return _aid;
	}
	public void set_aid(int _aid) {
		this._aid = _aid;
	}
	public int get_oid() {
		return _oid;
	}
	public void set_oid(int _oid) {
		this._oid = _oid;
	}
	public int get_uid() {
		return _uid;
	}
	public void set_uid(int _uid) {
		this._uid = _uid;
	}
	public String get_realname() {
		return _realname;
	}
	public void set_realname(String _realname) {
		this._realname = _realname;
	}
	public int get_actiontype() {
		return _actiontype;
	}
	public void set_actiontype(int _actiontype) {
		this._actiontype = _actiontype;
	}
	public Date get_actiontime() {
		return _actiontime;
	}
	public void set_actiontime(Date _actiontime) {
		this._actiontime = _actiontime;
	}
	public String get_actiondes() {
		return _actiondes;
	}
	public void set_actiondes(String _actiondes) {
		this._actiondes = _actiondes;
	}
    
    
	
}
