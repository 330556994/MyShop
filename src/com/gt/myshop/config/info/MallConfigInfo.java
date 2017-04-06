package com.gt.myshop.config.info;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:07:26
 * @description 商城配置信息类
 *
 */

@Component
public class MallConfigInfo {
	private String mallname = "brnmall网上商城";			//商城名称
    private String siteurl = "http://www.ddd.com";		//网站网址
    private String sitetitle = "brnmall网上商城";			//网站标题
    private String seokeyword = "";						//seo关键字
    private String seodescription = "";					//seo描述
    private String icp = "冀ICP22222";					//备案编号
    private String script = "";							//脚本
    private int islicensed = 1;							//是否显示版权(0代表不显示，1代表显示)
    
    //下面是 getter setter 方法
	public String getMallname() {
		return mallname;
	}
	public void setMallname(String mallname) {
		this.mallname = mallname;
	}
	public String getSiteurl() {
		return siteurl;
	}
	public void setSiteurl(String siteurl) {
		this.siteurl = siteurl;
	}
	public String getSitetitle() {
		return sitetitle;
	}
	public void setSitetitle(String sitetitle) {
		this.sitetitle = sitetitle;
	}
	public String getSeokeyword() {
		return seokeyword;
	}
	public void setSeokeyword(String seokeyword) {
		this.seokeyword = seokeyword;
	}
	public String getSeodescription() {
		return seodescription;
	}
	public void setSeodescription(String seodescription) {
		this.seodescription = seodescription;
	}
	public String getIcp() {
		return icp;
	}
	public void setIcp(String icp) {
		this.icp = icp;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public int getIslicensed() {
		return islicensed;
	}
	public void setIslicensed(int islicensed) {
		this.islicensed = islicensed;
	}
}
