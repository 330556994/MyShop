package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:28:46
 * @description Memcached���ﳵ������Ϣ��
 *
 */
public class RabbitMQOrderConfigInfo {
	private List<String> serverlist;	//�������б�
    private int minpoolsize;			//���ӳ���С������
    private int maxpoolsize;			//���ӳ����������
    private int connectiontimeout;		//���ӳ�ʱʱ��(��λΪ��)
    private int queuetimeout;			//��ѯ��ʱʱ��(��λΪ��)
    private int receivetimeout;		//���ճ�ʱʱ��(��λΪ��)
    private int deadtimeout;			//崻����������ʱ��(��λΪ��)
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
