package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * ���λ����Ϣ��
 *
 */
public class AdvertPositionInfo {
	
    private int _adposid;			//���λ��id
    private int _displayorder;		//����
    private String _title;			//���λ�ñ���
    private String _description;	//���λ������
    
    //������ getter setter ����
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