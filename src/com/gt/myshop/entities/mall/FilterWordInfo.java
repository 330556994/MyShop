package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 筛选词信息类
 *
 */
public class FilterWordInfo {
	
	private int _id;
    private String _match;		//匹配词
    private String _replace;	//替换词
    
    //以下是 getter setter 方法
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_match() {
		return _match;
	}
	public void set_match(String _match) {
		this._match = _match;
	}
	public String get_replace() {
		return _replace;
	}
	public void set_replace(String _replace) {
		this._replace = _replace;
	}
    
}
