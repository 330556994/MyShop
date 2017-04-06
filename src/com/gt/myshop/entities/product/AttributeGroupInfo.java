package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:29:49
 * @description 属性分组信息类
 *
 */
public class AttributeGroupInfo {
	private int attrgroupid;			//属性分组id
    private int cateid;					//分类id
    private String name = "";			//分组名称
    private int displayorder;			//分组排序
    
    //以下是 getter setter 方法
	public int getAttrgroupid() {
		return attrgroupid;
	}
	public void setAttrgroupid(int attrgroupid) {
		this.attrgroupid = attrgroupid;
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
