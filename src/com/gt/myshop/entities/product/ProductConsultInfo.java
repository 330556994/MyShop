package com.gt.myshop.entities.product;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:42:26
 * @description ��Ʒ��ѯ��Ϣ��
 *
 */
public class ProductConsultInfo {
	
	private int consultid;			//��ѯid
    private int pid;				//��Ʒid
    private int consulttypeid;		//��ѯ����id
    private int state;				//״̬(0������ʾ��1��������)
    private int consultuid;			//��ѯ�û�id
    private int replyuid;			//�ظ��û�id
    private int storeid;			//����id
    private Date consulttime;		//��ѯʱ��
    private Date replytime;			//�ظ�ʱ��
    private String consultmessage;	//��ѯ����
    private String replymessage;	//�ظ�����
    private String consultnickname;	//��ѯ�ǳ�
    private String replynickname;	//�ظ��ǳ�
    private String pname;			//��Ʒ����
    private String pshowimg;		//��ƷͼƬ
    private String consultip;		//��ѯip
    private String replyip;			//�ظ�ip
    
    //������ getter setter ����
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
