package com.gt.myshop.advice;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Gongtao
 * @date 2017-4-8 下午9:23:22
 * @description 通过 ThrowsAdvice 实现异常抛出增强
 *
 */

@Component
public class ErrorLogger implements ThrowsAdvice{
	private static final Log log = LogFactory.getLog(ErrorLogger.class);
	
	//ThrowsAdvice 没有定义任何方法，但是在定义异常抛出的增强是必须遵守以下方法签名
	//这里规定了 方法名必须是 afterThrowing 。方法入参只有最后一个是必须的。前3个入参是可选的，但是前3个参数要么都提供，要么都不提供
	public void afterThrowing(Method method,Object[] args,Object target,RuntimeException ex){
		log.error(method.getName() + " 方法发生异常 " + ex);
	}
	
	
	
	
}
