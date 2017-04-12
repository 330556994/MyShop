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
 * @date 2017-4-11 下午9:14:04
 * @description 通过注解实现增强
 * 
 * 		除了通过实现 Spring 提供的特定的接口，Spring还通过集成 AspectJ 实现了以注解的方式定义增强类，大大减少了配置文件中的工作量
 * 	  	
 * 		AspectJ 是一个面向切面的框架，他扩展了java语言，定义了 AOP 语法，能够在编译期提供代码的织入。所以他有一个专门的编译期用来生成
 *  遵守字节编码规范的 Class 文件
 *  	@AspectJ 是 Aspect5 新增的功能，使用JDK5.0注解技术和正规的 AspectJ 切点表达式语言扫描切面，。因此，在使用 @Aspect
 *  之前，首先需要保证使用的 JDK是5.0或其以上版本，否则无法使用注解技术，其次，因为 Java 的反射机制无法获取方法参数名，Spring需要
 *  利用轻量级的字节码处理框架 asm 处理 @AspectJ 中所描述的方法参数名，所以使用 @AspectJ 注解表达式时，需将 Spring 的 asm 模块
 *  添加到类路径中。
 *  
 *  	这里使用 @Aspect 注解将 MyShopLogger 定义为切面，并且使用 @Before 注解将 before() 方法定义为前置增强，
 *  使用 @AfterReturning 注解将 afterReturning() 方法定义为后置增强，同事指定了切入点为 com.gt.myshop 包下的所有方法
 *  	
 *  	增强定义完后，就可以在 Spring 配置文件中织入注解定义的增强了。
 *  
 *  	切入点匹配的执行点称作连接点(Join Point)。 为了能够获得当前连接点信息，可以在增强方法中声明一个 Join Point 类型的参数
 *  Spring 会自动注入该实例，通过该实例的 getTarget() 方法可以得到被代理对象，getSignature() 方法返回被代理的目标方法，getArgs()
 *  方法返回传递给目标方法的参数数组。
 *  	
 *  	对于后置增强，还可以定义一个参数用于接收被代理的返回值，需要注意的是，必须在 @AfterReturing 注解中通过 returning 属性指定该参数的
 *  名称，Spring 会将方法返回值赋值给指定名称的参数。
 *  	
 *  	使用 @AfterThrowing 注解可以定义异常抛出增强，如果需要获取抛出的异常，可以为增强方法声明相关类型的参数，并通过 @AfterThrowing 注解
 *  的 throwing 属性指定该参数名称， Spring 会为去注入方法抛出的异常实例
 *  
 *  	使用 @Around 主机可以定义环绕增强，通过为增强方法生命 ProceedingJoinPoint 类型的参数，可以获得连接点信息，所用方法与 JoinPoint 相同
 *  ProceedingJoinPoint 是 JoinPoint 的子接口，他的 proceed() 方法可以调用真正的目标方法，从而达到对连接点的完全控制。
 *  
 *  	@AspectJ 还提供了一种最终增强类型，其特点是无论方法抛出异常还是正常退出，该增强都会得到执行，类似于异常处理机制中的 finally 快的作用，
 *  一般用于释放资源。 使用 @After 注解定义最终增强。
 *  	
 *
 */

@Aspect
@Component
public class MyShopLogger {
	
	private static final Logger logger = Logger.getLogger(MyShopLogger.class);
	
	//定义前置增强
	@Before("execution(* com.gt.myshop..*.*(..))")
	public void before(JoinPoint jp){
		logger.info("方法调用开始：调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法入参： "+
				Arrays.toString(jp.getArgs()));
	}

	//定义后置增强
	@AfterReturning(pointcut = "execution(* com.gt.myshop..*.*(..))",returning = "returnValue")
	public void afterReturning(JoinPoint jp , Object returnValue){
		logger.info("方法调用结束：调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法，方法返回值：" +
				returnValue);
	}
	
	//异常抛出增强
	@AfterThrowing(pointcut = "execution(* com.gt.myshop..*.*(..))" , throwing = "e")
	public void afterThrowing(JoinPoint jp , RuntimeException e){
		logger.error(jp.getSignature().getName() + " 方法发生异常: " + e);
	}
	
	//环绕增强
	@Around("execution(* com.gt.myshop..*.*(..))")
	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
		logger.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法入参： "+
				Arrays.toString(jp.getArgs()));
		try{
			Object result = jp.proceed();
			logger.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法，方法返回值：" +
				result);
			return result;
		}catch (Throwable e) {
			logger.error(jp.getSignature().getName() + " 方法发生异常: " + e);
			throw e;
		}
	}
	
	@After("execution(* com.gt.myshop..*.*(..))")
	public void afterLogger(JoinPoint jp){
		logger.info(jp.getSignature().getName() + " 方法结束执行。");
	}
}
