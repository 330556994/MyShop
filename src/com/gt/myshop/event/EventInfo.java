package com.gt.myshop.event;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:02:04
 * @description 事件信息类
 *
 */
public class EventInfo {

	private String key;			//唯一键
    private String title;		//标题
    private int timetype;		//时间类型(0代表特定时间，1代表时间间隔)
    private int timevalue;		//时间(单位为分钟)
    private String classname;	//类完全限定名
    private String code;		//代码
    private int enabled;		//是否启动
    
    //以下是 getter setter 方法
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
