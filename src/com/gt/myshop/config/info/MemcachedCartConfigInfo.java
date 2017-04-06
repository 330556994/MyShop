package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:27:16
 * @description Memcached购物车配置信息类
 *
 */
public class MemcachedCartConfigInfo {

	private List<String> serverlist;	//服务器列表
    private int minpoolsize;			//连接池最小连接数
    private int maxpoolsize;			//连接池最大连接数
    private int connectiontimeout;		//连接超时时间(单位为秒)
    private int queuetimeout;			//查询超时时间(单位为秒)
    private int receivetimeout;			//接收超时时间(单位为秒)
    private int deadtimeout;			//宕机服务器检查时间(单位为秒)
    
    //以下是 getter setter 方法
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
