package com.gt.myshop.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class LoggerAfterReturning implements AfterReturningAdvice{

	private static final Log log = LogFactory.getLog(LoggerAfterReturning.class);
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2,
			Object target) throws Throwable {
		log.info("�������ý���������" + target + " �� "+method.getName()+" ��������������ֵ��"+returnValue);
		
	}

}
