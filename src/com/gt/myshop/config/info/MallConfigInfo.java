package com.gt.myshop.config.info;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����11:07:26
 * @description �̳�������Ϣ��
 *
 */

@Component
public class MallConfigInfo {
	private String mallname = "brnmall�����̳�";			//�̳�����
    private String siteurl = "http://www.ddd.com";		//��վ��ַ
    private String sitetitle = "brnmall�����̳�";			//��վ����
    private String seokeyword = "";						//seo�ؼ���
    private String seodescription = "";					//seo����
    private String icp = "��ICP22222";					//�������
    private String script = "";							//�ű�
    private int islicensed = 1;							//�Ƿ���ʾ��Ȩ(0������ʾ��1������ʾ)
    
    //������ getter setter ����
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
