package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * 新闻信息类
 *
 */
public class NewsInfo {
	
	private int newsid;				//新闻id
    private int newstypeid = 0;		//新闻类型id
    private int isshow = 0;			//是否显示
    private int istop = 0;			//是否置顶
    private int ishome = 0;			//是否置首
    private int displayorder = 0;	//排序
    private Date addtime;			//添加时间
    private String title = "";		//标题
    private String url = "";		//网址
    private String body = "";		//内容
    
    //以下是 getter setter 方法
	public int getnewsid() {
		return newsid;
	}
	public void setnewsid(int newsid) {
		this.newsid = newsid;
	}
	public int getnewstypeid() {
		return newstypeid;
	}
	public void setnewstypeid(int newstypeid) {
		this.newstypeid = newstypeid;
	}
	public int getisshow() {
		return isshow;
	}
	public void setisshow(int isshow) {
		this.isshow = isshow;
	}
	public int getistop() {
		return istop;
	}
	public void setistop(int istop) {
		this.istop = istop;
	}
	public int getishome() {
		return ishome;
	}
	public void setishome(int ishome) {
		this.ishome = ishome;
	}
	public int getdisplayorder() {
		return displayorder;
	}
	public void setdisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public Date getaddtime() {
		return addtime;
	}
	public void setaddtime(Date addtime) {
		this.addtime = addtime;
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
	public String getbody() {
		return body;
	}
	public void setbody(String body) {
		this.body = body;
	}
    
}
