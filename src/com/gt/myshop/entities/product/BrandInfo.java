package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:35:33
 * @description 品牌信息类
 *
 */
public class BrandInfo {
	
	private int brandid;			//品牌id
    private int displayorder = 0;	//品牌排序
    private String name = "";		//品牌名称
    private String logo = "";		//品牌logo
    
    //以下是 getter setter 方法
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
