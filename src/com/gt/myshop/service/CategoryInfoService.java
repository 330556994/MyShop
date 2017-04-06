package com.gt.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.myshop.entities.product.CategoryInfo;
import com.gt.myshop.mapper.CategoryInfoMapper;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����3:56:30
 * @description ��Ʒ�������������
 *
 */

@Service
public class CategoryInfoService {

	@Autowired
	private CategoryInfoMapper categoryInfoMapper;
	
	public List<CategoryInfo> getCategoryList(String categoryFields){
		return categoryInfoMapper.getCategoryList(categoryFields);
	}
}
