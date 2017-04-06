package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 禁止IP信息类
 *
 */
public class BannedIPInfo {

	private int _id;				//id
    private String _ip;				//ip地址
    private String _liftbantime;	//解禁时间
    
    //以下是 getter setter 方法
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_ip() {
		return _ip;
	}
	public void set_ip(String _ip) {
		this._ip = _ip;
	}
	public String get_liftbantime() {
		return _liftbantime;
	}
	public void set_liftbantime(String _liftbantime) {
		this._liftbantime = _liftbantime;
	}
    
    
    
}
