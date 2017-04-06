package com.gt.myshop.event;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:04:14
 * @description MyShop 事件接口
 *
 */
public interface IEvent {

	/**
	 * 执行事件
	 * @param eventInfo 事件信息
	 */
	void Execute(Object eventInfo);
	
}
