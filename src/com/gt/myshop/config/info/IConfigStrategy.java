package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:30:02
 * @description Myshop ���ò��Խӿ�
 *
 */
public interface IConfigStrategy {
    
    RDBSConfigInfo GetRDBSConfig();// ��ù�ϵ���ݿ�����

    /**
     * �����̳ǻ�������
     * @param configInfo �̳ǻ���������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveMallConfig(MallConfigInfo configInfo);
    
    MallConfigInfo GetMallConfig();// ����̳ǻ�������

    /**
     * �����ʼ�����
     * @param configInfo �ʼ�������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveEmailConfig(EmailConfigInfo configInfo);

    EmailConfigInfo GetEmailConfig();// ����ʼ�����
    
    /**
     * �����������
     * @param configInfo ����������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveSMSConfig(SMSConfigInfo configInfo);

    SMSConfigInfo GetSMSConfig();// ��ö�������
    
    /**
     * �����������
     * @param configInfo ����������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveCreditConfig(CreditConfigInfo configInfo);
    
    CreditConfigInfo GetCreditConfig();// ��û�������

    /**
     * �����ϴ�����
     * @param configInfo �ϴ�������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveUploadConfig(UploadConfigInfo configInfo);
    
    UploadConfigInfo GetUploadConfig();// ����ϴ�����
    
    /**
     * �����¼�����
     * @param configInfo �¼�������Ϣ
     * @return �Ƿ񱣴�ɹ�
     */
    Boolean SaveEventConfig(EventConfigInfo configInfo);
    
    EventConfigInfo GetEventConfig();// ����¼�����
    
    RedisNOSQLConfigInfo GetRedisNOSQLConfig();// ���Redis�ǹ�ϵ�����ݿ�����
    
    MemcachedCacheConfigInfo GetMemcachedCacheConfig();// ���Memcached��������
    
    MemcachedSessionConfigInfo GetMemcachedSessionConfig();// ���Memcached�Ự״̬����
    
    MemcachedCartConfigInfo GetMemcachedCartConfig();// ���Memcached���ﳵ����
   
    RabbitMQOrderConfigInfo GetRabbitMQOrderConfig();// ���RabbitMQ��������
}
