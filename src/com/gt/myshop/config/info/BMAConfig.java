package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 上午11:43:09
 * @description MyShop 配置管理类 
 *
 */
public class BMAConfig {
	
	private static Object locker = new Object();								//锁对象

    private static IConfigStrategy iconfigstrategy = null;						//配置策略

    private static RDBSConfigInfo rdbsconfiginfo = null;						//关系数据库配置信息
    private static MallConfigInfo mallconfiginfo = null;						//商城基本配置信息
    private static EmailConfigInfo emailconfiginfo = null;						//邮件配置信息
    private static SMSConfigInfo smsconfiginfo = null;							//短信配置信息
    private static CreditConfigInfo creditconfiginfo = null;					//积分配置信息
    private static UploadConfigInfo uploadconfiginfo = null;					//上传配置信息
    private static EventConfigInfo eventconfiginfo = null;						//事件配置信息
    private static RedisNOSQLConfigInfo redisnosqlconfiginfo = null;			//redis非关系数据库配置信息
    private static MemcachedCacheConfigInfo memcachedcacheconfiginfo = null;	//Memcached缓存配置信息
    private static MemcachedSessionConfigInfo memcachedsessionconfiginfo = null;//Memcached会话状态配置信息
    private static MemcachedCartConfigInfo memcachedcartconfiginfo = null;		//Memcached购物车配置信息
    private static RabbitMQOrderConfigInfo rabbitmqorderconfiginfo = null;		//RabbitMQ订单配置信息
	
    
    public static RDBSConfigInfo RDBSConfig(){
    	return rdbsconfiginfo;
    }
    
    public static MallConfigInfo mallConfig(){
    	return mallconfiginfo;
    }
}
