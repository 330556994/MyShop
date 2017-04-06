package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:38:59
 * @description 商品属性信息类
 *
 */
public class ProductAttributeInfo {
	
	private int recordid;			//记录id
    private int pid;				//商品id
    private int attrid;				//属性id
    private int attrvalueid;		//属性值id
    private String inputvalue;		//输入值
    
    //以下是 getter setter 方法
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getAttrid() {
		return attrid;
	}
	public void setAttrid(int attrid) {
		this.attrid = attrid;
	}
	public int getAttrvalueid() {
		return attrvalueid;
	}
	public void setAttrvalueid(int attrvalueid) {
		this.attrvalueid = attrvalueid;
	}
	public String getInputvalue() {
		return inputvalue;
	}
	public void setInputvalue(String inputvalue) {
		this.inputvalue = inputvalue;
	}
    
}
