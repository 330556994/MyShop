package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao	
 * 导航栏信息类
 *
 */
public class NavInfo {
	
	private int id;				//编号
    private int pid;			//父编号
    private int layer;			//级别
    private String name;		//名称
    private String title;		//标题
    private String url;			//网址
    private int target;			//打开目标
    private int displayorder;	//排序
    
    //以下是 getter setter 方法
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getpid() {
		return pid;
	}
	public void setpid(int pid) {
		this.pid = pid;
	}
	public int getlayer() {
		return layer;
	}
	public void setlayer(int layer) {
		this.layer = layer;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String geturl() {
		return url;
	}
	public void seturl(String url) {
		this.url = url;
	}
	public int gettarget() {
		return target;
	}
	public void settarget(int target) {
		this.target = target;
	}
	public int getdisplayorder() {
		return displayorder;
	}
	public void setdisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    

}
