package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 新闻类型信息类
 *
 */
public class NewsTypeInfo {

	private int _newstypeid;		//新闻类型id
    private String _name;			//名称
    private int _displayorder = 0;	//排序
    
    //以下是 getter setter 方法
	public int get_newstypeid() {
		return _newstypeid;
	}
	public void set_newstypeid(int _newstypeid) {
		this._newstypeid = _newstypeid;
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
