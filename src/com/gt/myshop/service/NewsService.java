package com.gt.myshop.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.myshop.entities.mall.NewsInfo;
import com.gt.myshop.mapper.NewsInfoMapper;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午12:59:38
 * @description 新闻操作管理类
 *
 */

@Service
public class NewsService {

	@Autowired
	private NewsInfoMapper newsInfoMapper;
	
	public List<NewsInfo> getHomeNewsList(int newsTypeId,int count){
		return newsInfoMapper.getHomeNewsList(newsTypeId,count);
	}
	
	
}
