package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:29:49
 * @description ���Է�����Ϣ��
 *
 */
public class AttributeGroupInfo {
	private int attrgroupid;			//���Է���id
    private int cateid;					//����id
    private String name = "";			//��������
    private int displayorder;			//��������
    
    //������ getter setter ����
	public int getAttrgroupid() {
		return attrgroupid;
	}
	public void setAttrgroupid(int attrgroupid) {
		this.attrgroupid = attrgroupid;
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
