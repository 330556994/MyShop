package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����2:04:11
 * @description ��Ʒsku����Ϣ��
 *
 */
public class ProductSKUItemInfo {
	private int recordid;			//��¼id
    private int skugid;				//sku��id
    private int pid;				//��Ʒid
    private int attrid;				//����id
    private int attrvalueid;		//����ֵid
    private String inputvalue;		//����ֵ
    
    //������ getter setter ����
	public int getRecordid() {
		return recordid;
	}
	public void setRecordid(int recordid) {
		this.recordid = recordid;
	}
	public int getSkugid() {
		return skugid;
	}
	public void setSkugid(int skugid) {
		this.skugid = skugid;
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
