package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:35:33
 * @description Ʒ����Ϣ��
 *
 */
public class BrandInfo {
	
	private int brandid;			//Ʒ��id
    private int displayorder = 0;	//Ʒ������
    private String name = "";		//Ʒ������
    private String logo = "";		//Ʒ��logo
    
    //������ getter setter ����
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo.trim();
	}
    
}
