package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����1:44:53
 * @description ��Ʒ��ѯ������Ϣ��
 *
 */
public class ProductConsultTypeInfo {
	private int consulttypeid;	//��ѯ����id
    private String title;		//��ѯ���ͱ���
    private int displayorder;	//����
    
    //������ getter setter ����
	public int getConsulttypeid() {
		return consulttypeid;
	}
	public void setConsulttypeid(int consulttypeid) {
		this.consulttypeid = consulttypeid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(int displayorder) {
		this.displayorder = displayorder;
	}
    
}
