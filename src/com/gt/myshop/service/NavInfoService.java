package com.gt.myshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.myshop.entities.mall.NavInfo;
import com.gt.myshop.mapper.NavInfoMapper;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����6:28:09
 * @description ����������������
 *
 */

@Service
public class NavInfoService {
	
	@Autowired
	private NavInfoMapper navInfoMapper;

	/**
	 * ��õ������б�
	 * @return ����������
	 */
	public List<NavInfo> getNavList(String navFields){
		return navInfoMapper.getNavList(navFields);
	}
}
