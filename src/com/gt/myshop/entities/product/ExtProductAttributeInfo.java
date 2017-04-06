package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:41:34
 * @description 扩展商品属性信息类
 *
 */
public class ExtProductAttributeInfo extends ProductAttributeInfo {
	private String attrvalue = "";		//属性值
    private int isinput = 0;			//是否为输入值
    private String attrname = "";		//属性名称
    private int attrgroupid;			//属性分组id
    private String attrgroupname = "";	//属性分组名称
    
    //以下是 getter setter 方法
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
