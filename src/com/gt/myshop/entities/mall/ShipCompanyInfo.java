package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * ���͹�˾��Ϣ��
 *
 */
public class ShipCompanyInfo {

	private int _shipcoid;		//���͹�˾id
    private String _name;		//����
    private int _displayorder;	//����
    
    //������ getter setter ����
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
