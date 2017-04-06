package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:18:56
 * @description Memcached缓存配置信息类
 *
 */
public class MemcachedCacheConfigInfo {

	private List<String> serverlist;		//服务器列表
    private int minpoolsize;				//连接池最小连接数
    private int maxpoolsize;				//连接池最大连接数
    private int connectiontimeout;			//连接超时时间(单位为秒)
    private int queuetimeout;				//查询超时时间(单位为秒)
    private int receivetimeout;				//接收超时时间(单位为秒)
    private int deadtimeout;				//宕机服务器检查时间(单位为秒)
    private int cachetimeout;				//缓存超时时间(单位为秒)
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
