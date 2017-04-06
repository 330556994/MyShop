package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 区域信息类
 *
 */
public class RegionInfo {

	private int _regionid;			//区域id
    private String _name;			//名称
    private String _spell;			//拼写
    private String _shortspell;		//简拼
    private int _displayorder;		//排序
    private int _parentid;			//父id
    private int _layer;				//级别
    private int _provinceid;		//省id
    private String _provincename;	//省名称
    private int _cityid;			//市id
    private String _cityname;		//市名称
    
    //以下是 getter setter 方法
	public int get_regionid() {
		return _regionid;
	}
	public void set_regionid(int _regionid) {
		this._regionid = _regionid;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_spell() {
		return _spell;
	}
	public void set_spell(String _spell) {
		this._spell = _spell;
	}
	public String get_shortspell() {
		return _shortspell;
	}
	public void set_shortspell(String _shortspell) {
		this._shortspell = _shortspell;
	}
	public int get_displayorder() {
		return _displayorder;
	}
	public void set_displayorder(int _displayorder) {
		this._displayorder = _displayorder;
	}
	public int get_parentid() {
		return _parentid;
	}
	public void set_parentid(int _parentid) {
		this._parentid = _parentid;
	}
	public int get_layer() {
		return _layer;
	}
	public void set_layer(int _layer) {
		this._layer = _layer;
	}
	public int get_provinceid() {
		return _provinceid;
	}
	public void set_provinceid(int _provinceid) {
		this._provinceid = _provinceid;
	}
	public String get_provincename() {
		return _provincename;
	}
	public void set_provincename(String _provincename) {
		this._provincename = _provincename;
	}
	public int get_cityid() {
		return _cityid;
	}
	public void set_cityid(int _cityid) {
		this._cityid = _cityid;
	}
	public String get_cityname() {
		return _cityname;
	}
	public void set_cityname(String _cityname) {
		this._cityname = _cityname;
	}
}
