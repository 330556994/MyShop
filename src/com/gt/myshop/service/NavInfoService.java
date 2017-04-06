package com.gt.myshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.myshop.entities.mall.NavInfo;
import com.gt.myshop.mapper.NavInfoMapper;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午6:28:09
 * @description 导航栏操作管理类
 *
 */

@Service
public class NavInfoService {
	
	@Autowired
	private NavInfoMapper navInfoMapper;

	/**
	 * 获得导航栏列表
	 * @return 导航栏集合
	 */
	public List<NavInfo> getNavList(String navFields){
		return navInfoMapper.getNavList(navFields);
	}
}
