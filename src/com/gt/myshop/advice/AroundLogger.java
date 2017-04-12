package com.gt.myshop.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;


/**
 * 
 * @author Gongtao
 * @date 2017-4-8 ����11:25:30
 * @description  ͨ�� MethodInterceptor �ӿ�ʵ�ֻ�����ǿ
 *
 */

@Component
public class AroundLogger implements MethodInterceptor{ 
	
	private static final Log log = LogFactory.getLog(AroundLogger.class);

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		Object target = arg0.getThis();
		Method method = arg0.getMethod();
		Object[] args = arg0.getArguments();
		log.info("���� "+target+" �� " +method.getName()+" ������������Σ�"+Arrays.toString(args));
		try{
			Object result = arg0.proceed();
			log.info("���� "+target +" �� "+method.getName()+" �����������ķ���ֵΪ�� "+result);
			return result;
		}catch(Throwable e){
			log.error(method.getName()+" ���������쳣�� "+e);
			throw e;
		}
	}

}
