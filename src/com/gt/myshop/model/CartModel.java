package com.gt.myshop.model;

import java.util.List;

public class CartModel {
	
    
    public int totalCount;						//商品总数量
    public double productAmount;				//商品合计
    public int fullCut;							//满减
    public double orderAmount;					//订单合计
    public List<StoreCartInfo> StoreCartList;	//店铺购物车列表
    
    
	
}


