package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:04:42
 * @description �û��ȼ���Ϣ��
 *
 */
public class UserRankInfo {
	
	private int userrid;		//�û��ȼ�id
    private int system;			//�Ƿ���ϵͳ�ȼ�
    private String title;		//�û��ȼ�����
    private String avatar;		//�û��ȼ�ͷ��
    private int creditsupper;	//�û��ȼ���������
    private int creditslower;	//�û��ȼ���������
    private int limitdays;		//��������
    
    //������ getter setter����
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
