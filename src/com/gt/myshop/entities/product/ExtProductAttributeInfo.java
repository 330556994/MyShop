package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:41:34
 * @description ��չ��Ʒ������Ϣ��
 *
 */
public class ExtProductAttributeInfo extends ProductAttributeInfo {
	private String attrvalue = "";		//����ֵ
    private int isinput = 0;			//�Ƿ�Ϊ����ֵ
    private String attrname = "";		//��������
    private int attrgroupid;			//���Է���id
    private String attrgroupname = "";	//���Է�������
    
    //������ getter setter ����
	public String getAttrvalue() {
		return attrvalue;
	}
	public void setAttrvalue(String attrvalue) {
		this.attrvalue = attrvalue.trim();
	}
	public int getIsinput() {
		return isinput;
	}
	public void setIsinput(int isinput) {
		this.isinput = isinput;
	}
	public String getAttrname() {
		return attrname;
	}
	public void setAttrname(String attrname) {
		this.attrname = attrname.trim();
	}
	public int getAttrgroupid() {
		return attrgroupid;
	}
	public void setAttrgroupid(int attrgroupid) {
		this.attrgroupid = attrgroupid;
	}
	public String getAttrgroupname() {
		return attrgroupname;
	}
	public void setAttrgroupname(String attrgroupname) {
		this.attrgroupname = attrgroupname.trim();
	}
    
}
