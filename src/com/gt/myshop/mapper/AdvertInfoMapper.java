package com.gt.myshop.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.AdvertInfo;

/**
 * ��ù���б�
 * @author Gongtao
 * @date 2017-4-2 ����8:56:10
 * @description ������ݷ�����
 */
public interface AdvertInfoMapper {

	/**
	 * ��ù���б�
	 * @param ���λ��id
	 * @param ��ǰʱ��
	 * @return ����б�
	 */
	List<AdvertInfo> getAdvertList(@Param("adPosId")int adPosId, @Param("nowTime")Date nowTime);
	
}