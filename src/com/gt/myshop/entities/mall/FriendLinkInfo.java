package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 友情链接信息类
 *
 */
public class FriendLinkInfo {
	
	private int _id;			//编号
    private String _name;		//名称
    private String _title;		//提示标题
    private String _logo;		//logo
    private String _url;		//网址
    private int _target;		//打开目标
    private int _displayorder;	//排序
    
    //以下是 getter setter 方法
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_logo() {
		return _logo;
	}
	public void set_logo(String _logo) {
		this._logo = _logo;
	}
	public String get_url() {
		return _url;
	}
	public void set_url(String _url) {
		this._url = _url;
	}
	public int get_target() {
		return _target;
	}
	public void set_target(int _target) {
		this._target = _target;
	}
	public int get_displayorder() {
		return _displayorder;
	}
	public void set_displayorder(int _displayorder) {
		this._displayorder = _displayorder;
	}
    
    
    

}
