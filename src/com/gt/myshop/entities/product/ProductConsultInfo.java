package com.gt.myshop.entities.product;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:42:26
 * @description 商品咨询信息类
 *
 */
public class ProductConsultInfo {
	
	private int consultid;			//咨询id
    private int pid;				//商品id
    private int consulttypeid;		//咨询类型id
    private int state;				//状态(0代表显示，1代表屏蔽)
    private int consultuid;			//咨询用户id
    private int replyuid;			//回复用户id
    private int storeid;			//店铺id
    private Date consulttime;		//咨询时间
    private Date replytime;			//回复时间
    private String consultmessage;	//咨询内容
    private String replymessage;	//回复内容
    private String consultnickname;	//咨询昵称
    private String replynickname;	//回复昵称
    private String pname;			//商品名称
    private String pshowimg;		//商品图片
    private String consultip;		//咨询ip
    private String replyip;			//回复ip
    
    //以下是 getter setter 方法
	public int getConsultid() {
		return consultid;
	}
	public void setConsultid(int consultid) {
		this.consultid = consultid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getConsulttypeid() {
		return consulttypeid;
	}
	public void setConsulttypeid(int consulttypeid) {
		this.consulttypeid = consulttypeid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getConsultuid() {
		return consultuid;
	}
	public void setConsultuid(int consultuid) {
		this.consultuid = consultuid;
	}
	public int getReplyuid() {
		return replyuid;
	}
	public void setReplyuid(int replyuid) {
		this.replyuid = replyuid;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public Date getConsulttime() {
		return consulttime;
	}
	public void setConsulttime(Date consulttime) {
		this.consulttime = consulttime;
	}
	public Date getReplytime() {
		return replytime;
	}
	public void setReplytime(Date replytime) {
		this.replytime = replytime;
	}
	public String getConsultmessage() {
		return consultmessage;
	}
	public void setConsultmessage(String consultmessage) {
		this.consultmessage = consultmessage;
	}
	public String getReplymessage() {
		return replymessage;
	}
	public void setReplymessage(String replymessage) {
		this.replymessage = replymessage;
	}
	public String getConsultnickname() {
		return consultnickname;
	}
	public void setConsultnickname(String consultnickname) {
		this.consultnickname = consultnickname;
	}
	public String getReplynickname() {
		return replynickname;
	}
	public void setReplynickname(String replynickname) {
		this.replynickname = replynickname;
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
	public String getConsultip() {
		return consultip;
	}
	public void setConsultip(String consultip) {
		this.consultip = consultip;
	}
	public String getReplyip() {
		return replyip;
	}
	public void setReplyip(String replyip) {
		this.replyip = replyip;
	}
    
}
