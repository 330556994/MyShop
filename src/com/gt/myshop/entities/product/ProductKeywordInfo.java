package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����2:00:42
 * @description ��Ʒ�ؼ�����Ϣ��
 *
 */
public class ProductKeywordInfo {
	private String keyword;			//�ؼ���
    private int pid;				//��Ʒid
    private int relevancy;			//�����
    
    //������ getter setter ����
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword.trim();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getRelevancy() {
		return relevancy;
	}
	public void setRelevancy(int relevancy) {
		this.relevancy = relevancy;
	}
    
    
}
