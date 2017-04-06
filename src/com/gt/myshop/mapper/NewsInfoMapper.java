package com.gt.myshop.mapper;

import java.sql.ResultSet;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.NewsInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����6:34:07
 * @description �������ݷ�����
 *
 */
public interface NewsInfoMapper {
	
	/**
	 * ������׵������б�
	 * @param newsTypeId ��������id(0����ȫ������)
	 * @param count ����
	 */
	List<NewsInfo> getHomeNewsList(@Param("newsTypeId") int newsTypeId , @Param("count")int count);
}
