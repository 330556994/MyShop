package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:27:16
 * @description Memcached���ﳵ������Ϣ��
 *
 */
public class MemcachedCartConfigInfo {

	private List<String> serverlist;	//�������б�
    private int minpoolsize;			//���ӳ���С������
    private int maxpoolsize;			//���ӳ����������
    private int connectiontimeout;		//���ӳ�ʱʱ��(��λΪ��)
    private int queuetimeout;			//��ѯ��ʱʱ��(��λΪ��)
    private int receivetimeout;			//���ճ�ʱʱ��(��λΪ��)
    private int deadtimeout;			//崻����������ʱ��(��λΪ��)
    
    //������ getter setter ����
	public List<String> getServerlist() {
		return serverlist;
	}
	public void setServerlist(List<String> serverlist) {
		this.serverlist = serverlist;
	}
	public int getMinpoolsize() {
		return minpoolsize;
	}
	public void setMinpoolsize(int minpoolsize) {
		this.minpoolsize = this.minpoolsize=minpoolsize>0?minpoolsize:10;
	}
	public int getMaxpoolsize() {
		return maxpoolsize;
	}
	public void setMaxpoolsize(int maxpoolsize) {
		this.maxpoolsize = this.maxpoolsize=maxpoolsize>0?maxpoolsize:20;
	}
	public int getConnectiontimeout() {
		return connectiontimeout;
	}
	public void setConnectiontimeout(int connectiontimeout) {
		this.connectiontimeout = this.connectiontimeout=connectiontimeout>0?connectiontimeout:10;
	}
	public int getQueuetimeout() {
		return queuetimeout;
	}
	public void setQueuetimeout(int queuetimeout) {
		this.queuetimeout = this.queuetimeout=queuetimeout>0?queuetimeout:10;
	}
	public int getReceivetimeout() {
		return receivetimeout;
	}
	public void setReceivetimeout(int receivetimeout) {
		this.receivetimeout = this.receivetimeout=receivetimeout>0?receivetimeout:10;
	}
	public int getDeadtimeout() {
		return deadtimeout;
	}
	public void setDeadtimeout(int deadtimeout) {
		this.deadtimeout = this.deadtimeout=deadtimeout>0?deadtimeout:100;
	}
    
}
