package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 广告位置信息类
 *
 */
public class AdvertPositionInfo {
	
    private int _adposid;			//广告位置id
    private int _displayorder;		//排序
    private String _title;			//广告位置标题
    private String _description;	//广告位置描述
    
    //以下是 getter setter 方法
	public int get_adposid() {
		return _adposid;
	}
	public void set_adposid(int _adposid) {
		this._adposid = _adposid;
	}
	public int get_displayorder() {
		return _displayorder;
	}
	public void set_displayorder(int _displayorder) {
		this._displayorder = _displayorder;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String _description) {
		this._description = _description;
	}

}