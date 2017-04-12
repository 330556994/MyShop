<%@page import="java.sql.SQLException"%>
<%@page import="com.gt.myshop.service.NewsService"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>我的购物车-${mallConfig.sitetitle }</title>
    ${mallConfig.seokeyword }
    ${mallConfig.seodescription }
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/buy.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/scripts/jquery.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/scripts/common.js" type="text/javascript"></script>
    <script type="text/javascript">
        uid = @WorkContext.Uid;
        isGuestSC = @WorkContext.MallConfig.IsGuestSC;
        scSubmitType = @WorkContext.MallConfig.SCSubmitType;
    </script>
</head>

<body>

<div id="headerBar" class="bigBox">
<div class="box">
欢迎访问 @WorkContext.MallConfig.MallName
<div  class="headerLink">
    @if (WorkContext.Uid < 1)
    {
        <a href="@Url.Action("login", "account", new RouteValueDictionary { { "returnUrl", WorkContext.Url } })">[登录]</a>
        <a href="@Url.Action("register", "account")" class="A_b">[注册]</a>
    }
    else
    {
        @:您好: @WorkContext.NickName
        <a href="@Url.Action("logout", "account")">[退出]</a>
        if (WorkContext.PartUserInfo.StoreId > 1)
        {
        <a href="@Url.Action("index", "home", new RouteValueDictionary { { "area", "storeadmin" } })">[店铺管理]</a>
        }
        if (WorkContext.MallAGid > 1)
        {
        <a href="@Url.Action("index", "home", new RouteValueDictionary { { "area", "malladmin" } })">[商城管理]</a>
        }
        <a href="@Url.Action("orderlist", "ucenter")">[我的订单]</a>
    }
</div>
</div> 
</div>

<div id="buyTop" class="box">
    <a href="/"><img src="@{@WorkContext.ImageCDN}/images/logo.jpg" width="202" height="53" /></a>
    <div class="buyStep">
        <ul>
            <li class="hot"><s>1</s>1.我的购物车</li>
            <li><s>2</s>2.填写核对订单信息</li>
            <li><s>3</s>3.成功提交订单</li>
            <div class="clear"></div>
        </ul>
    </div>
</div>

<div class="box" id="buy">
 <script type="text/javascript">
     var tempValue = 0;
     function numberFocus(obj) {
         tempValue = obj.value;
         obj.value = "";
     }
     function numberBlur(obj, itemId, itemType) {
         var value = obj.value;
         if (value == "") {
             obj.value = tempValue;
         }
         else {
             if (!isInt(value)) {
                 alert("只能输入数字!");
                 obj.value = tempValue;
             }
             else {
                 if (itemType == 0) {
                     changePruductCount(itemId, value);
                 }
                 else {
                     changeSuitCount(itemId, value);
                 }
             }

         }
     }
 </script>
<h1 id="buyT">我的购物车</h1>
<div id="cartBody">
@if (Model != null && Model.StoreCartList.Count > 0)
{
    <div id="buyDT">
        <ul>
            <li class="checkT"><label><input type="checkbox" checked="checked" id="selectAllBut_top" onclick="cancelOrSelectAllCartItem(this)" />全选</label>&nbsp;</li>
            <li class="productT">商品</li>
            <li class="priceT">价格</li>
            <li class="promotionT">优惠</li>
            <li class="numberT">数量</li>
            <li class="actionT">操作</li>
        </ul>
    </div>

    foreach (StoreCartInfo storeCartInfo in Model.StoreCartList)
    {
     <div class="buyItme">
        <h2><label><input type="checkbox" id="storeCartCheckbox@{@storeCartInfo.StoreInfo.StoreId}" storeId="@storeCartInfo.StoreInfo.StoreId" checked="checked" onclick="cancelOrSelectStoreCart(this)"/>@storeCartInfo.StoreInfo.Name</label></h2>

        <!--普通商品行-->
        @foreach (CartProductInfo cartProductInfo in storeCartInfo.CartProductList)
        {
            <div class="buyItmeC">
                <div class="cell checkC"><input type="checkbox" name="cartItemCheckbox" storeId="@storeCartInfo.StoreInfo.StoreId" @{if (cartProductInfo.IsSelected)
                                                                                                                                        {<text>checked="checked"</text>}} value="0_@{@cartProductInfo.OrderProductInfo.Pid}" onclick="cancelOrSelectCartItem()"/>&nbsp;</div>
                <div class="cell productC">
                    <div class="productC1">
                        <img src="@{@WorkContext.ImageCDN}/upload/store/@cartProductInfo.OrderProductInfo.StoreId/product/show/thumb60_60/@cartProductInfo.OrderProductInfo.ShowImg" width="50" height="50" />
                        <a href="@Url.Action("product", "catalog", new RouteValueDictionary { { "pid", cartProductInfo.OrderProductInfo.Pid } })">@cartProductInfo.OrderProductInfo.Name</a>
                        <div class="clear"></div>
                    </div>
                    @if (cartProductInfo.GiftList.Count > 0)
                    {
                    <div class="productC2">
                    @foreach (OrderProductInfo gift in cartProductInfo.GiftList)
                    {
                    <p>[赠品] @gift.Name</p>
                    }
                    </div>
                    }
                </div>
                <div class="cell priceC">¥@cartProductInfo.OrderProductInfo.DiscountPrice</div>
                @if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId == 0)
                {
                    <div class="priceC1 ">赠积分：<em>@cartProductInfo.OrderProductInfo.PayCredits</em></div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits == 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠优惠劵</div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠京豆(@cartProductInfo.OrderProductInfo.PayCredits)和优惠劵</div>
                }
                else
                {
                    <div class="nopriceC1"></div> 
                }
                <div class="cell numberC"><dl class="buyNB">
                <dd>
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount - 1).ToString()))" class="down">-</a>
                <input type="text" onfocus="numberFocus(this)" onblur="numberBlur(this,@cartProductInfo.OrderProductInfo.Pid,0)" value="@cartProductInfo.OrderProductInfo.RealCount" />
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount + 1).ToString()))" class="up">+</a>
                </dd>
                <div class="clear"></div>
                </dl></div>
                <div class="cell actionC"><a href="javascript:void(0)" onclick="if (confirm('您确定要把该商品移出购物车吗？')) delCartProduct(@cartProductInfo.OrderProductInfo.Pid,0)">删除</a></div>
                <div class="clear"></div>
            </div>
        }

        <!--套装商品行-->
        @foreach (CartSuitInfo cartSuitInfo in storeCartInfo.CartSuitList)
        {
            <div class="buyItmeC">
                <div class="cell checkC"><input type="checkbox" name="cartItemCheckbox" storeId="@storeCartInfo.StoreInfo.StoreId" @{if (cartSuitInfo.IsSelected)
                                                                                                                                        {<text>checked="checked"</text>}} value="1_@{@cartSuitInfo.PmId}" onclick="cancelOrSelectCartItem()"/>&nbsp;</div>
                <div class="cell productC">
                @foreach (CartProductInfo cartProductInfo in cartSuitInfo.CartProductList)
                {
                    <div class="cartSuitItem">
                    <div class="productC1">
                        <img src="@{@WorkContext.ImageCDN}/upload/store/@cartProductInfo.OrderProductInfo.StoreId/product/show/thumb60_60/@cartProductInfo.OrderProductInfo.ShowImg" width="50" height="50" />
                        <a href="@Url.Action("product", "catalog", new RouteValueDictionary { { "pid", cartProductInfo.OrderProductInfo.Pid } })">@cartProductInfo.OrderProductInfo.Name</a>
                        <div class="clear"></div>
                    </div>
                    @if (cartProductInfo.GiftList.Count > 0)
                    {
                    <div class="productC2">
                    @foreach (OrderProductInfo gift in cartProductInfo.GiftList)
                    {
                    <p>[赠品] @gift.Name</p>
                    }
                    </div>
                    }
                    </div>
                }
                </div>
                <div class="cell priceC">¥@cartSuitInfo.SuitPrice</div>
                <div class="nopriceC1"></div>
                <div class="cell numberC">
                    <dl class="buyNB">
                    <dd>
                    <a href="javascript:void(0)" onclick="changeSuitCount(@cartSuitInfo.PmId,@Html.Raw((cartSuitInfo.BuyCount - 1).ToString()))" class="down">-</a>
                    <input type="text" onfocus="numberFocus(this)" onblur="numberBlur(this,@cartSuitInfo.PmId,1)" value="@cartSuitInfo.BuyCount" />
                    <a href="javascript:void(0)" onclick="changeSuitCount(@cartSuitInfo.PmId,@Html.Raw((cartSuitInfo.BuyCount + 1).ToString()))" class="up">+</a>
                    </dd>
                    <div class="clear"></div>
                    </dl>
                </div>
                <div class="cell actionC"><a href="javascript:void(0)" onclick="if (confirm('您确定要把该套装移出购物车吗？')) delCartSuit(@cartSuitInfo.PmId,0)">删除</a></div>
                <div class="clear"></div>
            </div>
        }

        <!--满赠商品行-->
        @foreach (CartFullSendInfo cartFullSendInfo in storeCartInfo.CartFullSendList)
        {
            if (cartFullSendInfo.IsEnough)
            {
                if (cartFullSendInfo.FullSendMinorOrderProductInfo != null)
                {
                    <div class="buyItme_header">
                    <div class="info">
                        <s>满赠</s>活动商品已购满 @cartFullSendInfo.FullSendPromotionInfo.LimitMoney 元,您已经换购了商品 <a href="javascript:getFullSend(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="huangou">重新换购</a>
                        <div class="changeBuy" id="fullSendBlock@{@cartFullSendInfo.FullSendPromotionInfo.PmId}">
                            <h3>请选择换购商品，数量优先，换完为止！<a href="javascript:closeFullSendBlock(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="close">x</a></h3>
                            <div class="changeBuyC" id="fullSendProductList@{@cartFullSendInfo.FullSendPromotionInfo.PmId}"></div>
                            <div class="changeBuyBT">
                                <a href="javascript:addFullSend(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="redBT">确定</a>
                                <a href="javascript:closeFullSendBlock(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="whiteBT">取消</a>
                            </div>
                        </div>
                    </div>
                    <a href="@Url.Action("fullsendmainproductlist", new RouteValueDictionary { { "pmId", cartFullSendInfo.FullSendPromotionInfo.PmId } })" class="more right">活动商品</a>
                </div>
                <div class="buyItme_header fullSendProductTitle"><div class="info">[换购商品]@cartFullSendInfo.FullSendMinorOrderProductInfo.Name</div><a href="javascript:void(0)" onclick="delCartFullSend(@cartFullSendInfo.FullSendPromotionInfo.PmId,0)" class="delFullSend">删除</a></div>
                }
                else if (cartFullSendInfo.FullSendPromotionInfo != null)
                {
                    <div class="buyItme_header">
                    <div class="info">
                        <s>满赠</s>活动商品已购满 @cartFullSendInfo.FullSendPromotionInfo.LimitMoney 元,再加 @cartFullSendInfo.FullSendPromotionInfo.AddMoney 元 <a href="javascript:getFullSend(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="huangou">换购商品</a>
                        <div class="changeBuy" id="fullSendBlock@{@cartFullSendInfo.FullSendPromotionInfo.PmId}">
                            <h3>请选择换购商品，数量优先，换完为止！<a href="javascript:closeFullSendBlock(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="close">x</a></h3>
                            <div class="changeBuyC" id="fullSendProductList@{@cartFullSendInfo.FullSendPromotionInfo.PmId}"></div>
                            <div class="changeBuyBT">
                                <a href="javascript:addFullSend(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="redBT">确定</a>
                                <a href="javascript:closeFullSendBlock(@cartFullSendInfo.FullSendPromotionInfo.PmId)" class="whiteBT">取消</a>
                            </div>
                        </div>
                    </div>
                    <a href="@Url.Action("fullsendmainproductlist", new RouteValueDictionary { { "pmId", cartFullSendInfo.FullSendPromotionInfo.PmId } })" class="more right">活动商品</a>
                </div>
                }
            }

            foreach (CartProductInfo cartProductInfo in cartFullSendInfo.FullSendMainCartProductList)
            {
            <div class="buyItmeC">
                <div class="cell checkC"><input type="checkbox" name="cartItemCheckbox" storeId="@storeCartInfo.StoreInfo.StoreId" @{if (cartProductInfo.IsSelected)
                                                                                                                                        {<text>checked="checked"</text>}} value="0_@{@cartProductInfo.OrderProductInfo.Pid}" onclick="cancelOrSelectCartItem()"/>&nbsp;</div>
                <div class="cell productC">
                    <div class="productC1">
                        <img src="@{@WorkContext.ImageCDN}/upload/store/@cartProductInfo.OrderProductInfo.StoreId/product/show/thumb60_60/@cartProductInfo.OrderProductInfo.ShowImg" width="50" height="50" />
                        <a href="@Url.Action("product", "catalog", new RouteValueDictionary { { "pid", cartProductInfo.OrderProductInfo.Pid } })">@cartProductInfo.OrderProductInfo.Name</a>
                        <div class="clear"></div>
                    </div>
                    @if (cartProductInfo.GiftList.Count > 0)
                    {
                    <div class="productC2">
                    @foreach (OrderProductInfo gift in cartProductInfo.GiftList)
                    {
                    <p>[赠品] @gift.Name</p>
                    }
                    </div>
                    }
                </div>
                <div class="cell priceC">¥@cartProductInfo.OrderProductInfo.DiscountPrice</div>
                @if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId == 0)
                {
                    <div class="priceC1 ">赠积分：<em>@cartProductInfo.OrderProductInfo.PayCredits</em></div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits == 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠优惠劵</div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠京豆(@cartProductInfo.OrderProductInfo.PayCredits)和优惠劵</div>
                }
                else
                {
                    <div class="nopriceC1"></div> 
                }
                <div class="cell numberC"><dl class="buyNB">
                <dd>
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount - 1).ToString()))" class="down">-</a>
                <input type="text" onfocus="numberFocus(this)" onblur="numberBlur(this,@cartProductInfo.OrderProductInfo.Pid,0)" value="@cartProductInfo.OrderProductInfo.RealCount" />
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount - 1).ToString()))" class="up">+</a>
                </dd>
                <div class="clear"></div>
                </dl></div>
                <div class="cell actionC"><a href="javascript:void(0)" onclick="if (confirm('您确定要把该商品移出购物车吗？')) delCartProduct(@cartProductInfo.OrderProductInfo.Pid,0)">删除</a></div>
                <div class="clear"></div>
            </div>
            }
        }

        <!--满减商品行-->
        @foreach (CartFullCutInfo cartFullCutInfo in storeCartInfo.CartFullCutList)
        {
            if (cartFullCutInfo.IsEnough)
            {
            <div class="buyItme_header"><div class="info"><s>满减</s>活动商品已购满 @cartFullCutInfo.LimitMoney 元,优惠 @cartFullCutInfo.CutMoney 元</div><div class="price">&nbsp;</div><s>返现：¥@cartFullCutInfo.CutMoney</s><a href="@Url.Action("fullcutproductlist", new RouteValueDictionary { { "storeId", cartFullCutInfo.FullCutPromotionInfo.StoreId },{ "pmId", cartFullCutInfo.FullCutPromotionInfo.PmId } })" class="more right">活动商品</a></div>
            }
            else
            {
            <div class="buyItme_header"><div class="info"><s>满减</s>活动商品购满 @cartFullCutInfo.LimitMoney 元,即可享受满减 @cartFullCutInfo.CutMoney 元</div></div>
            }

            foreach (CartProductInfo cartProductInfo in cartFullCutInfo.FullCutCartProductList)
            {
            <div class="buyItmeC">
                <div class="cell checkC"><input type="checkbox" name="cartItemCheckbox" storeId="@storeCartInfo.StoreInfo.StoreId" @{if (cartProductInfo.IsSelected)
                                                                                                                                        {<text>checked="checked"</text>}} value="0_@{@cartProductInfo.OrderProductInfo.Pid}" onclick="cancelOrSelectCartItem()"/>&nbsp;</div>
                <div class="cell productC">
                    <div class="productC1">
                        <img src="@{@WorkContext.ImageCDN}/upload/store/@cartProductInfo.OrderProductInfo.StoreId/product/show/thumb60_60/@cartProductInfo.OrderProductInfo.ShowImg" width="50" height="50" />
                        <a href="@Url.Action("product", "catalog", new RouteValueDictionary { { "pid", cartProductInfo.OrderProductInfo.Pid } })">@cartProductInfo.OrderProductInfo.Name</a>
                        <div class="clear"></div>
                    </div>
                    @if (cartProductInfo.GiftList.Count > 0)
                    {
                    <div class="productC2">
                    @foreach (OrderProductInfo gift in cartProductInfo.GiftList)
                    {
                    <p>[赠品] @gift.Name</p>
                    }
                    </div>
                    }
                </div>
                <div class="cell priceC">¥@cartProductInfo.OrderProductInfo.DiscountPrice</div>
                @if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId == 0)
                {
                    <div class="priceC1 ">赠积分：<em>@cartProductInfo.OrderProductInfo.PayCredits</em></div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits == 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠优惠劵</div>
                }
                else if (cartProductInfo.OrderProductInfo.PayCredits > 0 && cartProductInfo.OrderProductInfo.CouponTypeId > 0)
                {
                    <div class="priceC1 ">赠京豆(@cartProductInfo.OrderProductInfo.PayCredits)和优惠劵</div>
                }
                else
                {
                    <div class="nopriceC1"></div> 
                }
                <div class="cell numberC"><dl class="buyNB">
                <dd>
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount - 1).ToString()))" class="down">-</a>
                <input type="text" onfocus="numberFocus(this)" onblur="numberBlur(this,@cartProductInfo.OrderProductInfo.Pid,0)" value="@cartProductInfo.OrderProductInfo.RealCount" />
                <a href="javascript:void(0)" onclick="changePruductCount(@cartProductInfo.OrderProductInfo.Pid,@Html.Raw((cartProductInfo.OrderProductInfo.BuyCount - 1).ToString()))" class="up">+</a>
                </dd>
                <div class="clear"></div>
                </dl></div>
                <div class="cell actionC"><a href="javascript:void(0)" onclick="if (confirm('您确定要把该商品移出购物车吗？')) delCartProduct(@cartProductInfo.OrderProductInfo.Pid,0)">删除</a></div>
                <div class="clear"></div>
            </div>
            }
        }

    </div>
    }

    <div class="buySum">
        <div class="left sum1"><label><input type="checkbox" checked="checked" id="selectAllBut_bottom" onclick="cancelOrSelectAllCartItem(this)"/>&nbsp;全选</label><a href="javascript:void(0)" onclick="clearCart(0)">清空购物车</a> <a href="/">继续购物</a></div>
        <div class="right sum2"><div class="left"><font color="red" id="totalCount">@Model.TotalCount</font>件商品</div><div class="left sum3"><p>总计：<span class="right" id="productAmount">¥@Model.ProductAmount</span></p><p>返现：<span class="right" id="fullCut">- ¥@Model.FullCut</span></p></div><div class="clear"></div></div>
        <div class="clear"></div>
        <div class="buySumBt">总计（不含运费）： <b id="orderAmount">¥@Model.OrderAmount</b><form action="@Url.Action("confirmorder", "order")" method="post"><input name="selectedCartItemKeyList" id="selectedCartItemKeyList" value="" type="hidden" /><a href="javascript:void(0)" onclick="goConfirmOrder()" class="redBT">去结算</a></form></div>
    </div>
}
else
{
<ul id="noBuy">
@if (WorkContext.Uid < 1)
{
  <li>购物车内暂时没有商品，<a href="@Url.Action("login", "account", new RouteValueDictionary { { "returnUrl", Url.Action("index") } })">登录</a>后，将显示您之前加入的商品</li>
  <li><a href="/">去首页</a>挑选喜欢的商品</li>
}
else
{
  <li>购物车内暂时没有商品，<a href="/">去首页</a>挑选喜欢的商品</li>
}
</ul>   
}
</div>
</div>
<!-- 嵌入尾部页面开始 -->
<jsp:include page="../shared/_footer.jsp"/>

</body>
</html>