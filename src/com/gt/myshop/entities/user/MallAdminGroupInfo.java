package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:46:13
 * @description �̳ǹ���Ա����Ϣ��
 *
 */
public class MallAdminGroupInfo {
	private int mallagid;		//����Ա��id
    private String title;		//����Ա�����
    private String actionlist;	//����Ա����Ϊ�б�
    
    //������ getter setter ����
	public int getMallagid() {
		return mallagid;
	}
	public void setMallagid(int mallagid) {
		this.mallagid = mallagid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title.trim();
	}
	public String getActionlist() {
		return actionlist;
	}
	public void setActionlist(String actionlist) {
		this.actionlist = actionlist;
	}
}
