package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:54:41
 * @description 积分配置信息类
 *
 */
public class CreditConfigInfo {
	private String paycreditname;			//支付积分名称
    private int paycreditprice;				//支付积分价格(单位为100个)
    private int daymaxsendpaycredits;		//每天最大发放支付积分
    private int ordermaxusepaycredits;		//每笔订单最大使用支付积分
    private int registerpaycredits;			//注册支付积分
    private int loginpaycredits;			//每天登录支付积分
    private int verifyemailpaycredits;		//验证邮箱支付积分
    private int verifymobilepaycredits;		//验证手机支付积分
    private int completeuserinfopaycredits;	//完善用户信息支付积分
    private int receiveorderpaycredits;		//收货支付积分(以订单金额的百分比计算)
    private int reviewproductpaycredits;	//评价商品支付积分

    private String rankcreditname;			//等级积分名称
    private int daymaxsendrankcredits;		//每天最大发放等级积分
    private int registerrankcredits;		//注册等级积分
    private int loginrankcredits;			//每天登录等级积分
    private int verifyemailrankcredits;		//验证邮箱等级积分
    private int verifymobilerankcredits;	//验证手机等级积分
    private int completeuserinforankcredits;//完善用户信息等级积分
    private int receiveorderrankcredits;	//收货等级积分(以订单金额的百分比计算)
    private int reviewproductrankcredits;	//评价商品等级积分
    
    //以下为 getter setter 方法
	public String getPaycreditname() {
		return paycreditname;
	}
	public void setPaycreditname(String paycreditname) {
		this.paycreditname = paycreditname;
	}
	public int getPaycreditprice() {
		return paycreditprice;
	}
	public void setPaycreditprice(int paycreditprice) {
		this.paycreditprice = paycreditprice;
	}
	public int getDaymaxsendpaycredits() {
		return daymaxsendpaycredits;
	}
	public void setDaymaxsendpaycredits(int daymaxsendpaycredits) {
		this.daymaxsendpaycredits = daymaxsendpaycredits;
	}
	public int getOrdermaxusepaycredits() {
		return ordermaxusepaycredits;
	}
	public void setOrdermaxusepaycredits(int ordermaxusepaycredits) {
		this.ordermaxusepaycredits = ordermaxusepaycredits;
	}
	public int getRegisterpaycredits() {
		return registerpaycredits;
	}
	public void setRegisterpaycredits(int registerpaycredits) {
		this.registerpaycredits = registerpaycredits;
	}
	public int getLoginpaycredits() {
		return loginpaycredits;
	}
	public void setLoginpaycredits(int loginpaycredits) {
		this.loginpaycredits = loginpaycredits;
	}
	public int getVerifyemailpaycredits() {
		return verifyemailpaycredits;
	}
	public void setVerifyemailpaycredits(int verifyemailpaycredits) {
		this.verifyemailpaycredits = verifyemailpaycredits;
	}
	public int getVerifymobilepaycredits() {
		return verifymobilepaycredits;
	}
	public void setVerifymobilepaycredits(int verifymobilepaycredits) {
		this.verifymobilepaycredits = verifymobilepaycredits;
	}
	public int getCompleteuserinfopaycredits() {
		return completeuserinfopaycredits;
	}
	public void setCompleteuserinfopaycredits(int completeuserinfopaycredits) {
		this.completeuserinfopaycredits = completeuserinfopaycredits;
	}
	public int getReceiveorderpaycredits() {
		return receiveorderpaycredits;
	}
	public void setReceiveorderpaycredits(int receiveorderpaycredits) {
		this.receiveorderpaycredits = receiveorderpaycredits;
	}
	public int getReviewproductpaycredits() {
		return reviewproductpaycredits;
	}
	public void setReviewproductpaycredits(int reviewproductpaycredits) {
		this.reviewproductpaycredits = reviewproductpaycredits;
	}
	public String getRankcreditname() {
		return rankcreditname;
	}
	public void setRankcreditname(String rankcreditname) {
		this.rankcreditname = rankcreditname;
	}
	public int getDaymaxsendrankcredits() {
		return daymaxsendrankcredits;
	}
	public void setDaymaxsendrankcredits(int daymaxsendrankcredits) {
		this.daymaxsendrankcredits = daymaxsendrankcredits;
	}
	public int getRegisterrankcredits() {
		return registerrankcredits;
	}
	public void setRegisterrankcredits(int registerrankcredits) {
		this.registerrankcredits = registerrankcredits;
	}
	public int getLoginrankcredits() {
		return loginrankcredits;
	}
	public void setLoginrankcredits(int loginrankcredits) {
		this.loginrankcredits = loginrankcredits;
	}
	public int getVerifyemailrankcredits() {
		return verifyemailrankcredits;
	}
	public void setVerifyemailrankcredits(int verifyemailrankcredits) {
		this.verifyemailrankcredits = verifyemailrankcredits;
	}
	public int getVerifymobilerankcredits() {
		return verifymobilerankcredits;
	}
	public void setVerifymobilerankcredits(int verifymobilerankcredits) {
		this.verifymobilerankcredits = verifymobilerankcredits;
	}
	public int getCompleteuserinforankcredits() {
		return completeuserinforankcredits;
	}
	public void setCompleteuserinforankcredits(int completeuserinforankcredits) {
		this.completeuserinforankcredits = completeuserinforankcredits;
	}
	public int getReceiveorderrankcredits() {
		return receiveorderrankcredits;
	}
	public void setReceiveorderrankcredits(int receiveorderrankcredits) {
		this.receiveorderrankcredits = receiveorderrankcredits;
	}
	public int getReviewproductrankcredits() {
		return reviewproductrankcredits;
	}
	public void setReviewproductrankcredits(int reviewproductrankcredits) {
		this.reviewproductrankcredits = reviewproductrankcredits;
	}
    
}
