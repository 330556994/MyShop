package com.gt.myshop.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.myshop.entities.mall.AdvertInfo;
import com.gt.myshop.mapper.AdvertInfoMapper;

/**
 * 
 * @author Gongtao
 * @date 2017-4-2 ����8:43:34
 * @description ������������
 *
 */

@Service
public class AdvertInfoService {
	
	@Autowired
	private AdvertInfoMapper advertInfoMapper;
	
	/**
	 * ��ù���б�
	 * @param ���λ��id
	 * @return ����б�
	 */
	public List<AdvertInfo> getAdvertList(int adPosId){
//		List<AdvertInfo> advertList = new ArrayList<AdvertInfo>();
//		if(advertList==null){
		List<AdvertInfo> advertList = advertInfoMapper.getAdvertList(adPosId,new Date());
//		}
		return advertList;
		
	}
	
	
}
