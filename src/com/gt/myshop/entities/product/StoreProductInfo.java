package com.gt.myshop.entities.product;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午2:00:08
 * @description 店铺商品信息类
 *
 */
public class StoreProductInfo extends PartProductInfo {
	
	private String _storename = "";		//店铺名称

	//以下是 getter setter 方法
	public String get_storename() {
		return _storename;
	}
	public void set_storename(String _storename) {
		this._storename = _storename;
	}
	
	
}
