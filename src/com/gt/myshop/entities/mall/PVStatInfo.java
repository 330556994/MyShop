package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * PVͳ����Ϣ��
 *
 */
public class PVStatInfo {

	private int _recordid;		//��¼id
    private int _storeid;		//����id
    private String _category;	//���
    private String _value;		//ֵ
    private int _count;			//����
    
    //������ getter setter ����
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
