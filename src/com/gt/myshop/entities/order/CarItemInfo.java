package com.gt.myshop.entities.order;

import java.util.ArrayList;
import java.util.List;

public class CarItemInfo {

//	private Boolean _isselected = true;//是否选中
//    private StoreInfo _storeinfo;//店铺信息
//    private List<CartProductInfo> _cartproductlist = new ArrayList<CartProductInfo>();//购物车商品列表
//    private List<CartSuitInfo> _cartsuitlist = new ArrayList<CartSuitInfo>();//购物车套装列表
//    private List<CartFullSendInfo> _cartfullsendlist = new ArrayList<CartFullSendInfo>();//购物车满赠列表
//    private List<CartFullCutInfo> _cartfullcutlist = new ArrayList<CartFullCutInfo>();//购物车满减列表
//    private List<OrderProductInfo> _selectedorderproductlist = new ArrayList<OrderProductInfo>();//选中的订单商品列表
//    private List<OrderProductInfo> _remainedorderproductlist = new ArrayList<OrderProductInfo>();//剩余的订单商品列表
//	
//    /**
//     * 
//     * @author GongTao
//     * 购物车商品信息类
//     *
//     */
//    public class CartProductInfo{
//    	private Boolean _isselected = true;				//是否选中
//        private OrderProductInfo _orderproductinfo;		//商品信息
//        private List<OrderProductInfo> _giftlist = null;//赠品列表
//		public bool get_isselected() {
//			return _isselected;
//		}
//		public void set_isselected(bool _isselected) {
//			this._isselected = _isselected;
//		}
//		public OrderProductInfo get_orderproductinfo() {
//			return _orderproductinfo;
//		}
//		public void set_orderproductinfo(OrderProductInfo _orderproductinfo) {
//			this._orderproductinfo = _orderproductinfo;
//		}
//		public List<OrderProductInfo> get_giftlist() {
//			return _giftlist;
//		}
//		public void set_giftlist(List<OrderProductInfo> _giftlist) {
//			this._giftlist = _giftlist;
//		}
//        
//    }
//    
//    /**
//     * 
//     * @author GongTao
//     * 购物车套装信息类
//     *
//     */
//    public class CartSuitInfo{
//    	private Boolean _isselected = true;				//是否选中
//        private int _pmid;								//套装促销活动id
//        private int _buycount;							//购买数量
//        private double _suitprice;						//套装价格
//        private double _suitamount;						//套装合计
//        private double _productamount;					//商品合计
//        private double _discount;						//折扣
//        private List<CartProductInfo> _cartproductlist;	//购物车商品列表
//		public Boolean get_isselected() {
//			return _isselected;
//		}
//		public void set_isselected(Boolean _isselected) {
//			this._isselected = _isselected;
//		}
//		public int get_pmid() {
//			return _pmid;
//		}
//		public void set_pmid(int _pmid) {
//			this._pmid = _pmid;
//		}
//		public int get_buycount() {
//			return _buycount;
//		}
//		public void set_buycount(int _buycount) {
//			this._buycount = _buycount;
//		}
//		public double get_suitprice() {
//			return _suitprice;
//		}
//		public void set_suitprice(double _suitprice) {
//			this._suitprice = _suitprice;
//		}
//		public double get_suitamount() {
//			return _suitamount;
//		}
//		public void set_suitamount(double _suitamount) {
//			this._suitamount = _suitamount;
//		}
//		public double get_productamount() {
//			return _productamount;
//		}
//		public void set_productamount(double _productamount) {
//			this._productamount = _productamount;
//		}
//		public double get_discount() {
//			return _discount;
//		}
//		public void set_discount(double _discount) {
//			this._discount = _discount;
//		}
//		public List<CartProductInfo> get_cartproductlist() {
//			return _cartproductlist;
//		}
//		public void set_cartproductlist(List<CartProductInfo> _cartproductlist) {
//			this._cartproductlist = _cartproductlist;
//		}
//        
//    }
//    
//    /**
//     * 
//     * @author GongTao
//     * 购物车满赠信息类
//     *
//     */
//    public class CartFullSendInfo
//    {
//        private Boolean _isenough = false;									//是否达到满赠促销活动的金额
//        private FullSendPromotionInfo _fullsendpromotioninfo;				//满赠促销活动
//        private OrderProductInfo _fullsendminororderproductinfo = null;		//满赠赠品
//        private List<CartProductInfo> _fullsendmaincartproductlist;			//满赠主商品列表
//        private double _mainproductamount;									//主商品合计
//		public Boolean get_isenough() {
//			return _isenough;
//		}
//		public void set_isenough(Boolean _isenough) {
//			this._isenough = _isenough;
//		}
//		public FullSendPromotionInfo get_fullsendpromotioninfo() {
//			return _fullsendpromotioninfo;
//		}
//		public void set_fullsendpromotioninfo(
//				FullSendPromotionInfo _fullsendpromotioninfo) {
//			this._fullsendpromotioninfo = _fullsendpromotioninfo;
//		}
//		public OrderProductInfo get_fullsendminororderproductinfo() {
//			return _fullsendminororderproductinfo;
//		}
//		public void set_fullsendminororderproductinfo(
//				OrderProductInfo _fullsendminororderproductinfo) {
//			this._fullsendminororderproductinfo = _fullsendminororderproductinfo;
//		}
//		public List<CartProductInfo> get_fullsendmaincartproductlist() {
//			return _fullsendmaincartproductlist;
//		}
//		public void set_fullsendmaincartproductlist(
//				List<CartProductInfo> _fullsendmaincartproductlist) {
//			this._fullsendmaincartproductlist = _fullsendmaincartproductlist;
//		}
//		public double get_mainproductamount() {
//			return _mainproductamount;
//		}
//		public void set_mainproductamount(double _mainproductamount) {
//			this._mainproductamount = _mainproductamount;
//		}
//        
//    }
//
//	
//    
//    public Boolean get_isselected() {
//		return _isselected;
//	}
//
//	public void set_isselected(Boolean _isselected) {
//		this._isselected = _isselected;
//	}
//
//	public StoreInfo get_storeinfo() {
//		return _storeinfo;
//	}
//
//	public void set_storeinfo(StoreInfo _storeinfo) {
//		this._storeinfo = _storeinfo;
//	}
//
//	public List<CartProductInfo> get_cartproductlist() {
//		return _cartproductlist;
//	}
//
//	public void set_cartproductlist(List<CartProductInfo> _cartproductlist) {
//		this._cartproductlist = _cartproductlist;
//	}
//
//	public List<CartSuitInfo> get_cartsuitlist() {
//		return _cartsuitlist;
//	}
//
//	public void set_cartsuitlist(List<CartSuitInfo> _cartsuitlist) {
//		this._cartsuitlist = _cartsuitlist;
//	}
//
//	public List<CartFullSendInfo> get_cartfullsendlist() {
//		return _cartfullsendlist;
//	}
//
//	public void set_cartfullsendlist(List<CartFullSendInfo> _cartfullsendlist) {
//		this._cartfullsendlist = _cartfullsendlist;
//	}
//
//	public List<CartFullCutInfo> get_cartfullcutlist() {
//		return _cartfullcutlist;
//	}
//
//	public void set_cartfullcutlist(List<CartFullCutInfo> _cartfullcutlist) {
//		this._cartfullcutlist = _cartfullcutlist;
//	}
//
//	public List<OrderProductInfo> get_selectedorderproductlist() {
//		return _selectedorderproductlist;
//	}
//
//	public void set_selectedorderproductlist(
//			List<OrderProductInfo> _selectedorderproductlist) {
//		this._selectedorderproductlist = _selectedorderproductlist;
//	}
//
//	public List<OrderProductInfo> get_remainedorderproductlist() {
//		return _remainedorderproductlist;
//	}
//
//	public void set_remainedorderproductlist(
//			List<OrderProductInfo> _remainedorderproductlist) {
//		this._remainedorderproductlist = _remainedorderproductlist;
//	}
//    
//    
//    
}
