package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:31:34
 * @description 属性信息类
 *
 */
public class AttributeInfo {
	private int attrid;				//属性id
    private String name = "";		//属性名称
    private int cateid = 0;			//分类id
    private int attrgroupid;		//分组id
    private int showtype = 0;		//展示类型(0代表文字,1代表图片)
    private int isfilter = 0;		//是否是筛选属性
    private int displayorder = 0;	//排序
    
    //以下是 getter setter 方法
	public int getAttrid() {
		return attrid;
	}
	public void setAttrid(int attrid) {
		this.attrid = attrid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public int getAttrgroupid() {
		return attrgroupid;
	}
	public void setAttrgroupid(int attrgroupid) {
		this.attrgroupid = attrgroupid;
	}
	public int getShowtype() {
		return showtype;
	}
	public void setShowtype(int showtype) {
		this.showtype = showtype;
	}
	public int getIsfilter() {
		return isfilter;
	}
	public void setIsfilter(int isfilter) {
		this.isfilter = isfilter;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
