package com.gt.myshop.entities.user;

/**
 * 
 * @author Gongtao
 * @date 2017-4-3 下午12:50:45
 * @description 用户配送地址信息类
 *
 */
public class ShipAddressInfo {
	private int said;//配送地址id
    private int uid;//用户id
    private int regionid;//区域id
    private int isdefault;//是否是默认地址
    private String alias;//别名
    private String consignee;//收货人
    private String mobile;//收货人手机
    private String phone;//收货人固定电话
    private String email;//收货人邮箱
    private String zipcode;//邮政编码
    private String address;//地址
    
    //以下是 getter setter 方法
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
	 * @date 2017-4-3 下午12:53:08
	 * @description 完整用户配送地址信息类
	 *
	 */
	public class FullShipAddressInfo extends ShipAddressInfo
    {
        private int provinceid;			//省id
        private String provincename;	//省名称
        private int cityid;				//市id
        private String cityname;		//市名称
        private int countyid;			//县或区id
        private String countyname;		//县或区名称
        
        //以下是 FullShipAddressInfo 类的 getter setter 方法
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
