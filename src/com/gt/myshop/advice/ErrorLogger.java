package com.gt.myshop.advice;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Gongtao
 * @date 2017-4-8 ����9:23:22
 * @description ͨ�� ThrowsAdvice ʵ���쳣�׳���ǿ
 *
 */

@Component
public class ErrorLogger implements ThrowsAdvice{
	private static final Log log = LogFactory.getLog(ErrorLogger.class);
	
	//ThrowsAdvice û�ж����κη����������ڶ����쳣�׳�����ǿ�Ǳ����������·���ǩ��
	//����涨�� ������������ afterThrowing ���������ֻ�����һ���Ǳ���ġ�ǰ3������ǿ�ѡ�ģ�����ǰ3������Ҫô���ṩ��Ҫô�����ṩ
	public void afterThrowing(Method method,Object[] args,Object target,RuntimeException ex){
		log.error(method.getName() + " ���������쳣 " + ex);
	}
	
	
	
	
}
