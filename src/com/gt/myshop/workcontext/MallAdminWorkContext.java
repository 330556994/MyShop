package com.gt.myshop.workcontext;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gt.myshop.config.info.BMAConfig;
import com.gt.myshop.config.info.MallConfigInfo;
import com.gt.myshop.entities.mall.RegionInfo;
import com.gt.myshop.entities.user.MallAdminGroupInfo;
import com.gt.myshop.entities.user.PartUserInfo;
import com.gt.myshop.entities.user.UserRankInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:31:43
 * @description PC商城后台工作上下文类
 *
 */

@Component
public class MallAdminWorkContext {
	@Autowired  
	private  HttpServletRequest request;  
	
	private MallConfigInfo mallConfig = BMAConfig.mallConfig();//商城配置信息

    private Boolean isHttpAjax;//当前请求是否为ajax请求

    private String IP;//用户ip

    private RegionInfo regionInfo;//区域信息

    private int regionId;//区域id

    private String url;//当前url

    private String urlReferrer;//上一次访问的url

    private String sid;//用户sid

    private int uid = -1;//用户id

    private String userName;//用户名

    private String userEmail;//用户邮箱

    private String userMobile;//用户手机号

    private String nickName;//用户昵称

    private String avatar;//用户头像

    private String password;//用户密码

    private String encryptPwd;//加密密码

    private PartUserInfo partUserInfo;//用户信息

    private int userRid = -1;//用户等级id

    private UserRankInfo userRankInfo;//用户等级信息

    private String userRTitle;//用户等级标题

    private int mallAGid = -1;//用户商城管理员组id

    private MallAdminGroupInfo mallAdminGroupInfo;//用户商城管理员组信息

    private String mallAGTitle;//商城管理员组标题

    private String controller;//控制器

    private String action;//动作方法

    private String pageKey;//页面标示符

    private String imageCDN;//图片cdn

    private String CSSCDN;//csscdn

    private String scriptCDN;//脚本cdn

    //以下是 getter setter 方法
	public MallConfigInfo getMallConfig() {
		return mallConfig;
	}

	public void setMallConfig(MallConfigInfo mallConfig) {
		this.mallConfig = mallConfig;
	}

	public Boolean getIsHttpAjax() {
		return request.getHeader("X-Requested-With").equals("XMLHttpRequest");
	}

	public void setIsHttpAjax(Boolean isHttpAjax) {
		this.isHttpAjax = isHttpAjax;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public RegionInfo getRegionInfo() {
		return regionInfo;
	}

	public void setRegionInfo(RegionInfo regionInfo) {
		this.regionInfo = regionInfo;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrlReferrer() {
		return urlReferrer;
	}

	public void setUrlReferrer(String urlReferrer) {
		this.urlReferrer = urlReferrer;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEncryptPwd() {
		return encryptPwd;
	}

	public void setEncryptPwd(String encryptPwd) {
		this.encryptPwd = encryptPwd;
	}

	public PartUserInfo getPartUserInfo() {
		return partUserInfo;
	}

	public void setPartUserInfo(PartUserInfo partUserInfo) {
		this.partUserInfo = partUserInfo;
	}

	public int getUserRid() {
		return userRid;
	}

	public void setUserRid(int userRid) {
		this.userRid = userRid;
	}

	public UserRankInfo getUserRankInfo() {
		return userRankInfo;
	}

	public void setUserRankInfo(UserRankInfo userRankInfo) {
		this.userRankInfo = userRankInfo;
	}

	public String getUserRTitle() {
		return userRTitle;
	}

	public void setUserRTitle(String userRTitle) {
		this.userRTitle = userRTitle;
	}

	public int getMallAGid() {
		return mallAGid;
	}

	public void setMallAGid(int mallAGid) {
		this.mallAGid = mallAGid;
	}

	public MallAdminGroupInfo getMallAdminGroupInfo() {
		return mallAdminGroupInfo;
	}

	public void setMallAdminGroupInfo(MallAdminGroupInfo mallAdminGroupInfo) {
		this.mallAdminGroupInfo = mallAdminGroupInfo;
	}

	public String getMallAGTitle() {
		return mallAGTitle;
	}

	public void setMallAGTitle(String mallAGTitle) {
		this.mallAGTitle = mallAGTitle;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPageKey() {
		return pageKey;
	}

	public void setPageKey(String pageKey) {
		this.pageKey = pageKey;
	}

	public String getImageCDN() {
		return imageCDN;
	}

	public void setImageCDN(String imageCDN) {
		this.imageCDN = imageCDN;
	}

	public String getCSSCDN() {
		return CSSCDN;
	}

	public void setCSSCDN(String cSSCDN) {
		CSSCDN = cSSCDN;
	}

	public String getScriptCDN() {
		return scriptCDN;
	}

	public void setScriptCDN(String scriptCDN) {
		this.scriptCDN = scriptCDN;
	}
    
    
}
