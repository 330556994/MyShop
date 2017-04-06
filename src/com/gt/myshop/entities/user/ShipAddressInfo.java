package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 ����12:50:45
 * @description �û����͵�ַ��Ϣ��
 *
 */
public class ShipAddressInfo {
	private int said;//���͵�ַid
    private int uid;//�û�id
    private int regionid;//����id
    private int isdefault;//�Ƿ���Ĭ�ϵ�ַ
    private String alias;//����
    private String consignee;//�ջ���
    private String mobile;//�ջ����ֻ�
    private String phone;//�ջ��˹̶��绰
    private String email;//�ջ�������
    private String zipcode;//��������
    private String address;//��ַ
    
    //������ getter setter ����
	public int getSaid() {
		return said;
	}
	public void setSaid(int said) {
		this.said = said;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getRegionid() {
		return regionid;
	}
	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}
	public int getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(int isdefault) {
		this.isdefault = isdefault;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode.trim();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 
	 * @author Gongtao
	 * @date 2017-4-3 ����12:53:08
	 * @description �����û����͵�ַ��Ϣ��
	 *
	 */
	public class FullShipAddressInfo extends ShipAddressInfo
    {
        private int provinceid;			//ʡid
        private String provincename;	//ʡ����
        private int cityid;				//��id
        private String cityname;		//������
        private int countyid;			//�ػ���id
        private String countyname;		//�ػ�������
        
        //������ FullShipAddressInfo ��� getter setter ����
		public int getProvinceid() {
			return provinceid;
		}
		public void setProvinceid(int provinceid) {
			this.provinceid = provinceid;
		}
		public String getProvincename() {
			return provincename;
		}
		public void setProvincename(String provincename) {
			this.provincename = provincename.trim();
		}
		public int getCityid() {
			return cityid;
		}
		public void setCityid(int cityid) {
			this.cityid = cityid;
		}
		public String getCityname() {
			return cityname;
		}
		public void setCityname(String cityname) {
			this.cityname = cityname.trim();
		}
		public int getCountyid() {
			return countyid;
		}
		public void setCountyid(int countyid) {
			this.countyid = countyid;
		}
		public String getCountyname() {
			return countyname;
		}
		public void setCountyname(String countyname) {
			this.countyname = countyname.trim();
		}		
    }
}
