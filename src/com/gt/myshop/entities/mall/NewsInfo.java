package com.gt.myshop.entities.mall;

import java.util.Date;

/**
 * 
 * @author GongTao
 * ������Ϣ��
 *
 */
public class NewsInfo {
	
	private int newsid;				//����id
    private int newstypeid = 0;		//��������id
    private int isshow = 0;			//�Ƿ���ʾ
    private int istop = 0;			//�Ƿ��ö�
    private int ishome = 0;			//�Ƿ�����
    private int displayorder = 0;	//����
    private Date addtime;			//���ʱ��
    private String title = "";		//����
    private String url = "";		//��ַ
    private String body = "";		//����
    
    //������ getter setter ����
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
