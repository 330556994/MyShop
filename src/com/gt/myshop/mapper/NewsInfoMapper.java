package com.gt.myshop.mapper;

import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.NewsInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午6:34:07
 * @description 新闻数据访问类
 *
 */
public interface NewsInfoMapper {
	
	/**
	 * 获得置首的新闻列表
	 * @param newsTypeId 新闻类型id(0代表全部类型)
	 * @param count 数量
	 */
	List<NewsInfo> getHomeNewsList(@Param("newsTypeId") int newsTypeId , @Param("count")int count);
}
