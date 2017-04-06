package com.gt.myshop.config.info;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.gt.myshop.entities.mall.FriendLinkInfo;
import com.gt.myshop.entities.mall.HelpInfo;
import com.gt.myshop.entities.mall.NavInfo;
import com.gt.myshop.entities.mall.RegionInfo;
import com.gt.myshop.entities.store.StoreInfo;
import com.gt.myshop.entities.user.MallAdminGroupInfo;
import com.gt.myshop.entities.user.PartUserInfo;
import com.gt.myshop.entities.user.UserRankInfo;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午8:07:46
 * @description PC前台工作上下文类
 *
 */

public class WebWorkContext {
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
    private String payCreditName;//支付积分名称
    private int payCreditCount = 0;//支付积分数量
    private String rankCreditName;//等级积分名称
    private int rankCreditCount = 0;//等级积分数量
    private PartUserInfo partUserInfo;//用户信息
    private int userRid = -1;//用户等级id
    private UserRankInfo userRankInfo;//用户等级信息
    private String userRTitle;//用户等级标题
    private int mallAGid = -1;//用户商城管理员组id
    private MallAdminGroupInfo mallAdminGroupInfo;//用户商城管理员组信息
    private String mallAGTitle;//商城管理员组标题
    private int storeId = 0;//店铺id
    private StoreInfo storeInfo = null;//店铺信息
    private String controller;//控制器
    private String action;//动作方法
    private String pageKey;//页面标示符
    private String imageCDN;//图片cdn
    private String csscdn;//csscdn
    private String scriptCDN;//脚本cdn
    private int onlineUserCount = 0;//在线总人数
    private int onlineMemberCount = 0;//在线会员数
    private int onlineGuestCount = 0;//在线游客数
    private String searchWord;//搜索词
    private int cartProductCount = 0;//购物车中商品数量
    private List<NavInfo> navList;//导航列表
    private FriendLinkInfo[] friendLinkList;//友情链接列表
    private List<HelpInfo> helpList;//帮助列表
    private Date startExecuteTime;//页面开始执行时间
    private double mxecuteTime;//页面执行时间
    private int mxecuteCount = 0;//执行的sql语句数目
    private String mxecuteDetail;//执行的sql语句细节
    private String mallVersion = BMAVersion.MALL_VERSION;//商城版本
    private String mallCopyright = BMAVersion.MALL_COPYRIGHT;//商城版权
    
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
	public void setIP(String IP) {
		this.IP = IP;
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
	public String getPayCreditName() {
		return payCreditName;
	}
	public void setPayCreditName(String payCreditName) {
		this.payCreditName = payCreditName;
	}
	public int getPayCreditCount() {
		return payCreditCount;
	}
	public void setPayCreditCount(int payCreditCount) {
		this.payCreditCount = payCreditCount;
	}
	public String getRankCreditName() {
		return rankCreditName;
	}
	public void setRankCreditName(String rankCreditName) {
		this.rankCreditName = rankCreditName;
	}
	public int getRankCreditCount() {
		return rankCreditCount;
	}
	public void setRankCreditCount(int rankCreditCount) {
		this.rankCreditCount = rankCreditCount;
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
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public StoreInfo getStoreInfo() {
		return storeInfo;
	}
	public void setStoreInfo(StoreInfo storeInfo) {
		this.storeInfo = storeInfo;
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
	public String getCsscdn() {
		return csscdn;
	}
	public void setCsscdn(String csscdn) {
		this.csscdn = csscdn;
	}
	public String getScriptCDN() {
		return scriptCDN;
	}
	public void setScriptCDN(String scriptCDN) {
		this.scriptCDN = scriptCDN;
	}
	public int getOnlineUserCount() {
		return onlineUserCount;
	}
	public void setOnlineUserCount(int onlineUserCount) {
		this.onlineUserCount = onlineUserCount;
	}
	public int getOnlineMemberCount() {
		return onlineMemberCount;
	}
	public void setOnlineMemberCount(int onlineMemberCount) {
		this.onlineMemberCount = onlineMemberCount;
	}
	public int getOnlineGuestCount() {
		return onlineGuestCount;
	}
	public void setOnlineGuestCount(int onlineGuestCount) {
		this.onlineGuestCount = onlineGuestCount;
	}
	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	public int getCartProductCount() {
		return cartProductCount;
	}
	public void setCartProductCount(int cartProductCount) {
		this.cartProductCount = cartProductCount;
	}
	public List<NavInfo> getNavList() {
		return navList;
	}
	public void setNavList(List<NavInfo> navList) {
		this.navList = navList;
	}
	public FriendLinkInfo[] getFriendLinkList() {
		return friendLinkList;
	}
	public void setFriendLinkList(FriendLinkInfo[] friendLinkList) {
		this.friendLinkList = friendLinkList;
	}
	public List<HelpInfo> getHelpList() {
		return helpList;
	}
	public void setHelpList(List<HelpInfo> helpList) {
		this.helpList = helpList;
	}
	public Date getStartExecuteTime() {
		return startExecuteTime;
	}
	public void setStartExecuteTime(Date startExecuteTime) {
		this.startExecuteTime = startExecuteTime;
	}
	public double getMxecuteTime() {
		return mxecuteTime;
	}
	public void setMxecuteTime(double mxecuteTime) {
		this.mxecuteTime = mxecuteTime;
	}
	public int getMxecuteCount() {
		return mxecuteCount;
	}
	public void setMxecuteCount(int mxecuteCount) {
		this.mxecuteCount = mxecuteCount;
	}
	public String getMxecuteDetail() {
		return mxecuteDetail;
	}
	public void setMxecuteDetail(String mxecuteDetail) {
		this.mxecuteDetail = mxecuteDetail;
	}
	public String getMallVersion() {
		return mallVersion;
	}
	public void setMallVersion(String mallVersion) {
		this.mallVersion = mallVersion;
	}
	public String getMallCopyright() {
		return mallCopyright;
	}
	public void setMallCopyright(String mallCopyright) {
		this.mallCopyright = mallCopyright;
	}
    
}
