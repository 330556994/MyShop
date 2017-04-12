package com.gt.myshop.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class LoggerBefore implements MethodBeforeAdvice{

	private static final Log log = LogFactory.getLog(LoggerBefore.class);
	
	@Override
	public void before(Method method, Object[] arguments, Object target)
			throws Throwable {
		log.info("方法调用开始：调用 " + target +" 的 " + method.getName() + " 方法，方法入参: "+Arrays.toString(arguments));
	}

}
