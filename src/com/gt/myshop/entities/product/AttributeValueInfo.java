package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:33:22
 * @description ����ֵ��Ϣ��
 *
 */
public class AttributeValueInfo {
	
	private int attrvalueid = 0;			//����ֵid
    private String attrvalue = "";			//����ֵ
    private int isinput = 0;				//�Ƿ�Ϊ����ֵ
    private String attrname = "";			//��������
    private int attrdisplayorder = 0;		//��������
    private int attrshowtype;				//����չʾ����(0��������,1����ͼƬ)
    private int attrvaluedisplayorder = 0;	//����ֵ����
    private int attrgroupid;				//���Է���id
    private String attrgroupname = "";		//���Է�������
    private int attrgroupdisplayorder;		//���Է�������
    private int attrid = 0;					//����id
    
    //������ getter setter ����
	public int getAttrvalueid() {
		return attrvalueid;
	}
	public void setAttrvalueid(int attrvalueid) {
		this.attrvalueid = attrvalueid;
	}
	public String getAttrvalue() {
		return attrvalue.trim();
	}
	public void setAttrvalue(String attrvalue) {
		this.attrvalue = attrvalue;
	}
	public int getIsinput() {
		return isinput;
	}
	public void setIsinput(int isinput) {
		this.isinput = isinput;
	}
	public String getAttrname() {
		return attrname.trim();
	}
	public void setAttrname(String attrname) {
		this.attrname = attrname;
	}
	public int getAttrdisplayorder() {
		return attrdisplayorder;
	}
	public void setAttrdisplayorder(int attrdisplayorder) {
		this.attrdisplayorder = attrdisplayorder;
	}
	public int getAttrshowtype() {
		return attrshowtype;
	}
	public void setAttrshowtype(int attrshowtype) {
		this.attrshowtype = attrshowtype;
	}
	public int getAttrvaluedisplayorder() {
		return attrvaluedisplayorder;
	}
	public void setAttrvaluedisplayorder(int attrvaluedisplayorder) {
		this.attrvaluedisplayorder = attrvaluedisplayorder;
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
	public int getAttrgroupdisplayorder() {
		return attrgroupdisplayorder;
	}
	public void setAttrgroupdisplayorder(int attrgroupdisplayorder) {
		this.attrgroupdisplayorder = attrgroupdisplayorder;
	}
	public int getAttrid() {
		return attrid;
	}
	public void setAttrid(int attrid) {
		this.attrid = attrid;
	}
    
}
