package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:45:55
 * @description 商品图片信息类
 *
 */
public class ProductImageInfo {
	
	private int pimgid;			//商品图片id
    private int pid;			//商品id
    private String showimg;		//商品图片
    private int ismain;			//是否为主图
    private int displayorder;	//商品图片排序
    private int storeid = 0;	//店铺id
    
    //以下是 getter setter 方法
	public int getPimgid() {
		return pimgid;
	}
	public void setPimgid(int pimgid) {
		this.pimgid = pimgid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getShowimg() {
		return showimg;
	}
	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}
	public int getIsmain() {
		return ismain;
	}
	public void setIsmain(int ismain) {
		this.ismain = ismain;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
    
}
