package com.gt.myshop.entities.order;

import java.util.Date;

/**
 * 
 * @author GongTao
 * 订单处理信息类
 *
 */
public class OrderActionInfo {

	private int _aid;				//处理id
    private int _oid;				//订单id
    private int _uid;				//用户id
    private String _realname;		//真实名称
    private int _actiontype;		//处理类型
    private Date _actiontime;		//处理时间
    private String _actiondes = "";	//处理描述
    
    //以下是 getter setter 方法
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
