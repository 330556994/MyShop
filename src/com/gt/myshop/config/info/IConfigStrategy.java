package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:30:02
 * @description Myshop 配置策略接口
 *
 */
public interface IConfigStrategy {
    
    RDBSConfigInfo GetRDBSConfig();// 获得关系数据库配置

    /**
     * 保存商城基本配置
     * @param configInfo 商城基本配置信息
     * @return 是否保存成功
     */
    Boolean SaveMallConfig(MallConfigInfo configInfo);
    
    MallConfigInfo GetMallConfig();// 获得商城基本配置

    /**
     * 保存邮件配置
     * @param configInfo 邮件配置信息
     * @return 是否保存成功
     */
    Boolean SaveEmailConfig(EmailConfigInfo configInfo);

    EmailConfigInfo GetEmailConfig();// 获得邮件配置
    
    /**
     * 保存短信配置
     * @param configInfo 短信配置信息
     * @return 是否保存成功
     */
    Boolean SaveSMSConfig(SMSConfigInfo configInfo);

    SMSConfigInfo GetSMSConfig();// 获得短信配置
    
    /**
     * 保存积分配置
     * @param configInfo 积分配置信息
     * @return 是否保存成功
     */
    Boolean SaveCreditConfig(CreditConfigInfo configInfo);
    
    CreditConfigInfo GetCreditConfig();// 获得积分配置

    /**
     * 保存上传配置
     * @param configInfo 上传配置信息
     * @return 是否保存成功
     */
    Boolean SaveUploadConfig(UploadConfigInfo configInfo);
    
    UploadConfigInfo GetUploadConfig();// 获得上传配置
    
    /**
     * 保存事件配置
     * @param configInfo 事件配置信息
     * @return 是否保存成功
     */
    Boolean SaveEventConfig(EventConfigInfo configInfo);
    
    EventConfigInfo GetEventConfig();// 获得事件配置
    
    RedisNOSQLConfigInfo GetRedisNOSQLConfig();// 获得Redis非关系型数据库配置
    
    MemcachedCacheConfigInfo GetMemcachedCacheConfig();// 获得Memcached缓存配置
    
    MemcachedSessionConfigInfo GetMemcachedSessionConfig();// 获得Memcached会话状态配置
    
    MemcachedCartConfigInfo GetMemcachedCartConfig();// 获得Memcached购物车配置
   
    RabbitMQOrderConfigInfo GetRabbitMQOrderConfig();// 获得RabbitMQ订单配置
}
