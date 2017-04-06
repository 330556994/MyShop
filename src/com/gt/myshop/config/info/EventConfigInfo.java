package com.gt.myshop.config.info;

import java.util.List;

import com.gt.myshop.event.EventInfo;

public class EventConfigInfo {
	private int bmaeventstate;				//BrnMall事件状态
    private int bmaeventperiod;				//BrnMall事件执行间隔(单位为分钟)
    private List<EventInfo> bmaeventlist;	//BrnMall事件列表
    
    //以下为 getter setter 方法
	public int getBmaeventstate() {
		return bmaeventstate;
	}
	public void setBmaeventstate(int bmaeventstate) {
		this.bmaeventstate = bmaeventstate;
	}
	public int getBmaeventperiod() {
		return bmaeventperiod;
	}
	public void setBmaeventperiod(int bmaeventperiod) {
		this.bmaeventperiod = bmaeventperiod;
	}
	public List<EventInfo> getBmaeventlist() {
		return bmaeventlist;
	}
	public void setBmaeventlist(List<EventInfo> bmaeventlist) {
		this.bmaeventlist = bmaeventlist;
	}
     
}
