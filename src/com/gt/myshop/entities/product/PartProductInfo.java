package com.gt.myshop.entities.product;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:47:32
 * @description ��Ʒ������Ϣ��
 *
 */
public class PartProductInfo {
	private int pid;							//��Ʒid
    private String psn = "";					//��Ʒ����
    private int cateid = 0;						//��Ʒ����id
    private int brandid = 0;					//��ƷƷ��id
    private int storeid = 0;					//����id
    private int storecid = 0;					//���̷���id
    private int storestid = 0;					//��������ģ��id
    private int skugid = 0;						//��Ʒsku��id
    private String name = "";					//��Ʒ����
    private double shopprice = 0;				//��Ʒ�̳Ǽ�
    private double marketprice = 0;				//��Ʒ�г���
    private double costprice = 0;				//��Ʒ�ɱ���
    private int state = 0;						//0�����ϼܣ�1�����¼ܣ�2�������վ
    private int isbest = 0;						//��Ʒ�Ƿ�Ʒ
    private int ishot = 0;						//��Ʒ�Ƿ�����
    private int isnew = 0;						//��Ʒ�Ƿ���Ʒ
    private int displayorder = 0;				//��Ʒ����
    private int weight = 0;						//��Ʒ����
    private String showimg = "";				//��ƷչʾͼƬ
    private int salecount = 0;					//������
    private int visitcount = 0;					//������
    private int reviewcount = 0;				//������
    private int star1 = 0;						//��������1
    private int star2 = 0;						//��������2
    private int star3 = 0;						//��������3
    private int star4 = 0;						//��������4
    private int star5 = 0;						//��������5
    private Date addtime = new Date();			//��Ʒ���ʱ��
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPsn() {
		return psn;
	}
	public void setPsn(String psn) {
		this.psn = psn.trim();
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public int getStorecid() {
		return storecid;
	}
	public void setStorecid(int storecid) {
		this.storecid = storecid;
	}
	public int getStorestid() {
		return storestid;
	}
	public void setStorestid(int storestid) {
		this.storestid = storestid;
	}
	public int getSkugid() {
		return skugid;
	}
	public void setSkugid(int skugid) {
		this.skugid = skugid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getShopprice() {
		return shopprice;
	}
	public void setShopprice(double shopprice) {
		this.shopprice = shopprice;
	}
	public double getMarketprice() {
		return marketprice;
	}
	public void setMarketprice(double marketprice) {
		this.marketprice = marketprice;
	}
	public double getCostprice() {
		return costprice;
	}
	public void setCostprice(double costprice) {
		this.costprice = costprice;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getIsbest() {
		return isbest;
	}
	public void setIsbest(int isbest) {
		this.isbest = isbest;
	}
	public int getIshot() {
		return ishot;
	}
	public void setIshot(int ishot) {
		this.ishot = ishot;
	}
	public int getIsnew() {
		return isnew;
	}
	public void setIsnew(int isnew) {
		this.isnew = isnew;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getShowimg() {
		return showimg;
	}
	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}
	public int getSalecount() {
		return salecount;
	}
	public void setSalecount(int salecount) {
		this.salecount = salecount;
	}
	public int getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(int visitcount) {
		this.visitcount = visitcount;
	}
	public int getReviewcount() {
		return reviewcount;
	}
	public void setReviewcount(int reviewcount) {
		this.reviewcount = reviewcount;
	}
	public int getStar1() {
		return star1;
	}
	public void setStar1(int star1) {
		this.star1 = star1;
	}
	public int getStar2() {
		return star2;
	}
	public void setStar2(int star2) {
		this.star2 = star2;
	}
	public int getStar3() {
		return star3;
	}
	public void setStar3(int star3) {
		this.star3 = star3;
	}
	public int getStar4() {
		return star4;
	}
	public void setStar4(int star4) {
		this.star4 = star4;
	}
	public int getStar5() {
		return star5;
	}
	public void setStar5(int star5) {
		this.star5 = star5;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
	public int getStarLevel(){
		int goodStars = star1 + star2 + star3;
		int allStarts = goodStars + star4 + star5; 
		if(allStarts == 0 ){
			return 100;
		}
		return goodStars * 100 / allStarts;
	}
    
}
