package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����11:54:41
 * @description ����������Ϣ��
 *
 */
public class CreditConfigInfo {
	private String paycreditname;			//֧����������
    private int paycreditprice;				//֧�����ּ۸�(��λΪ100��)
    private int daymaxsendpaycredits;		//ÿ����󷢷�֧������
    private int ordermaxusepaycredits;		//ÿ�ʶ������ʹ��֧������
    private int registerpaycredits;			//ע��֧������
    private int loginpaycredits;			//ÿ���¼֧������
    private int verifyemailpaycredits;		//��֤����֧������
    private int verifymobilepaycredits;		//��֤�ֻ�֧������
    private int completeuserinfopaycredits;	//�����û���Ϣ֧������
    private int receiveorderpaycredits;		//�ջ�֧������(�Զ������İٷֱȼ���)
    private int reviewproductpaycredits;	//������Ʒ֧������

    private String rankcreditname;			//�ȼ���������
    private int daymaxsendrankcredits;		//ÿ����󷢷ŵȼ�����
    private int registerrankcredits;		//ע��ȼ�����
    private int loginrankcredits;			//ÿ���¼�ȼ�����
    private int verifyemailrankcredits;		//��֤����ȼ�����
    private int verifymobilerankcredits;	//��֤�ֻ��ȼ�����
    private int completeuserinforankcredits;//�����û���Ϣ�ȼ�����
    private int receiveorderrankcredits;	//�ջ��ȼ�����(�Զ������İٷֱȼ���)
    private int reviewproductrankcredits;	//������Ʒ�ȼ�����
    
    //����Ϊ getter setter ����
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
