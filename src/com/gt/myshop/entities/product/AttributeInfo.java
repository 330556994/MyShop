package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:31:34
 * @description ������Ϣ��
 *
 */
public class AttributeInfo {
	private int attrid;				//����id
    private String name = "";		//��������
    private int cateid = 0;			//����id
    private int attrgroupid;		//����id
    private int showtype = 0;		//չʾ����(0��������,1����ͼƬ)
    private int isfilter = 0;		//�Ƿ���ɸѡ����
    private int displayorder = 0;	//����
    
    //������ getter setter ����
	public int getAttrid() {
		return attrid;
	}
	public void setAttrid(int attrid) {
		this.attrid = attrid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public int getAttrgroupid() {
		return attrgroupid;
	}
	public void setAttrgroupid(int attrgroupid) {
		this.attrgroupid = attrgroupid;
	}
	public int getShowtype() {
		return showtype;
	}
	public void setShowtype(int showtype) {
		this.showtype = showtype;
	}
	public int getIsfilter() {
		return isfilter;
	}
	public void setIsfilter(int isfilter) {
		this.isfilter = isfilter;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
