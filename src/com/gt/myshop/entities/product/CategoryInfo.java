package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:37:06
 * @description 分类信息类
 *
 */
public class CategoryInfo {
	
	private int cateid;				//分类id
    private int displayorder = 0;	//分类排序
    private String name = "";		//分类名称
    private String pricerange = "";	//分类价格范围
    private int parentid = 0;		//父id
    private int layer = 0;			//层级
    private int haschild = 0;		//是否有子节点
    private String path;			//分类路径
    
    //以下是 getter setter 方法
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
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
	public String getPricerange() {
		return pricerange;
	}
	public void setPricerange(String pricerange) {
		this.pricerange = pricerange.trim();
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getLayer() {
		return layer;
	}
	public void setLayer(int layer) {
		this.layer = layer;
	}
	public int getHaschild() {
		return haschild;
	}
	public void setHaschild(int haschild) {
		this.haschild = haschild;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path.trim();
	}
    
}
