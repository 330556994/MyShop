package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 帮助信息类
 *
 */
public class HelpInfo {

	private int _id;					//编号
    private int _pid = 0;				//父编号
    private String _title = "";			//标题
    private String _url = "";			//网址
    private String _description = "";	//描述
    private int _displayorder = 0;		//排序
    
    //以下是 getter setter 方法
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int get_pid() {
		return _pid;
	}
	public void set_pid(int _pid) {
		this._pid = _pid;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_url() {
		return _url;
	}
	public void set_url(String _url) {
		this._url = _url;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}
	public int get_displayorder() {
		return _displayorder;
	}
	public void set_displayorder(int _displayorder) {
		this._displayorder = _displayorder;
	}
    
    
	
}
