package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:28:46
 * @description Memcached购物车配置信息类
 *
 */
public class RabbitMQOrderConfigInfo {
	private List<String> serverlist;	//服务器列表
    private int minpoolsize;			//连接池最小连接数
    private int maxpoolsize;			//连接池最大连接数
    private int connectiontimeout;		//连接超时时间(单位为秒)
    private int queuetimeout;			//查询超时时间(单位为秒)
    private int receivetimeout;		//接收超时时间(单位为秒)
    private int deadtimeout;			//宕机服务器检查时间(单位为秒)
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
		this.minpoolsize = minpoolsize;
	}
	public int getmaxpoolsize() {
		return maxpoolsize;
	}
	public void setmaxpoolsize(int maxpoolsize) {
		this.maxpoolsize = maxpoolsize;
	}
	public int getconnectiontimeout() {
		return connectiontimeout;
	}
	public void setconnectiontimeout(int connectiontimeout) {
		this.connectiontimeout = connectiontimeout;
	}
	public int getqueuetimeout() {
		return queuetimeout;
	}
	public void setqueuetimeout(int queuetimeout) {
		this.queuetimeout = queuetimeout;
	}
	public int getreceivetimeout() {
		return receivetimeout;
	}
	public void setreceivetimeout(int receivetimeout) {
		this.receivetimeout = receivetimeout;
	}
	public int getdeadtimeout() {
		return deadtimeout;
	}
	public void setdeadtimeout(int deadtimeout) {
		this.deadtimeout = deadtimeout;
	}
    
}
