package com.gt.myshop.config.info;

import java.util.List;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:09:18
 * @description Redis非关系型数据库配置信息类
 *
 */
public class RedisNOSQLConfigInfo {

	private RedisConfigInfo user = null;		//用户redis配置信息
	private RedisConfigInfo product = null;	//商品redis配置信息
    private RedisConfigInfo store = null;		//店铺redis配置信息
    private RedisConfigInfo promotion = null;	//促销活动redis配置信息
    private RedisConfigInfo order = null;		//订单redis配置信息
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
     * @date 2017-4-3 下午12:08:57
     * @description Redis配置信息类
     *
     */
    public class RedisConfigInfo
    {
        private int enabled;					//是否启用
        private List<String> readwritehostlist;//读写主机列表
        private List<String> readonlyhostlist;	//只读主机列表
        private int maxreadpoolsize;			//最大读池数
        private int maxwritepoolsize;			//最大写池数
        private int initaldb;					//数据库初始化大小
        
        //以下为 RedisConfigInfo 类的 getter setter 方法
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
