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
 * @date 2017-4-3 ����11:31:43
 * @description PC�̳Ǻ�̨������������
 *
 */

@Component
public class MallAdminWorkContext {
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

    private PartUserInfo partUserInfo;//�û���Ϣ

    private int userRid = -1;//�û��ȼ�id

    private UserRankInfo userRankInfo;//�û��ȼ���Ϣ

    private String userRTitle;//�û��ȼ�����

    private int mallAGid = -1;//�û��̳ǹ���Ա��id

    private MallAdminGroupInfo mallAdminGroupInfo;//�û��̳ǹ���Ա����Ϣ

    private String mallAGTitle;//�̳ǹ���Ա�����

    private String controller;//������

    private String action;//��������

    private String pageKey;//ҳ���ʾ��

    private String imageCDN;//ͼƬcdn

    private String CSSCDN;//csscdn

    private String scriptCDN;//�ű�cdn

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
