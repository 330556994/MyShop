package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:18:56
 * @description Memcached����������Ϣ��
 *
 */
public class MemcachedCacheConfigInfo {

	private List<String> serverlist;		//�������б�
    private int minpoolsize;				//���ӳ���С������
    private int maxpoolsize;				//���ӳ����������
    private int connectiontimeout;			//���ӳ�ʱʱ��(��λΪ��)
    private int queuetimeout;				//��ѯ��ʱʱ��(��λΪ��)
    private int receivetimeout;				//���ճ�ʱʱ��(��λΪ��)
    private int deadtimeout;				//崻����������ʱ��(��λΪ��)
    private int cachetimeout;				//���泬ʱʱ��(��λΪ��)
	public List<String> getserverlist() {
		return serverlist;
	}
	public void setserverlist(List<String> serverlist) {
		this.serverlist = serverlist;
	}
	public int getminpoolsize() {
		return minpoolsize;
	}
	public void setminpoolsize(int minpoolsize) {
		this.minpoolsize = this.minpoolsize = minpoolsize>0?minpoolsize:10;
	}
	public int getmaxpoolsize() {
		return maxpoolsize;
	}
	public void setmaxpoolsize(int maxpoolsize) {
		this.maxpoolsize = this.maxpoolsize = maxpoolsize>0?maxpoolsize:20;
	}
	public int getconnectiontimeout() {
		return connectiontimeout;
	}
	public void setconnectiontimeout(int connectiontimeout) {
		this.connectiontimeout = this.connectiontimeout = connectiontimeout>0?connectiontimeout:10;
	}
	public int getqueuetimeout() {
		return queuetimeout;
	}
	public void setqueuetimeout(int queuetimeout) {
		this.queuetimeout = this.queuetimeout=queuetimeout>0?queuetimeout:10;
	}
	public int getreceivetimeout() {
		return receivetimeout;
	}
	public void setreceivetimeout(int receivetimeout) {
		this.receivetimeout = this.receivetimeout=receivetimeout>0?receivetimeout:10;
	}
	public int getdeadtimeout() {
		return deadtimeout;
	}
	public void setdeadtimeout(int deadtimeout) {
		this.deadtimeout = this.deadtimeout=deadtimeout>0?deadtimeout:100;
	}
	public int getcachetimeout() {
		return cachetimeout;
	}
	public void setcachetimeout(int cachetimeout) {
		this.cachetimeout = this.cachetimeout=cachetimeout>0?cachetimeout:3600;
	}
    
}
