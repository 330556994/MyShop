package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:45:55
 * @description ��ƷͼƬ��Ϣ��
 *
 */
public class ProductImageInfo {
	
	private int pimgid;			//��ƷͼƬid
    private int pid;			//��Ʒid
    private String showimg;		//��ƷͼƬ
    private int ismain;			//�Ƿ�Ϊ��ͼ
    private int displayorder;	//��ƷͼƬ����
    private int storeid = 0;	//����id
    
    //������ getter setter ����
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
