package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:37:06
 * @description ������Ϣ��
 *
 */
public class CategoryInfo {
	
	private int cateid;				//����id
    private int displayorder = 0;	//��������
    private String name = "";		//��������
    private String pricerange = "";	//����۸�Χ
    private int parentid = 0;		//��id
    private int layer = 0;			//�㼶
    private int haschild = 0;		//�Ƿ����ӽڵ�
    private String path;			//����·��
    
    //������ getter setter ����
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public String getPricerange() {
		return pricerange;
	}
	public void setPricerange(String pricerange) {
		this.pricerange = pricerange.trim();
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public int getHaschild() {
		return haschild;
	}
	public void setHaschild(int haschild) {
		this.haschild = haschild;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path.trim();
	}
    
}
