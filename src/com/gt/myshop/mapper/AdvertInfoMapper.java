package com.gt.myshop.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.AdvertInfo;

/**
 * 获得广告列表
 * @author Gongtao
 * @date 2017-4-2 下午8:56:10
 * @description 广告数据访问类
 */
public interface AdvertInfoMapper {

	/**
	 * 获得广告列表
	 * @param 广告位置id
	 * @param 当前时间
	 * @return 广告列表
	 */
	List<AdvertInfo> getAdvertList(@Param("adPosId")int adPosId, @Param("nowTime")Date nowTime);
	
}