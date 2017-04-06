package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:46:13
 * @description 商城管理员组信息类
 *
 */
public class MallAdminGroupInfo {
	private int mallagid;		//管理员组id
    private String title;		//管理员组标题
    private String actionlist;	//管理员组行为列表
    
    //以下是 getter setter 方法
	public int getMallagid() {
		return mallagid;
	}
	public void setMallagid(int mallagid) {
		this.mallagid = mallagid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title.trim();
	}
	public String getActionlist() {
		return actionlist;
	}
	public void setActionlist(String actionlist) {
		this.actionlist = actionlist;
	}
}
