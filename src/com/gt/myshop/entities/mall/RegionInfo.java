package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * ������Ϣ��
 *
 */
public class RegionInfo {

	private int _regionid;			//����id
    private String _name;			//����
    private String _spell;			//ƴд
    private String _shortspell;		//��ƴ
    private int _displayorder;		//����
    private int _parentid;			//��id
    private int _layer;				//����
    private int _provinceid;		//ʡid
    private String _provincename;	//ʡ����
    private int _cityid;			//��id
    private String _cityname;		//������
    
    //������ getter setter ����
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
