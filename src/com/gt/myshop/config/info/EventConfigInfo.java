package com.gt.myshop.config.info;

import java.util.List;

import com.gt.myshop.event.EventInfo;

public class EventConfigInfo {
	private int bmaeventstate;				//BrnMall�¼�״̬
    private int bmaeventperiod;				//BrnMall�¼�ִ�м��(��λΪ����)
    private List<EventInfo> bmaeventlist;	//BrnMall�¼��б�
    
    //����Ϊ getter setter ����
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
