package com.gt.myshop.entities.store;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����8:03:09
 * @description ������Ϣ��
 *
 */
public class StoreInfo {
	private int storeid;		//����id
    private int state;			//״̬(0����Ӫҵ,1����ر�)
    private  String  name;		//����
    private int regionid;		//����id
    private int storerid;		//�ȼ�id
    private int storeiid;		//��ҵid
    private  String  logo;		//logo
    private Date createtime;	//����ʱ��
    private  String  mobile;	//�ֻ�
    private  String  phone;		//�̶��绰
    private  String  qq;		//qq
    private  String  ww;		//��������
    private double depoint;		//��Ʒ��������
    private double sepoint;		//�̼ҷ�������
    private double shpoint;		//�̼���������
    private int honesties;		//���̳���ֵ
    private Date stateendtime;	//״̬����ʱ��
    private String theme;		//����
    private String banner;		//Banner
    private String announcement;//����
    private String description;	//����
    
    //������ getter setter ����
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public int getRegionid() {
		return regionid;
	}
	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}
	public int getStorerid() {
		return storerid;
	}
	public void setStorerid(int storerid) {
		this.storerid = storerid;
	}
	public int getStoreiid() {
		return storeiid;
	}
	public void setStoreiid(int storeiid) {
		this.storeiid = storeiid;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo.trim();
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile.trim();
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone.trim();
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq.trim();
	}
	public String getWw() {
		return ww;
	}
	public void setWw(String ww) {
		this.ww = ww.trim();
	}
	public double getDepoint() {
		return depoint;
	}
	public void setDepoint(double depoint) {
		this.depoint = depoint;
	}
	public double getSepoint() {
		return sepoint;
	}
	public void setSepoint(double sepoint) {
		this.sepoint = sepoint;
	}
	public double getShpoint() {
		return shpoint;
	}
	public void setShpoint(double shpoint) {
		this.shpoint = shpoint;
	}
	public int getHonesties() {
		return honesties;
	}
	public void setHonesties(int honesties) {
		this.honesties = honesties;
	}
	public Date getStateendtime() {
		return stateendtime;
	}
	public void setStateendtime(Date stateendtime) {
		this.stateendtime = stateendtime;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme.trim();
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner.trim();
	}
	public String getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(String announcement) {
		this.announcement = announcement.trim();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description.trim();
	}
    
}
