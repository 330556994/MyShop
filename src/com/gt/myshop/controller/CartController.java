package com.gt.myshop.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Gongtao
 * @date 2017-4-11 ����10:28:38
 * @description ���ﳵ��������
 *
 */

@Controller
@RequestMapping(value="/cart")
public class CartController {
	
	//���ﳵ
	@RequestMapping("")
	public String index(Map<String, Object> map){
		//���̳ǲ������ο�ʹ�ù��ﳵʱ
		return "cart/index";
	}
	
	//���ﳵ����
	public String snap(){
		return "cart/index";
	}
	
	//�����Ʒ�����ﳵ
	public String addProduct(){
		
	return null;}
	
	//������Ʒ
	public String buyProduct(){
		
	return null;}
	
	//�޸Ĺ��ﳵ����Ʒ����
	public String changeProductCount(){
		
	return null;}
	
	//ɾ�����ﳵ����Ʒ
	public String delProduct(){
		
	return null;}
	
	//�����װ�����ﳵ
	public String addSuit(){
		
	return null;}
	
	//������װ
	public String buySuit(){
		
	return null;}
	
	//�޸Ĺ��ﳵ����װ����
	public String changeSuitCount(){
		
	return null;}
	
	//ɾ�����ﳵ����װ
	public String delSuit(){
		
	return null;}
	
	//���������Ʒ
	public String getFullSend(){
		
	return null;}
	
	//������������ﳵ
	public String addFullSend(){
		
	return null;}
	
	//ɾ�����ﳵ������
	public String delFullSend(){
		
	return null;}
	
	//��չ��ﳵ
	public String clear(){
		
	return null;}
	
	//���ﳵ��ӳɹ���ʾ
	public String addSuccess(){
		
	return null;}
	
	//ȡ����ѡ�й��ﳵ��
	public String cancelOrSelectCartItem(){
		
	return null;}
	
	//ѡ��ȫ�����ﳵ��
	public String selectAllCartItem(){
	 	
	return null;}
	
	//��������Ʒ�б�
	public String fullSendMainProductList(){
		
	return null;}
	
	//������Ʒ�б�
	public String fullCutProductList(){
		
	return null;}
}
