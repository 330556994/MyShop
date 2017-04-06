package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * PV统计信息类
 *
 */
public class PVStatInfo {

	private int _recordid;		//记录id
    private int _storeid;		//店铺id
    private String _category;	//类别
    private String _value;		//值
    private int _count;			//数量
    
    //以下是 getter setter 方法
	public int get_recordid() {
		return _recordid;
	}
	public void set_recordid(int _recordid) {
		this._recordid = _recordid;
	}
	public int get_storeid() {
		return _storeid;
	}
	public void set_storeid(int _storeid) {
		this._storeid = _storeid;
	}
	public String get_category() {
		return _category;
	}
	public void set_category(String _category) {
		this._category = _category;
	}
	public String get_value() {
		return _value;
	}
	public void set_value(String _value) {
		this._value = _value;
	}
	public int get_count() {
		return _count;
	}
	public void set_count(int _count) {
		this._count = _count;
	}
    
    
}
