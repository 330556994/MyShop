package com.gt.myshop.sqlserver;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 下午3:52:27
 * @description SqlServer策略之表字段分部类
 *
 */
public class TableFields {
    // 广告位置表
    public static String ADVERT_POSITIONS = "[adposid],[displayorder],[title],[description]";
    // 广告表
    public static String ADVERTS = "[adid],[clickcount],[adposid],[state],[starttime],[endtime],[displayorder],[title],[image],[url],[extfield1],[extfield2],[extfield3],[extfield4],[extfield5]";
    // 属性分组表
    public static String ATTRIBUTE_GROUPS = "[attrgroupid],[cateid],[name],[displayorder]";
    // 属性表
    public static String ATTRIBUTES = "[attrid],[name],[cateid],[attrgroupid],[showtype],[isfilter],[displayorder]";
    // 属性值表
    public static String ATTRIBUTE_VALUES = "[attrvalueid],[attrvalue],[isinput],[attrname],[attrdisplayorder],[attrshowtype],[attrvaluedisplayorder],[attrgroupid],[attrgroupname],[attrgroupdisplayorder],[attrid]";
    // 被禁止的ip表
    public static String BANNEDIPS = "[id],[ip],[liftbantime]";
    // 品牌表
    public static String BRANDS = "[brandid],[displayorder],[name],[logo]";
    // 浏览历史表
    public static String BROWSEHISTORIES = "[recordid],[uid],[pid],[times],[updatetime]";
    // 买送促销商品表
    public static String BUYSEND_PRODUCTS = "[recordid],[pmid],[pid]";
    // 买送促销表
    public static String BUYSEND_PROMOTIONS = "[pmid],[storeid],[starttime],[endtime],[userranklower],[state],[name],[type],[buycount],[sendcount]";
    // 分类表
    public static String CATEGORIES = "[cateid],[displayorder],[name],[pricerange],[parentid],[layer],[haschild],[path]";
    // 优惠劵商品表
    public static String COUPON_PRODUCTS = "[recordid],[coupontypeid],[pid]";
    // 优惠劵表
    public static String COUPONS = "[couponid],[couponsn],[uid],[coupontypeid],[storeid],[oid],[usetime],[useip],[money],[activatetime],[activateip],[createuid],[createoid],[createtime],[createip]";
    // 优惠劵类型表
    public static String COUPON_TYPES = "[coupontypeid],[storeid],[state],[name],[money],[count],[sendmode],[getmode],[usemode],[userranklower],[orderamountlower],[limitstorecid],[limitproduct],[sendstarttime],[sendendtime],[useexpiretime],[usestarttime],[useendtime]";
    // 积分日志表
    public static String CREDITLOGS = "[logid],[uid],[paycredits],[rankcredits],[action],[actioncode],[actiontime],[actiondes],[operator]";
    // 事件日志表
    public static String EVENTLOGS = "[id],[key],[title],[server],[executetime]";
    // 商品收藏夹表
    public static String FAVORITEPRODUCTS = "[recordid],[uid],[pid],[state],[addtime]";
    // 店铺收藏夹表
    public static String FAVORITESTORES = "[recordid],[uid],[storeid],[addtime]";
    // 筛选词表
    public static String FILTERWORDS = "[id],[match],[replace]";
    // 友情链接表
    public static String FRIENDLINKS = "[id],[name],[title],[logo],[url],[target],[displayorder]";
    // 满减促销商品表
    public static String FULLCUT_PRODUCTS = "[recordid],[pmid],[pid]";
    // 满减促销表
    public static String FULLCUT_PROMOTIONS = "[pmid],[storeid],[type],[starttime],[endtime],[userranklower],[state],[name],[limitmoney1],[cutmoney1],[limitmoney2],[cutmoney2],[limitmoney3],[cutmoney3]";
    // 满赠促销商品表
    public static String FULLSEND_PRODUCTS = "[recordid],[pmid],[pid],[type]";
    // 满赠促销表
    public static String FULLSEND_PROMOTIONS = "[pmid],[storeid],[starttime],[endtime],[userranklower],[state],[name],[limitmoney],[addmoney]";
    // 赠品表
    public static String GIFTS = "[recordid],[pmid],[giftid],[number],[pid]";
    // 赠品促销表
    public static String GIFT_PROMOTIONS = "[pmid],[pid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[quotaupper]";
    // 商城帮助表
    public static String HELPS = "[id],[pid],[title],[url],[description],[displayorder]";
    // 登录失败日志表
    public static String LOGINFAILLOGS = "[id],[loginip],[failtimes],[lastlogintime]";
    // 商城后台操作表
    public static String MALL_ADMINACTIONS = "[aid],[title],[action],[parentid],[displayorder]";
    // 商城管理员组表
    public static String MALL_ADMINGROUPS = "[mallagid],[title],[actionlist]";
    // 商城管理日志表
    public static String MALL_ADMINLOGS = "[logid],[uid],[nickname],[mallagid],[mallagtitle],[operation],[description],[ip],[operatetime]";
    // 导航栏表
    public static String NAVS = "[id],[pid],[layer],[name],[title],[url],[target],[displayorder]";
    // 新闻表
    public static String NEWS = "[newsid],[newstypeid],[isshow],[istop],[ishome],[displayorder],[addtime],[title],[url],[body]";
    // 新闻类型表
    public static String NEWS_TYPES = "[newstypeid],[name],[displayorder]";
    // 开放授权表
    public static String OAUTH = "[id],[uid],[openid],[server]";
    // 用户在线时间表
    public static String ONLINE_TIME = "[uid],[total],[year],[month],[week],[day],[updatetime]";
    // 在线用户表
    public static String ONLINE_USERS = "[olid],[uid],[sid],[nickname],[ip],[regionid],[updatetime]";
    // 订单处理表
    public static String ORDER_ACTIONS = "[aid],[oid],[uid],[realname],[actiontype],[actiontime],[actiondes]";
    // 订单售后服务表
    public static String ORDER_AFTERSERVICES = "[asid],[state],[uid],[oid],[recordid],[pid],[cateid],[brandid],[storeid],[pname],[pshowimg],[count],[money],[type],[applyreason],[applytime],[checkresult],[checktime],[shipcoid1],[shipconame1],[shipsn1],[regionid],[consignee],[mobile],[phone],[email],[zipcode],[address],[sendtime],[receivetime],[shipcoid2],[shipconame2],[shipsn2],[backtime]";
    // 订单退款表
    public static String ORDER_REFUNDS = "[refundid],[state],[storeid],[storename],[oid],[osn],[uid],[asid],[paysystemname],[payfriendname],[paysn],[paymoney],[refundmoney],[applytime],[refundsn],[refundtime]";
    // 订单表
    public static String ORDERS = "[oid],[osn],[uid],[orderstate],[productamount],[orderamount],[surplusmoney],[isreview],[addtime],[storeid],[storename],[shipsn],[shipcoid],[shipconame],[shiptime],[paymode],[paysn],[paysystemname],[payfriendname],[paytime],[regionid],[consignee],[mobile],[phone],[email],[zipcode],[address],[besttime],[shipfee],[fullcut],[discount],[paycreditcount],[paycreditmoney],[couponmoney],[weight],[buyerremark],[ip]";
    // 商品属性表
    public static String PRODUCT_ATTRIBUTES = "[recordid],[pid],[attrid],[attrvalueid],[inputvalue]";
    // 商品咨询表
    public static String PRODUCT_CONSULTS = "[consultid],[pid],[consulttypeid],[state],[consultuid],[replyuid],[storeid],[consulttime],[replytime],[consultmessage],[replymessage],[consultnickname],[replynickname],[pname],[pshowimg],[consultip],[replyip]";
    // 商品咨询类型表
    public static String PRODUCT_CONSULTTYPES = "[consulttypeid],[title],[displayorder]";
    // 商品图片表
    public static String PRODUCT_IMAGES = "[pimgid],[pid],[showimg],[ismain],[displayorder],[storeid]";
    // 商品评价质量表
    public static String PRODUCT_REVIEWQUALITY = "[id],[reviewid],[uid],[votetime]";
    // 商品评价表
    public static String PRODUCT_REVIEWS = "[reviewid],[pid],[uid],[oprid],[oid],[parentid],[state],[storeid],[star],[quality],[message],[reviewtime],[paycredits],[pname],[pshowimg],[buytime],[ip]";
    // 商品表
    public static String PRODUCTS = "[pid],[psn],[cateid],[brandid],[storeid],[storecid],[storestid],[skugid],[name],[shopprice],[marketprice],[costprice],[state],[isbest],[ishot],[isnew],[displayorder],[weight],[showimg],[salecount],[visitcount],[reviewcount],[star1],[star2],[star3],[star4],[star5],[addtime],[description]";
    // 商品部分表
    public static String PART_PRODUCTS = "[pid],[psn],[cateid],[brandid],[storeid],[storecid],[storestid],[skugid],[name],[shopprice],[marketprice],[costprice],[state],[isbest],[ishot],[isnew],[displayorder],[weight],[showimg],[salecount],[visitcount],[reviewcount],[star1],[star2],[star3],[star4],[star5],[addtime]";
    // 商品SKU表
    public static String PRODUCT_SKUS = "[recordid],[skugid],[pid],[attrid],[attrvalueid],[inputvalue]";
    // 商品统计表
    public static String PRODUCT_STATS = "[recordid],[pid],[category],[value],[count]";
    // 商品库存表
    public static String PRODUCT_STOCKS = "[pid],[number],[limit]";
    // PV统计表
    public static String PVSTATS = "[recordid],[storeid],[category],[value],[count]";
    // 全国行政区域表
    public static String REGIONS = "[regionid],[name],[spell],[shortspell],[displayorder],[parentid],[layer],[provinceid],[provincename],[cityid],[cityname]";
    // 关联商品表
    public static String RELATEPRODUCTS = "[recordid],[pid],[relatepid]";
    // 搜索历史表
    public static String SEARCHHISTORIES = "[recordid],[uid],[keyword],[times],[updatetime]";
    // 用户配送地址表
    public static String SHIPADDRESSES = "[said],[uid],[regionid],[isdefault],[consignee],[mobile],[phone],[email],[zipcode],[address]";
    // 配送公司表
    public static String SHIPCOMPANIES = "[shipcoid],[name],[displayorder]";
    // 单品促销表
    public static String SINGLE_PROMOTIONS = "[pmid],[pid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[slogan],[discounttype],[discountvalue],[coupontypeid],[paycredits],[isstock],[stock],[quotalower],[quotaupper],[allowbuycount]";
    // 店铺管理日志表
    public static String STORE_ADMINLOGS = "[logid],[uid],[nickname],[storeid],[storename],[operation],[description],[ip],[operatetime]";
    // 店铺分类表
    public static String STORE_CLASSES = "[storecid],[storeid],[displayorder],[name],[parentid],[layer],[haschild],[path]";
    // 店铺行业表
    public static String STORE_INDUSTRIES = "[storeiid],[title],[displayorder]";
    // 店长表
    public static String STORE_KEEPERS = "[storeid],[type],[name],[idcard],[address]";
    // 店铺等级表
    public static String STORE_RANKS = "[storerid],[title],[avatar],[honestieslower],[honestiesupper],[productcount]";
    // 店铺评价表
    public static String STORE_REVIEWS = "[reviewid],[oid],[storeid],[descriptionstar],[servicestar],[shipstar],[uid],[reviewtime],[ip]";
    // 店铺表
    public static String STORES = "[storeid],[state],[name],[regionid],[storerid],[storeiid],[logo],[createtime],[mobile],[phone],[qq],[ww],[depoint],[sepoint],[shpoint],[honesties],[stateendtime],[theme],[banner],[announcement],[description]";
    // 店铺配送费用表
    public static String STORE_SHIPFEES = "[recordid],[storestid],[regionid],[startvalue],[startfee],[addvalue],[addfee]";
    // 店铺配送模板表
    public static String STORE_SHIPTEMPLATES = "[storestid],[storeid],[free],[type],[title]";
    // 套装商品表
    public static String SUIT_PRODUCTS = "[recordid],[pmid],[pid],[discount],[number]";
    // 套装促销活动表
    public static String SUIT_PROMOTIONS = "[pmid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[quotaupper],[onlyonce]";
    // 定时商品表
    public static String TIMEPRODUCTS = "[recordid],[pid],[storeid],[onsalestate],[outsalestate],[onsaletime],[outsaletime]";
    // 活动专题表
    public static String TOPICS = "[topicid],[starttime],[endtime],[isshow],[sn],[title],[headhtml],[bodyhtml]";
    // 部分用户表
    public static String PARTUSERS = "[uid],[username],[email],[mobile],[password],[userrid],[storeid],[mallagid],[nickname],[avatar],[paycredits],[rankcredits],[verifyemail],[verifymobile],[liftbantime],[salt]";
    // 用户细节表
    public static String USERDETAILS = "[uid],[lastvisittime],[lastvisitip],[lastvisitrgid],[registertime],[registerip],[registerrgid],[gender],[realname],[bday],[idcard],[regionid],[address],[bio]";
    // 用户等级表
    public static String USER_RANKS = "[userrid],[system],[title],[avatar],[creditslower],[creditsupper],[limitdays]";
}
