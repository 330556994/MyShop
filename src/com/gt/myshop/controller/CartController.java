package com.gt.myshop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Gongtao
 * @date 2017-4-11 下午10:28:38
 * @description 购物车控制器类
 *
 */

@Controller
@RequestMapping(value="/cart")
public class CartController {
	
	//购物车
	@RequestMapping("")
	public String index(Map<String, Object> map){
		//当商城不允许游客使用购物车时
		return "cart/index";
	}
	
	//购物车快照
	public String snap(){
		return "cart/index";
	}
	
	//添加商品到购物车
	public String addProduct(){
		
	return null;}
	
	//购买商品
	public String buyProduct(){
		
	return null;}
	
	//修改购物车中商品数量
	public String changeProductCount(){
		
	return null;}
	
	//删除购物车中商品
	public String delProduct(){
		
	return null;}
	
	//添加套装到购物车
	public String addSuit(){
		
	return null;}
	
	//购买套装
	public String buySuit(){
		
	return null;}
	
	//修改购物车中套装数量
	public String changeSuitCount(){
		
	return null;}
	
	//删除购物车中套装
	public String delSuit(){
		
	return null;}
	
	//获得满赠赠品
	public String getFullSend(){
		
	return null;}
	
	//添加满赠到购物车
	public String addFullSend(){
		
	return null;}
	
	//删除购物车中满赠
	public String delFullSend(){
		
	return null;}
	
	//清空购物车
	public String clear(){
		
	return null;}
	
	//购物车添加成功提示
	public String addSuccess(){
		
	return null;}
	
	//取消或选中购物车项
	public String cancelOrSelectCartItem(){
		
	return null;}
	
	//选中全部购物车项
	public String selectAllCartItem(){
	 	
	return null;}
	
	//满赠主商品列表
	public String fullSendMainProductList(){
		
	return null;}
	
	//满减商品列表
	public String fullCutProductList(){
		
	return null;}
}
