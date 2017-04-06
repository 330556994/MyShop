package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:44:04
 * @description 商城后台操作信息类
 *
 */
public class MallAdminActionInfo {
	private int aid;			//操作id
    private String title;		//操作标题
    private String action;		//操作行为
    private int parentid;		//父id
    private int displayorder;	//排序
    
    //以下是 getter setter 方法
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title.trim();
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action.trim();
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
