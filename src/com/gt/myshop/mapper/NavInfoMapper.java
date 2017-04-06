package com.gt.myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gt.myshop.entities.mall.NavInfo;
import com.gt.myshop.sqlserver.TableFields;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����6:25:48
 * @description ���������ݷ�����
 *
 */
public interface NavInfoMapper {
	/**
	 * ��õ������б�
	 * @return ����������
	 */
	List<NavInfo> getNavList(@Param("NavFields")String navFields);
}
