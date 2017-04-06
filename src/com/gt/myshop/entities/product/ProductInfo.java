package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午1:56:23
 * @description 商品信息类
 *
 */
public class ProductInfo extends PartProductInfo {
	private String description = "";	//商品描述
	
	//以下是 getter setter 方法
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
