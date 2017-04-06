package com.gt.myshop.entities.mall;

/**
 * 
 * @author GongTao
 * ���ֶ���ö��
 *
 */
public enum CreditAction {
	
	// ����ͨ�����Ÿ�ֵ,���ұ������һ���ι�������һ�����Ը�����������������
	// ��ֵ���붼��ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ���������ֵ����д����������ֵ����Ҳ����
	
    //����Ա����
    AdminSend(0),
    
    //ע��
    Register(1),
    
    //��¼
    Login(2),
    
    //��֤����
    VerifyEmail(3),
    
    //��֤�ֻ�
    VerifyMobile(4),
    
    //�����û�����
    CompleteUserInfo(5),
    
    //֧������
    PayOrder(6),
    
    //��ɶ���
    CompleteOrder(7),
    
    //������Ʒ
    ReviewProduct(8),
    
    //��Ʒ�����
    SinglePromotion(9),
    
    //�˻ض���ʹ��
    ReturnOrderUse(10),
    
    //�˻ض�������
    ReturnOrderSend(11);
    
    private final int value;
    
    CreditAction(int value) {
    	this.value = value;
    }
    
    public int getValue() {
        return value;
    }
	
}
