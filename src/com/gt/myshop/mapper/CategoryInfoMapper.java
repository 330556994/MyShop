package com.gt.myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.product.CategoryInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����3:33:09
 * @description ������Ϣ���ݷ�����
 *
 */
public interface CategoryInfoMapper {

	/**
	 * ��÷����б�
	 * @return ��Ʒ������Ϣ����
	 */
	List<CategoryInfo> getCategoryList(@Param("CategoryFields")String categoryFields);
	
}
