package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * ������־��Ϣ��
 */

public class CreditLogInfo {

	private int _logid;				//��־id
    private int _uid;				//�û�id
    private int _paycredits;		//֧������
    private int _rankcredits;		//�ȼ�����
    private int _action;			//��������
    private int _actioncode;		//��������
    private Date _actiontime;		//����ʱ��
    private Date _actiondes;		//��������
    private int _operator;			//������
    
    //������ getter setter ����
	public int get_logid() {
		return _logid;
	}
	public void set_logid(int _logid) {
		this._logid = _logid;
	}
	public int get_uid() {
		return _uid;
	}
	public void set_uid(int _uid) {
		this._uid = _uid;
	}
	public int get_paycredits() {
		return _paycredits;
	}
	public void set_paycredits(int _paycredits) {
		this._paycredits = _paycredits;
	}
	public int get_rankcredits() {
		return _rankcredits;
	}
	public void set_rankcredits(int _rankcredits) {
		this._rankcredits = _rankcredits;
	}
	public int get_action() {
		return _action;
	}
	public void set_action(int _action) {
		this._action = _action;
	}
	public int get_actioncode() {
		return _actioncode;
	}
	public void set_actioncode(int _actioncode) {
		this._actioncode = _actioncode;
	}
	public Date get_actiontime() {
		return _actiontime;
	}
	public void set_actiontime(Date _actiontime) {
		this._actiontime = _actiontime;
	}
	public Date get_actiondes() {
		return _actiondes;
	}
	public void set_actiondes(Date _actiondes) {
		this._actiondes = _actiondes;
	}
	public int get_operator() {
		return _operator;
	}
	public void set_operator(int _operator) {
		this._operator = _operator;
	}
    
    
    
}
