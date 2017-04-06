package com.gt.myshop.sqlserver;

/**
 * 
 * @author Gongtao
 * @date 2017-4-4 ����3:52:27
 * @description SqlServer����֮���ֶηֲ���
 *
 */
public class TableFields {
    // ���λ�ñ�
    public static String ADVERT_POSITIONS = "[adposid],[displayorder],[title],[description]";
    // ����
    public static String ADVERTS = "[adid],[clickcount],[adposid],[state],[starttime],[endtime],[displayorder],[title],[image],[url],[extfield1],[extfield2],[extfield3],[extfield4],[extfield5]";
    // ���Է����
    public static String ATTRIBUTE_GROUPS = "[attrgroupid],[cateid],[name],[displayorder]";
    // ���Ա�
    public static String ATTRIBUTES = "[attrid],[name],[cateid],[attrgroupid],[showtype],[isfilter],[displayorder]";
    // ����ֵ��
    public static String ATTRIBUTE_VALUES = "[attrvalueid],[attrvalue],[isinput],[attrname],[attrdisplayorder],[attrshowtype],[attrvaluedisplayorder],[attrgroupid],[attrgroupname],[attrgroupdisplayorder],[attrid]";
    // ����ֹ��ip��
    public static String BANNEDIPS = "[id],[ip],[liftbantime]";
    // Ʒ�Ʊ�
    public static String BRANDS = "[brandid],[displayorder],[name],[logo]";
    // �����ʷ��
    public static String BROWSEHISTORIES = "[recordid],[uid],[pid],[times],[updatetime]";
    // ���ʹ�����Ʒ��
    public static String BUYSEND_PRODUCTS = "[recordid],[pmid],[pid]";
    // ���ʹ�����
    public static String BUYSEND_PROMOTIONS = "[pmid],[storeid],[starttime],[endtime],[userranklower],[state],[name],[type],[buycount],[sendcount]";
    // �����
    public static String CATEGORIES = "[cateid],[displayorder],[name],[pricerange],[parentid],[layer],[haschild],[path]";
    // �Ż݄���Ʒ��
    public static String COUPON_PRODUCTS = "[recordid],[coupontypeid],[pid]";
    // �Ż݄���
    public static String COUPONS = "[couponid],[couponsn],[uid],[coupontypeid],[storeid],[oid],[usetime],[useip],[money],[activatetime],[activateip],[createuid],[createoid],[createtime],[createip]";
    // �Ż݄����ͱ�
    public static String COUPON_TYPES = "[coupontypeid],[storeid],[state],[name],[money],[count],[sendmode],[getmode],[usemode],[userranklower],[orderamountlower],[limitstorecid],[limitproduct],[sendstarttime],[sendendtime],[useexpiretime],[usestarttime],[useendtime]";
    // ������־��
    public static String CREDITLOGS = "[logid],[uid],[paycredits],[rankcredits],[action],[actioncode],[actiontime],[actiondes],[operator]";
    // �¼���־��
    public static String EVENTLOGS = "[id],[key],[title],[server],[executetime]";
    // ��Ʒ�ղؼб�
    public static String FAVORITEPRODUCTS = "[recordid],[uid],[pid],[state],[addtime]";
    // �����ղؼб�
    public static String FAVORITESTORES = "[recordid],[uid],[storeid],[addtime]";
    // ɸѡ�ʱ�
    public static String FILTERWORDS = "[id],[match],[replace]";
    // �������ӱ�
    public static String FRIENDLINKS = "[id],[name],[title],[logo],[url],[target],[displayorder]";
    // ����������Ʒ��
    public static String FULLCUT_PRODUCTS = "[recordid],[pmid],[pid]";
    // ����������
    public static String FULLCUT_PROMOTIONS = "[pmid],[storeid],[type],[starttime],[endtime],[userranklower],[state],[name],[limitmoney1],[cutmoney1],[limitmoney2],[cutmoney2],[limitmoney3],[cutmoney3]";
    // ����������Ʒ��
    public static String FULLSEND_PRODUCTS = "[recordid],[pmid],[pid],[type]";
    // ����������
    public static String FULLSEND_PROMOTIONS = "[pmid],[storeid],[starttime],[endtime],[userranklower],[state],[name],[limitmoney],[addmoney]";
    // ��Ʒ��
    public static String GIFTS = "[recordid],[pmid],[giftid],[number],[pid]";
    // ��Ʒ������
    public static String GIFT_PROMOTIONS = "[pmid],[pid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[quotaupper]";
    // �̳ǰ�����
    public static String HELPS = "[id],[pid],[title],[url],[description],[displayorder]";
    // ��¼ʧ����־��
    public static String LOGINFAILLOGS = "[id],[loginip],[failtimes],[lastlogintime]";
    // �̳Ǻ�̨������
    public static String MALL_ADMINACTIONS = "[aid],[title],[action],[parentid],[displayorder]";
    // �̳ǹ���Ա���
    public static String MALL_ADMINGROUPS = "[mallagid],[title],[actionlist]";
    // �̳ǹ�����־��
    public static String MALL_ADMINLOGS = "[logid],[uid],[nickname],[mallagid],[mallagtitle],[operation],[description],[ip],[operatetime]";
    // ��������
    public static String NAVS = "[id],[pid],[layer],[name],[title],[url],[target],[displayorder]";
    // ���ű�
    public static String NEWS = "[newsid],[newstypeid],[isshow],[istop],[ishome],[displayorder],[addtime],[title],[url],[body]";
    // �������ͱ�
    public static String NEWS_TYPES = "[newstypeid],[name],[displayorder]";
    // ������Ȩ��
    public static String OAUTH = "[id],[uid],[openid],[server]";
    // �û�����ʱ���
    public static String ONLINE_TIME = "[uid],[total],[year],[month],[week],[day],[updatetime]";
    // �����û���
    public static String ONLINE_USERS = "[olid],[uid],[sid],[nickname],[ip],[regionid],[updatetime]";
    // ���������
    public static String ORDER_ACTIONS = "[aid],[oid],[uid],[realname],[actiontype],[actiontime],[actiondes]";
    // �����ۺ�����
    public static String ORDER_AFTERSERVICES = "[asid],[state],[uid],[oid],[recordid],[pid],[cateid],[brandid],[storeid],[pname],[pshowimg],[count],[money],[type],[applyreason],[applytime],[checkresult],[checktime],[shipcoid1],[shipconame1],[shipsn1],[regionid],[consignee],[mobile],[phone],[email],[zipcode],[address],[sendtime],[receivetime],[shipcoid2],[shipconame2],[shipsn2],[backtime]";
    // �����˿��
    public static String ORDER_REFUNDS = "[refundid],[state],[storeid],[storename],[oid],[osn],[uid],[asid],[paysystemname],[payfriendname],[paysn],[paymoney],[refundmoney],[applytime],[refundsn],[refundtime]";
    // ������
    public static String ORDERS = "[oid],[osn],[uid],[orderstate],[productamount],[orderamount],[surplusmoney],[isreview],[addtime],[storeid],[storename],[shipsn],[shipcoid],[shipconame],[shiptime],[paymode],[paysn],[paysystemname],[payfriendname],[paytime],[regionid],[consignee],[mobile],[phone],[email],[zipcode],[address],[besttime],[shipfee],[fullcut],[discount],[paycreditcount],[paycreditmoney],[couponmoney],[weight],[buyerremark],[ip]";
    // ��Ʒ���Ա�
    public static String PRODUCT_ATTRIBUTES = "[recordid],[pid],[attrid],[attrvalueid],[inputvalue]";
    // ��Ʒ��ѯ��
    public static String PRODUCT_CONSULTS = "[consultid],[pid],[consulttypeid],[state],[consultuid],[replyuid],[storeid],[consulttime],[replytime],[consultmessage],[replymessage],[consultnickname],[replynickname],[pname],[pshowimg],[consultip],[replyip]";
    // ��Ʒ��ѯ���ͱ�
    public static String PRODUCT_CONSULTTYPES = "[consulttypeid],[title],[displayorder]";
    // ��ƷͼƬ��
    public static String PRODUCT_IMAGES = "[pimgid],[pid],[showimg],[ismain],[displayorder],[storeid]";
    // ��Ʒ����������
    public static String PRODUCT_REVIEWQUALITY = "[id],[reviewid],[uid],[votetime]";
    // ��Ʒ���۱�
    public static String PRODUCT_REVIEWS = "[reviewid],[pid],[uid],[oprid],[oid],[parentid],[state],[storeid],[star],[quality],[message],[reviewtime],[paycredits],[pname],[pshowimg],[buytime],[ip]";
    // ��Ʒ��
    public static String PRODUCTS = "[pid],[psn],[cateid],[brandid],[storeid],[storecid],[storestid],[skugid],[name],[shopprice],[marketprice],[costprice],[state],[isbest],[ishot],[isnew],[displayorder],[weight],[showimg],[salecount],[visitcount],[reviewcount],[star1],[star2],[star3],[star4],[star5],[addtime],[description]";
    // ��Ʒ���ֱ�
    public static String PART_PRODUCTS = "[pid],[psn],[cateid],[brandid],[storeid],[storecid],[storestid],[skugid],[name],[shopprice],[marketprice],[costprice],[state],[isbest],[ishot],[isnew],[displayorder],[weight],[showimg],[salecount],[visitcount],[reviewcount],[star1],[star2],[star3],[star4],[star5],[addtime]";
    // ��ƷSKU��
    public static String PRODUCT_SKUS = "[recordid],[skugid],[pid],[attrid],[attrvalueid],[inputvalue]";
    // ��Ʒͳ�Ʊ�
    public static String PRODUCT_STATS = "[recordid],[pid],[category],[value],[count]";
    // ��Ʒ����
    public static String PRODUCT_STOCKS = "[pid],[number],[limit]";
    // PVͳ�Ʊ�
    public static String PVSTATS = "[recordid],[storeid],[category],[value],[count]";
    // ȫ�����������
    public static String REGIONS = "[regionid],[name],[spell],[shortspell],[displayorder],[parentid],[layer],[provinceid],[provincename],[cityid],[cityname]";
    // ������Ʒ��
    public static String RELATEPRODUCTS = "[recordid],[pid],[relatepid]";
    // ������ʷ��
    public static String SEARCHHISTORIES = "[recordid],[uid],[keyword],[times],[updatetime]";
    // �û����͵�ַ��
    public static String SHIPADDRESSES = "[said],[uid],[regionid],[isdefault],[consignee],[mobile],[phone],[email],[zipcode],[address]";
    // ���͹�˾��
    public static String SHIPCOMPANIES = "[shipcoid],[name],[displayorder]";
    // ��Ʒ������
    public static String SINGLE_PROMOTIONS = "[pmid],[pid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[slogan],[discounttype],[discountvalue],[coupontypeid],[paycredits],[isstock],[stock],[quotalower],[quotaupper],[allowbuycount]";
    // ���̹�����־��
    public static String STORE_ADMINLOGS = "[logid],[uid],[nickname],[storeid],[storename],[operation],[description],[ip],[operatetime]";
    // ���̷����
    public static String STORE_CLASSES = "[storecid],[storeid],[displayorder],[name],[parentid],[layer],[haschild],[path]";
    // ������ҵ��
    public static String STORE_INDUSTRIES = "[storeiid],[title],[displayorder]";
    // �곤��
    public static String STORE_KEEPERS = "[storeid],[type],[name],[idcard],[address]";
    // ���̵ȼ���
    public static String STORE_RANKS = "[storerid],[title],[avatar],[honestieslower],[honestiesupper],[productcount]";
    // �������۱�
    public static String STORE_REVIEWS = "[reviewid],[oid],[storeid],[descriptionstar],[servicestar],[shipstar],[uid],[reviewtime],[ip]";
    // ���̱�
    public static String STORES = "[storeid],[state],[name],[regionid],[storerid],[storeiid],[logo],[createtime],[mobile],[phone],[qq],[ww],[depoint],[sepoint],[shpoint],[honesties],[stateendtime],[theme],[banner],[announcement],[description]";
    // �������ͷ��ñ�
    public static String STORE_SHIPFEES = "[recordid],[storestid],[regionid],[startvalue],[startfee],[addvalue],[addfee]";
    // ��������ģ���
    public static String STORE_SHIPTEMPLATES = "[storestid],[storeid],[free],[type],[title]";
    // ��װ��Ʒ��
    public static String SUIT_PRODUCTS = "[recordid],[pmid],[pid],[discount],[number]";
    // ��װ�������
    public static String SUIT_PROMOTIONS = "[pmid],[storeid],[starttime1],[endtime1],[starttime2],[endtime2],[starttime3],[endtime3],[userranklower],[state],[name],[quotaupper],[onlyonce]";
    // ��ʱ��Ʒ��
    public static String TIMEPRODUCTS = "[recordid],[pid],[storeid],[onsalestate],[outsalestate],[onsaletime],[outsaletime]";
    // �ר���
    public static String TOPICS = "[topicid],[starttime],[endtime],[isshow],[sn],[title],[headhtml],[bodyhtml]";
    // �����û���
    public static String PARTUSERS = "[uid],[username],[email],[mobile],[password],[userrid],[storeid],[mallagid],[nickname],[avatar],[paycredits],[rankcredits],[verifyemail],[verifymobile],[liftbantime],[salt]";
    // �û�ϸ�ڱ�
    public static String USERDETAILS = "[uid],[lastvisittime],[lastvisitip],[lastvisitrgid],[registertime],[registerip],[registerrgid],[gender],[realname],[bday],[idcard],[regionid],[address],[bio]";
    // �û��ȼ���
    public static String USER_RANKS = "[userrid],[system],[title],[avatar],[creditslower],[creditsupper],[limitdays]";
}
