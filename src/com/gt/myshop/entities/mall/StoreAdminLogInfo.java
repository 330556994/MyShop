package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * 店铺管理日志信息类
 *
 */
public class StoreAdminLogInfo {

	private int _logid;//日志id
    private int _uid;//用户id
    private String _nickname;//用户昵称
    private int _storeid;//店铺id
    private String _storename;//店铺名称
    private String _operation;//操作动作
    private String _description;//操作描述
    private String _ip;//ip
    private Date operatetime;//操作时间
    
    //以下是 getter setter 方法
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
	public int get_storeid() {
		return _storeid;
	}
	public void set_storeid(int _storeid) {
		this._storeid = _storeid;
	}
	public String get_storename() {
		return _storename;
	}
	public void set_storename(String _storename) {
		this._storename = _storename;
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
