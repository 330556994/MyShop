package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * 积分动作枚举
 *
 */
public enum CreditAction {
	
	// 这里通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
	// 赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
	
    //管理员发放
    AdminSend(0),
    
    //注册
    Register(1),
    
    //登录
    Login(2),
    
    //验证邮箱
    VerifyEmail(3),
    
    //验证手机
    VerifyMobile(4),
    
    //完善用户资料
    CompleteUserInfo(5),
    
    //支付订单
    PayOrder(6),
    
    //完成订单
    CompleteOrder(7),
    
    //评价商品
    ReviewProduct(8),
    
    //单品促销活动
    SinglePromotion(9),
    
    //退回订单使用
    ReturnOrderUse(10),
    
    //退回订单发放
    ReturnOrderSend(11);
    
    private final int value;
    
    CreditAction(int value) {
    	this.value = value;
    }
    
    public int getValue() {
        return value;
    }
	
}
