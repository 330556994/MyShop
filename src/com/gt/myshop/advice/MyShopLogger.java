package com.gt.myshop.advice;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Gongtao
 * @date 2017-4-11 ����9:14:04
 * @description ͨ��ע��ʵ����ǿ
 * 
 * 		����ͨ��ʵ�� Spring �ṩ���ض��Ľӿڣ�Spring��ͨ������ AspectJ ʵ������ע��ķ�ʽ������ǿ�࣬�������������ļ��еĹ�����
 * 	  	
 * 		AspectJ ��һ����������Ŀ�ܣ�����չ��java���ԣ������� AOP �﷨���ܹ��ڱ������ṩ�����֯�롣��������һ��ר�ŵı�������������
 *  �����ֽڱ���淶�� Class �ļ�
 *  	@AspectJ �� Aspect5 �����Ĺ��ܣ�ʹ��JDK5.0ע�⼼��������� AspectJ �е���ʽ����ɨ�����棬����ˣ���ʹ�� @Aspect
 *  ֮ǰ��������Ҫ��֤ʹ�õ� JDK��5.0�������ϰ汾�������޷�ʹ��ע�⼼������Σ���Ϊ Java �ķ�������޷���ȡ������������Spring��Ҫ
 *  �������������ֽ��봦���� asm ���� @AspectJ ���������ķ���������������ʹ�� @AspectJ ע����ʽʱ���轫 Spring �� asm ģ��
 *  ��ӵ���·���С�
 *  
 *  	����ʹ�� @Aspect ע�⽫ MyShopLogger ����Ϊ���棬����ʹ�� @Before ע�⽫ before() ��������Ϊǰ����ǿ��
 *  ʹ�� @AfterReturning ע�⽫ afterReturning() ��������Ϊ������ǿ��ͬ��ָ���������Ϊ com.gt.myshop ���µ����з���
 *  	
 *  	��ǿ������󣬾Ϳ����� Spring �����ļ���֯��ע�ⶨ�����ǿ�ˡ�
 *  
 *  	�����ƥ���ִ�е�������ӵ�(Join Point)�� Ϊ���ܹ���õ�ǰ���ӵ���Ϣ����������ǿ����������һ�� Join Point ���͵Ĳ���
 *  Spring ���Զ�ע���ʵ����ͨ����ʵ���� getTarget() �������Եõ����������getSignature() �������ر������Ŀ�귽����getArgs()
 *  �������ش��ݸ�Ŀ�귽���Ĳ������顣
 *  	
 *  	���ں�����ǿ�������Զ���һ���������ڽ��ձ�����ķ���ֵ����Ҫע����ǣ������� @AfterReturing ע����ͨ�� returning ����ָ���ò�����
 *  ���ƣ�Spring �Ὣ��������ֵ��ֵ��ָ�����ƵĲ�����
 *  	
 *  	ʹ�� @AfterThrowing ע����Զ����쳣�׳���ǿ�������Ҫ��ȡ�׳����쳣������Ϊ��ǿ��������������͵Ĳ�������ͨ�� @AfterThrowing ע��
 *  �� throwing ����ָ���ò������ƣ� Spring ��Ϊȥע�뷽���׳����쳣ʵ��
 *  
 *  	ʹ�� @Around �������Զ��廷����ǿ��ͨ��Ϊ��ǿ�������� ProceedingJoinPoint ���͵Ĳ��������Ի�����ӵ���Ϣ�����÷����� JoinPoint ��ͬ
 *  ProceedingJoinPoint �� JoinPoint ���ӽӿڣ����� proceed() �������Ե���������Ŀ�귽�����Ӷ��ﵽ�����ӵ����ȫ���ơ�
 *  
 *  	@AspectJ ���ṩ��һ��������ǿ���ͣ����ص������۷����׳��쳣���������˳�������ǿ����õ�ִ�У��������쳣��������е� finally ������ã�
 *  һ�������ͷ���Դ�� ʹ�� @After ע�ⶨ��������ǿ��
 *  	
 *
 */

@Aspect
@Component
public class MyShopLogger {
	
	private static final Logger logger = Logger.getLogger(MyShopLogger.class);
	
	//����ǰ����ǿ
	@Before("execution(* com.gt.myshop..*.*(..))")
	public void before(JoinPoint jp){
		logger.info("�������ÿ�ʼ������ " + jp.getTarget() + " �� " + jp.getSignature().getName() + " ������������Σ� "+
				Arrays.toString(jp.getArgs()));
	}

	//���������ǿ
	@AfterReturning(pointcut = "execution(* com.gt.myshop..*.*(..))",returning = "returnValue")
	public void afterReturning(JoinPoint jp , Object returnValue){
		logger.info("�������ý��������� " + jp.getTarget() + " �� " + jp.getSignature().getName() + " ��������������ֵ��" +
				returnValue);
	}
	
	//�쳣�׳���ǿ
	@AfterThrowing(pointcut = "execution(* com.gt.myshop..*.*(..))" , throwing = "e")
	public void afterThrowing(JoinPoint jp , RuntimeException e){
		logger.error(jp.getSignature().getName() + " ���������쳣: " + e);
	}
	
	//������ǿ
	@Around("execution(* com.gt.myshop..*.*(..))")
	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
		logger.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName() + " ������������Σ� "+
				Arrays.toString(jp.getArgs()));
		try{
			Object result = jp.proceed();
			logger.info("���� " + jp.getTarget() + " �� " + jp.getSignature().getName() + " ��������������ֵ��" +
				result);
			return result;
		}catch (Throwable e) {
			logger.error(jp.getSignature().getName() + " ���������쳣: " + e);
			throw e;
		}
	}
	
	@After("execution(* com.gt.myshop..*.*(..))")
	public void afterLogger(JoinPoint jp){
		logger.info(jp.getSignature().getName() + " ��������ִ�С�");
	}
}
