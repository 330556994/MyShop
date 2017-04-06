package com.gt.myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.product.CategoryInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午3:33:09
 * @description 分类信息数据访问类
 *
 */
public interface CategoryInfoMapper {

	/**
	 * 获得分类列表
	 * @return 商品分类信息集合
	 */
	List<CategoryInfo> getCategoryList(@Param("CategoryFields")String categoryFields);
	
}
