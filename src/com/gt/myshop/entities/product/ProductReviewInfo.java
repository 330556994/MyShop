package com.gt.myshop.entities.product;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����2:01:51
 * @description ��Ʒ������Ϣ��
 *
 */
public class ProductReviewInfo {
	
	private int reviewid;		//��Ʒ����id
    private int pid;			//��Ʒid
    private int uid;			//�û�id
    private int oprid;			//������Ʒ��¼id
    private int oid;			//����id
    private int parentid;		//��id
    private int state;			//״̬
    private int storeid;		//����id
    private int star;			//����
    private int quality;		//��������
    private String message;		//������Ϣ
    private Date reviewtime;	//����ʱ��
    private int paycredits;		//֧������
    private String pname;		//��Ʒ����
    private String pshowimg;	//��ƷչʾͼƬ
    private Date buytime;		//����ʱ��
    private String ip;			//ip
    
    //������ getter setter ����
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getOprid() {
		return oprid;
	}
	public void setOprid(int oprid) {
		this.oprid = oprid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getReviewtime() {
		return reviewtime;
	}
	public void setReviewtime(Date reviewtime) {
		this.reviewtime = reviewtime;
	}
	public int getPaycredits() {
		return paycredits;
	}
	public void setPaycredits(int paycredits) {
		this.paycredits = paycredits;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPshowimg() {
		return pshowimg;
	}
	public void setPshowimg(String pshowimg) {
		this.pshowimg = pshowimg;
	}
	public Date getBuytime() {
		return buytime;
	}
	public void setBuytime(Date buytime) {
		this.buytime = buytime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
    
}
