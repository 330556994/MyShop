package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 配送公司信息类
 *
 */
public class ShipCompanyInfo {

	private int _shipcoid;		//配送公司id
    private String _name;		//名称
    private int _displayorder;	//排序
    
    //以下是 getter setter 方法
	public int get_shipcoid() {
		return _shipcoid;
	}
	public void set_shipcoid(int _shipcoid) {
		this._shipcoid = _shipcoid;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public int get_displayorder() {
		return _displayorder;
	}
	public void set_displayorder(int _displayorder) {
		this._displayorder = _displayorder;
	}
}
