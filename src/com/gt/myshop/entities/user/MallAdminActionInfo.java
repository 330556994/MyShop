package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:44:04
 * @description �̳Ǻ�̨������Ϣ��
 *
 */
public class MallAdminActionInfo {
	private int aid;			//����id
    private String title;		//��������
    private String action;		//������Ϊ
    private int parentid;		//��id
    private int displayorder;	//����
    
    //������ getter setter ����
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title.trim();
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action.trim();
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
