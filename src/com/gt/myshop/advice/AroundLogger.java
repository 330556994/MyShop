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
 * @date 2017-4-8 下午11:25:30
 * @description  通过 MethodInterceptor 接口实现环绕增强
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
		log.info("调用 "+target+" 的 " +method.getName()+" 方法，方法入参："+Arrays.toString(args));
		try{
			Object result = arg0.proceed();
			log.info("调用 "+target +" 的 "+method.getName()+" 方法，方法的返回值为： "+result);
			return result;
		}catch(Throwable e){
			log.error(method.getName()+" 方法发生异常： "+e);
			throw e;
		}
	}

}
