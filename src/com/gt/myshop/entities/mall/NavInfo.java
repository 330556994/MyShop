package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao	
 * ��������Ϣ��
 *
 */
public class NavInfo {
	
	private int id;				//���
    private int pid;			//�����
    private int layer;			//����
    private String name;		//����
    private String title;		//����
    private String url;			//��ַ
    private int target;			//��Ŀ��
    private int displayorder;	//����
    
    //������ getter setter ����
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
