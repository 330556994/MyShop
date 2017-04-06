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
 * @date 2017-4-4 ����8:07:46
 * @description PCǰ̨������������
 *
 */

public class WebWorkContext {
	@Autowired  
	private  HttpServletRequest request;  
	
	
	private MallConfigInfo mallConfig = BMAConfig.mallConfig();//�̳�������Ϣ
    private Boolean isHttpAjax;//��ǰ�����Ƿ�Ϊajax����
    private String IP;//�û�ip
    private RegionInfo regionInfo;//������Ϣ
    private int regionId;//����id
    private String url;//��ǰurl
    private String urlReferrer;//��һ�η��ʵ�url
    private String sid;//�û�sid
    private int uid = -1;//�û�id
    private String userName;//�û���
    private String userEmail;//�û�����
    private String userMobile;//�û��ֻ���
    private String nickName;//�û��ǳ�
    private String avatar;//�û�ͷ��
    private String password;//�û�����
    private String encryptPwd;//��������
    private String payCreditName;//֧����������
    private int payCreditCount = 0;//֧����������
    private String rankCreditName;//�ȼ���������
    private int rankCreditCount = 0;//�ȼ���������
    private PartUserInfo partUserInfo;//�û���Ϣ
    private int userRid = -1;//�û��ȼ�id
    private UserRankInfo userRankInfo;//�û��ȼ���Ϣ
    private String userRTitle;//�û��ȼ�����
    private int mallAGid = -1;//�û��̳ǹ���Ա��id
    private MallAdminGroupInfo mallAdminGroupInfo;//�û��̳ǹ���Ա����Ϣ
    private String mallAGTitle;//�̳ǹ���Ա�����
    private int storeId = 0;//����id
    private StoreInfo storeInfo = null;//������Ϣ
    private String controller;//������
    private String action;//��������
    private String pageKey;//ҳ���ʾ��
    private String imageCDN;//ͼƬcdn
    private String csscdn;//csscdn
    private String scriptCDN;//�ű�cdn
    private int onlineUserCount = 0;//����������
    private int onlineMemberCount = 0;//���߻�Ա��
    private int onlineGuestCount = 0;//�����ο���
    private String searchWord;//������
    private int cartProductCount = 0;//���ﳵ����Ʒ����
    private List<NavInfo> navList;//�����б�
    private FriendLinkInfo[] friendLinkList;//���������б�
    private List<HelpInfo> helpList;//�����б�
    private Date startExecuteTime;//ҳ�濪ʼִ��ʱ��
    private double mxecuteTime;//ҳ��ִ��ʱ��
    private int mxecuteCount = 0;//ִ�е�sql�����Ŀ
    private String mxecuteDetail;//ִ�е�sql���ϸ��
    private String mallVersion = BMAVersion.MALL_VERSION;//�̳ǰ汾
    private String mallCopyright = BMAVersion.MALL_COPYRIGHT;//�̳ǰ�Ȩ
    
    //������ getter setter ����
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
