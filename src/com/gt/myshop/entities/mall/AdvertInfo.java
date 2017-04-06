package com.gt.myshop.entities.mall;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 
 * @author GongTao
 * �����Ϣ��
 *
 */

public class AdvertInfo{
	
	public AdvertInfo() {
		//System.out.println("AdvertInfo.AdvertInfo()");
	}
	
    private int adid;				//���id
    private int clickcount;			//�����
    private int adposid;			//���λ��id
    private int state;				//״̬
    private Date starttime;			//��ʼʱ��
    private Date endtime;			//����ʱ��
    private int displayorder;		//����
    private String title;			//����
    private String image;			//ͼƬ
    private String url;				//��ַ
    private String extfield1;		//��չ�ֶ�1
    private String extfield2;		//��չ�ֶ�2
    private String extfield3;		//��չ�ֶ�3
    private String extfield4;		//��չ�ֶ�4
    private String extfield5;		//��չ�ֶ�5
    
    //������ getter setter ����
	public int getadid() {
		return adid;
	}
	public void setadid(int adid) {
		//System.out.println("ע��ֵ"+adid);
		this.adid = adid;
	}
	public int getclickcount() {
		return clickcount;
	}
	public void setclickcount(int clickcount) {
		this.clickcount = clickcount;
	}
	public int getadposid() {
		return adposid;
	}
	public void setadposid(int adposid) {
		this.adposid = adposid;
	}
	public int getstate() {
		return state;
	}
	public void setstate(int state) {
		this.state = state;
	}
	public Date getstarttime() {
		return starttime;
	}
	public void setstarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getendtime() {
		return endtime;
	}
	public void setendtime(Date endtime) {
		this.endtime = endtime;
	}
	public int getdisplayorder() {
		return displayorder;
	}
	public void setdisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getimage() {
		return image;
	}
	public void setimage(String image) {
		this.image = image;
	}
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	}
	public String getextfield1() {
		return extfield1;
	}
	public void setextfield1(String extfield1) {
		this.extfield1 = extfield1;
	}
	public String getextfield2() {
		return extfield2;
	}
	public void setextfield2(String extfield2) {
		this.extfield2 = extfield2;
	}
	public String getextfield3() {
		return extfield3;
	}
	public void setextfield3(String extfield3) {
		this.extfield3 = extfield3;
	}
	public String getextfield4() {
		return extfield4;
	}
	public void setextfield4(String extfield4) {
		this.extfield4 = extfield4;
	}
	public String getextfield5() {
		return extfield5;
	}
	public void setextfield5(String extfield5) {
		this.extfield5 = extfield5;
	}
	@Override
	public String toString() {
		return "AdvertInfo [adid=" + adid + ", clickcount=" + clickcount
				+ ", adposid=" + adposid + ", state=" + state
				+ ", starttime=" + starttime + ", endtime=" + endtime
				+ ", displayorder=" + displayorder + ", title=" + title
				+ ", image=" + image + ", url=" + url + ", extfield1="
				+ extfield1 + ", extfield2=" + extfield2 + ", extfield3="
				+ extfield3 + ", extfield4=" + extfield4 + ", extfield5="
				+ extfield5 + "]";
	}
    
    
    

}
