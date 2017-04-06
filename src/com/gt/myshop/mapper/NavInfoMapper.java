package com.gt.myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.NavInfo;
import com.gt.myshop.sqlserver.TableFields;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午6:25:48
 * @description 导航栏数据访问类
 *
 */
public interface NavInfoMapper {
	/**
	 * 获得导航栏列表
	 * @return 导航栏集合
	 */
	List<NavInfo> getNavList(@Param("NavFields")String navFields);
}
