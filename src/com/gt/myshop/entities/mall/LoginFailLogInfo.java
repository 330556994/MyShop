package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * 登录失败日志信息类
 *
 */
public class LoginFailLogInfo {
	
	private int _id;
    private long _loginip;			//登录ip
    private int _failtimes;			//失败次数
    private Date _lastlogintime;//最后登录时间
    
    //以下是 getter setter 方法
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public long get_loginip() {
		return _loginip;
	}
	public void set_loginip(long _loginip) {
		this._loginip = _loginip;
	}
	public int get_failtimes() {
		return _failtimes;
	}
	public void set_failtimes(int _failtimes) {
		this._failtimes = _failtimes;
	}
	public Date get_lastlogintime() {
		return _lastlogintime;
	}
	public void set_lastlogintime(Date _lastlogintime) {
		this._lastlogintime = _lastlogintime;
	}
    
}
