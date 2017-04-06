package com.gt.myshop.entities.product;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午2:01:51
 * @description 商品评价信息类
 *
 */
public class ProductReviewInfo {
	
	private int reviewid;		//商品评价id
    private int pid;			//商品id
    private int uid;			//用户id
    private int oprid;			//订单商品记录id
    private int oid;			//订单id
    private int parentid;		//父id
    private int state;			//状态
    private int storeid;		//店铺id
    private int star;			//星星
    private int quality;		//评价质量
    private String message;		//评价信息
    private Date reviewtime;	//评价时间
    private int paycredits;		//支付积分
    private String pname;		//商品名称
    private String pshowimg;	//商品展示图片
    private Date buytime;		//购买时间
    private String ip;			//ip
    
    //以下是 getter setter 方法
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
