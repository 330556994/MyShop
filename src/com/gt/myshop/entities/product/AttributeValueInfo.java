package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:33:22
 * @description 属性值信息类
 *
 */
public class AttributeValueInfo {
	
	private int attrvalueid = 0;			//属性值id
    private String attrvalue = "";			//属性值
    private int isinput = 0;				//是否为输入值
    private String attrname = "";			//属性名称
    private int attrdisplayorder = 0;		//属性排序
    private int attrshowtype;				//属性展示类型(0代表文字,1代表图片)
    private int attrvaluedisplayorder = 0;	//属性值排序
    private int attrgroupid;				//属性分组id
    private String attrgroupname = "";		//属性分组名称
    private int attrgroupdisplayorder;		//属性分组排序
    private int attrid = 0;					//属性id
    
    //以下是 getter setter 方法
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
