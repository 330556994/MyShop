package com.gt.myshop.config.info;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����11:43:09
 * @description MyShop ���ù����� 
 *
 */
public class BMAConfig {
	
	private static Object locker = new Object();								//������

    private static IConfigStrategy iconfigstrategy = null;						//���ò���

    private static RDBSConfigInfo rdbsconfiginfo = null;						//��ϵ���ݿ�������Ϣ
    private static MallConfigInfo mallconfiginfo = null;						//�̳ǻ���������Ϣ
    private static EmailConfigInfo emailconfiginfo = null;						//�ʼ�������Ϣ
    private static SMSConfigInfo smsconfiginfo = null;							//����������Ϣ
    private static CreditConfigInfo creditconfiginfo = null;					//����������Ϣ
    private static UploadConfigInfo uploadconfiginfo = null;					//�ϴ�������Ϣ
    private static EventConfigInfo eventconfiginfo = null;						//�¼�������Ϣ
    private static RedisNOSQLConfigInfo redisnosqlconfiginfo = null;			//redis�ǹ�ϵ���ݿ�������Ϣ
    private static MemcachedCacheConfigInfo memcachedcacheconfiginfo = null;	//Memcached����������Ϣ
    private static MemcachedSessionConfigInfo memcachedsessionconfiginfo = null;//Memcached�Ự״̬������Ϣ
    private static MemcachedCartConfigInfo memcachedcartconfiginfo = null;		//Memcached���ﳵ������Ϣ
    private static RabbitMQOrderConfigInfo rabbitmqorderconfiginfo = null;		//RabbitMQ����������Ϣ
	
    
    public static RDBSConfigInfo RDBSConfig(){
    	return rdbsconfiginfo;
    }
    
    public static MallConfigInfo mallConfig(){
    	return mallconfiginfo;
    }
}
