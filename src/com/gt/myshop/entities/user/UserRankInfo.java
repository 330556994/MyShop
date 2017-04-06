package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:04:42
 * @description 用户等级信息类
 *
 */
public class UserRankInfo {
	
	private int userrid;		//用户等级id
    private int system;			//是否是系统等级
    private String title;		//用户等级标题
    private String avatar;		//用户等级头像
    private int creditsupper;	//用户等级积分上限
    private int creditslower;	//用户等级积分下限
    private int limitdays;		//限制天数
    
    //以下是 getter setter方法
	public int getUserrid() {
		return userrid;
	}
	public void setUserrid(int userrid) {
		this.userrid = userrid;
	}
	public int getSystem() {
		return system;
	}
	public void setSystem(int system) {
		this.system = system;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title.trim();
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar.trim();
	}
	public int getCreditsupper() {
		return creditsupper;
	}
	public void setCreditsupper(int creditsupper) {
		this.creditsupper = creditsupper;
	}
	public int getCreditslower() {
		return creditslower;
	}
	public void setCreditslower(int creditslower) {
		this.creditslower = creditslower;
	}
	public int getLimitdays() {
		return limitdays;
	}
	public void setLimitdays(int limitdays) {
		this.limitdays = limitdays;
	}
    
}
