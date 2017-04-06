package com.gt.myshop.entities.store;

import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午8:03:09
 * @description 店铺信息类
 *
 */
public class StoreInfo {
	private int storeid;		//店铺id
    private int state;			//状态(0代表营业,1代表关闭)
    private  String  name;		//名称
    private int regionid;		//区域id
    private int storerid;		//等级id
    private int storeiid;		//行业id
    private  String  logo;		//logo
    private Date createtime;	//创建时间
    private  String  mobile;	//手机
    private  String  phone;		//固定电话
    private  String  qq;		//qq
    private  String  ww;		//阿里旺旺
    private double depoint;		//商品描述评分
    private double sepoint;		//商家服务评分
    private double shpoint;		//商家配送评分
    private int honesties;		//店铺诚信值
    private Date stateendtime;	//状态结束时间
    private String theme;		//主题
    private String banner;		//Banner
    private String announcement;//公告
    private String description;	//描述
    
    //以下是 getter setter 方法
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
