package com.gt.myshop.event;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:02:04
 * @description �¼���Ϣ��
 *
 */
public class EventInfo {

	private String key;			//Ψһ��
    private String title;		//����
    private int timetype;		//ʱ������(0�����ض�ʱ�䣬1����ʱ����)
    private int timevalue;		//ʱ��(��λΪ����)
    private String classname;	//����ȫ�޶���
    private String code;		//����
    private int enabled;		//�Ƿ�����
    
    //������ getter setter ����
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTimetype() {
		return timetype;
	}
	public void setTimetype(int timetype) {
		this.timetype = timetype;
	}
	public int getTimevalue() {
		return timevalue;
	}
	public void setTimevalue(int timevalue) {
		this.timevalue = timevalue;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
    
}
