package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * ɸѡ����Ϣ��
 *
 */
public class FilterWordInfo {
	
	private int _id;
    private String _match;		//ƥ���
    private String _replace;	//�滻��
    
    //������ getter setter ����
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
