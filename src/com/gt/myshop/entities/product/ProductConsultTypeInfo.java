package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:44:53
 * @description 商品咨询类型信息类
 *
 */
public class ProductConsultTypeInfo {
	private int consulttypeid;	//咨询类型id
    private String title;		//咨询类型标题
    private int displayorder;	//排序
    
    //以下是 getter setter 方法
	public int getConsulttypeid() {
		return consulttypeid;
	}
	public void setConsulttypeid(int consulttypeid) {
		this.consulttypeid = consulttypeid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
