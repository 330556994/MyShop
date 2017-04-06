package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:09:18
 * @description Redis�ǹ�ϵ�����ݿ�������Ϣ��
 *
 */
public class RedisNOSQLConfigInfo {

	private RedisConfigInfo user = null;		//�û�redis������Ϣ
	private RedisConfigInfo product = null;	//��Ʒredis������Ϣ
    private RedisConfigInfo store = null;		//����redis������Ϣ
    private RedisConfigInfo promotion = null;	//�����redis������Ϣ
    private RedisConfigInfo order = null;		//����redis������Ϣ
    public RedisConfigInfo getuser() {
		return user;
	}

	public void setuser(RedisConfigInfo user) {
		this.user = user;
	}

	public RedisConfigInfo getproduct() {
		return product;
	}

	public void setproduct(RedisConfigInfo product) {
		this.product = product;
	}

	public RedisConfigInfo getstore() {
		return store;
	}

	public void setstore(RedisConfigInfo store) {
		this.store = store;
	}

	public RedisConfigInfo getpromotion() {
		return promotion;
	}

	public void setpromotion(RedisConfigInfo promotion) {
		this.promotion = promotion;
	}

	public RedisConfigInfo getorder() {
		return order;
	}

	public void setorder(RedisConfigInfo order) {
		this.order = order;
	}
    
    
    /**
     * 
     * @author Gongtao
     * @date 2017-4-3 ����12:08:57
     * @description Redis������Ϣ��
     *
     */
    public class RedisConfigInfo
    {
        private int enabled;					//�Ƿ�����
        private List<String> readwritehostlist;//��д�����б�
        private List<String> readonlyhostlist;	//ֻ�������б�
        private int maxreadpoolsize;			//��������
        private int maxwritepoolsize;			//���д����
        private int initaldb;					//���ݿ��ʼ����С
        
        //����Ϊ RedisConfigInfo ��� getter setter ����
		public int getenabled() {
			return enabled;
		}
		public void setenabled(int enabled) {
			this.enabled = enabled;
		}
		public List<String> getreadwritehostlist() {
			return readwritehostlist;
		}
		public void setreadwritehostlist(List<String> readwritehostlist) {
			this.readwritehostlist = readwritehostlist;
		}
		public List<String> getreadonlyhostlist() {
			return readonlyhostlist;
		}
		public void setreadonlyhostlist(List<String> readonlyhostlist) {
			this.readonlyhostlist = readonlyhostlist;
		}
		public int getmaxreadpoolsize() {
			return maxreadpoolsize;
		}
		public void setmaxreadpoolsize(int maxreadpoolsize) {
			this.maxreadpoolsize = maxreadpoolsize;
		}
		public int getmaxwritepoolsize() {
			return maxwritepoolsize;
		}
		public void setmaxwritepoolsize(int maxwritepoolsize) {
			this.maxwritepoolsize = maxwritepoolsize;
		}
		public int getinitaldb() {
			return initaldb;
		}
		public void setinitaldb(int initaldb) {
			this.initaldb = initaldb;
		}

    }
}
