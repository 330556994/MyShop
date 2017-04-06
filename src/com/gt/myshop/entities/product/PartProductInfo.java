package com.gt.myshop.entities.product;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:47:32
 * @description 商品部分信息类
 *
 */
public class PartProductInfo {
	private int pid;							//商品id
    private String psn = "";					//商品货号
    private int cateid = 0;						//商品分类id
    private int brandid = 0;					//商品品牌id
    private int storeid = 0;					//店铺id
    private int storecid = 0;					//店铺分类id
    private int storestid = 0;					//店铺配送模板id
    private int skugid = 0;						//商品sku组id
    private String name = "";					//商品名称
    private double shopprice = 0;				//商品商城价
    private double marketprice = 0;				//商品市场价
    private double costprice = 0;				//商品成本价
    private int state = 0;						//0代表上架，1代表下架，2代表回收站
    private int isbest = 0;						//商品是否精品
    private int ishot = 0;						//商品是否热销
    private int isnew = 0;						//商品是否新品
    private int displayorder = 0;				//商品排序
    private int weight = 0;						//商品重量
    private String showimg = "";				//商品展示图片
    private int salecount = 0;					//销售数
    private int visitcount = 0;					//访问数
    private int reviewcount = 0;				//评价数
    private int star1 = 0;						//评价星星1
    private int star2 = 0;						//评价星星2
    private int star3 = 0;						//评价星星3
    private int star4 = 0;						//评价星星4
    private int star5 = 0;						//评价星星5
    private Date addtime = new Date();			//商品添加时间
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
