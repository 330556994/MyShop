<%@page import="com.gt.myshop.sqlserver.TableFields"%>
<%@page import="com.gt.myshop.service.CategoryInfoService"%>
<%@page import="com.gt.myshop.entities.product.CategoryInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<div id="headerBar" class="bigBox">
<div class="box">
欢迎访问 ${mallConfig.mallname }
<div  class="headerLink">
    <c:choose>
    	<c:when test="${workContext.uid>1 }">
    		<a href="@Url.Action("login", "account", new RouteValueDictionary { { "returnUrl", WorkContext.Url } })">[登录]</a>
        	<a href="@Url.Action("register", "account")" class="A_b">[注册]</a>
    	</c:when>
    	<c:otherwise>
    		您好: ${workContext.nickName }
	        <a href="@Url.Action("logout", "account")">[退出]</a>
	        <c:if test="${workContext.partUserInfo.storeId > 1 }">
	        	<a href="@Url.Action("index", "home", new RouteValueDictionary { { "area", "storeadmin" } })">[店铺管理]</a>
	        </c:if>
	        <c:if test="${workContext.mallAGid > 1 }">
	        	<a href="@Url.Action("index", "home", new RouteValueDictionary { { "area", "malladmin" } })">[商城管理]</a>
	        </c:if>
	        
	        <a href="@Url.Action("orderlist", "ucenter")">[我的订单]</a>
    	</c:otherwise>
    </c:choose>
</div>
</div> 
</div>

 
<c:if test="${homeTopAdvertList!=null && fn:length(homeTopAdvertList)>0}" >
	<div class="headerAD box">
		 <a href="${homeTopAdvertList.url} }"><img src="${pageContext.request.contextPath}/upload/adv/${homeTopAdvertList[0].image}" width="1210" height="70" /></a>
		 <a href="javascript:;" class="close" onclick="this.parentNode.style.display='none'">x</a>
	</div>
</c:if>
<div id="header" class="bigBox">
<div class="box" id="header1">
<a href="/" class="logo left"><img src="${pageContext.request.contextPath}/images/logo.jpg" /></a>
<div class="search left">
<div class="searchCon">
    <input type="text" id="word" name="word" class="Stext" autocomplete="off" onkeydown="javascript:if(event.keyCode==13) mallSearch(document.getElementById('word').value);" value="@Html.Raw(WorkContext.SearchWord)" />
    <input name="" type="button" value="搜索" class="Sbutton" onclick="mallSearch(document.getElementById('word').value)" />
<div class="clear"></div>
</div>
<div class="searchHot">热门搜索：
<c:forEach items="${searchWordAdvertList}" var="sAL">
	<a href="@info.Url">${sAL.title}</a>
</c:forEach>
</div>
</div>
<div class="shopping right" id="cartSnapBox">
<h2><a href="@Url.Action("index", "cart")">我的购物车<b id="cartSnapProudctCount">@WorkContext.CartProductCount</b></a></h2>
<div id="cartSnap" class="shoppingList" style=" display:none;"><div class="loding"><img src="${pageContext.request.contextPath}/images/loading.gif" /><br />加载中，请稍候... </div></div>
</div>
<script type="text/javascript">
    $("#cartSnapBox").mouseenter(function () {
        getCartSnap();
    })
    $("#cartSnapBox").mouseleave(function () {
        closeCartSnap();
    })
</script>

<div class="clear"></div>
</div>
</div>

<div id="nav" class="bigBox">
<div class="box">
<!-- 分类导航 -->

<div id="categorys">
<h2>全部商品分类</h2>

<div id="categorysCon" class="hide">
<!--  
	这里是显示商品分类信息 鼠标悬浮在大标题可以查看具体分类
	层级为 1 的是大标题
	层级为 2 的是二级标题并且给他一个红色的样式
	层级为 3 的就是具体的分类了 在层级三的显示上需要判断他的父id与层级二id是否对应
	外部使用 c:set 设置一个变量的作用是为了判断是否要在大标题后拼接div标签
-->
<c:set value="0" var="layerFlag"></c:set>
<c:forEach items="${categoryList}" var="cl">
	<c:if test="${cl.layer == 1 }">
		<c:if test="${layerFlag == 1 }">
			</div></div>
		</c:if>
		<div class="item" onmouseover="this.className='item hotItem'" onmouseout="this.className='item'">
			<h3><a href="javascript:void(0)">${cl.name }</a></h3>
		<div class="itmeSon">
		<c:set value="1" var="layerFlag"></c:set>
	</c:if>
	<c:if test="${cl.layer == 2 }">
		<dl><dt><a style="" href="javascript:void(0)">${cl.name }</a></dt><dd>
		<c:forEach items="${categoryList}" var="cl2">
			<c:if test="${cl2.parentid == cl.cateid }">
				<em><a style="" href="/list/@{@category.CateId}.html">${cl2.name }</a></em>
			</c:if>
		</c:forEach>
		</dd><div class="clear"></div></dl>
	</c:if>
</c:forEach>
</div>
</div>
</div>
</div>
<script type="text/javascript">
    $("#categorys").mouseover(function () {
        $("#categorysCon").removeClass("hide");
    })
    $("#categorys").mouseout(function () {
        $("#categorysCon").addClass("hide");
    })
</script>
<!-- 分类导航结束 -->

<ul id="navItme">
    <c:forEach items="${navList }" var="nl">
    	<li><a href="@info.Url">${nl.name }</a></li>
    </c:forEach>
</ul>
</div>
</div>