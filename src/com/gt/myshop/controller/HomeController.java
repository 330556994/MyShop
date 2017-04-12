package com.gt.myshop.controller;

import java.util.Map;

import oracle.net.resolver.NavServiceAlias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gt.myshop.config.info.MallConfigInfo;
import com.gt.myshop.service.AdvertInfoService;
import com.gt.myshop.service.CategoryInfoService;
import com.gt.myshop.service.NavInfoService;
import com.gt.myshop.service.NewsService;
import com.gt.myshop.sqlserver.TableFields;
import com.gt.myshop.workcontext.MallAdminWorkContext;

@Controller
public class HomeController {
	
	@Autowired
	private AdvertInfoService advertInfoService;
	
	@Autowired
	private NewsService newsService;
	
	@Autowired
	private CategoryInfoService categoryInfoService;
	
	@Autowired
	private NavInfoService navInfoService;
	
	@Autowired 
	private MallConfigInfo mallConfigInfo;
	
	@Autowired
	private MallAdminWorkContext mallAdminWorkContext;
	
//	@ResponseBody
	@RequestMapping("/")
	public String index(Map<String, Object> map){
		map.put("homeTopAdvertList", advertInfoService.getAdvertList(6));
		map.put("searchWordAdvertList", advertInfoService.getAdvertList(5));
		map.put("bannerList", advertInfoService.getAdvertList(43));
		map.put("floor1AdvertList1", advertInfoService.getAdvertList(10));
		map.put("floor1AdvertList2", advertInfoService.getAdvertList(11));
		map.put("floor1AdvertList3", advertInfoService.getAdvertList(12));
		map.put("floor1AdvertList4", advertInfoService.getAdvertList(13));
		map.put("floor1AdvertList5", advertInfoService.getAdvertList(14));
		map.put("floor1AdvertList6", advertInfoService.getAdvertList(15));
		map.put("floor2AdvertList1", advertInfoService.getAdvertList(16));
		map.put("floor2AdvertList2", advertInfoService.getAdvertList(17));
		map.put("floor2AdvertList3", advertInfoService.getAdvertList(18));
		map.put("floor2AdvertList4", advertInfoService.getAdvertList(19));
		map.put("floor2AdvertList5", advertInfoService.getAdvertList(20));
		map.put("floor2AdvertList5", advertInfoService.getAdvertList(21));
		map.put("categoryList", categoryInfoService.getCategoryList(TableFields.CATEGORIES));
		map.put("navList", navInfoService.getNavList(TableFields.NAVS));
		map.put("news", newsService.getHomeNewsList(0,7));
		map.put("mallConfig", mallConfigInfo);
		map.put("workContext",mallAdminWorkContext);
		return "home/index";
	}
	
}
