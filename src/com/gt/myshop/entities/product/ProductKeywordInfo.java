package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午2:00:42
 * @description 商品关键词信息类
 *
 */
public class ProductKeywordInfo {
	private String keyword;			//关键词
    private int pid;				//商品id
    private int relevancy;			//相关性
    
    //以下是 getter setter 方法
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
