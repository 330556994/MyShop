package com.gt.myshop.event;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:04:14
 * @description MyShop �¼��ӿ�
 *
 */
public interface IEvent {

	/**
	 * ִ���¼�
	 * @param eventInfo �¼���Ϣ
	 */
	void Execute(Object eventInfo);
	
}
