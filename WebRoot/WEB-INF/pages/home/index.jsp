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
    <title>MyShop-我的商城</title>
    ${mallConfig.seokeyword }
    ${mallConfig.seodescription }
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/css/home.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/scripts/jquery.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/scripts/common.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/scripts/jquery.soChange.js" type="text/javascript"></script>
    <script type="text/javascript">
        uid = @WorkContext.Uid;
        isGuestSC = @WorkContext.MallConfig.IsGuestSC;
        scSubmitType = @WorkContext.MallConfig.SCSubmitType;
    </script>
</head>
<body>

<!-- 嵌入头部页面开始 -->
<jsp:include page="../shared/_header.jsp"/>
<!-- 嵌入头部页面结束 -->

<script type="text/javascript">
    $("#categorys").unbind();
    $("#categorysCon").removeClass("hide");
</script>

<div id="index1" class="box">
<div class="indexPic left">
	<ul>
	    <c:forEach items="${bannerList }" var="blist">
	    	<li>
	    		<a href="${blist.url }">
	    			<img src="${pageContext.request.contextPath}/upload/adv/${blist.image}" width="670px" height="240px"/>
	    		</a>
    		</li>
	    </c:forEach>
	</ul>
	<div class="indexPicBT">
		<!--  
		   forEach 标签中 varStatus属性的含义 这里就用到了：
		   index：当前这次迭代从0开始的迭代索引。
           count：当前这次迭代从1开始的迭代计数。
           first：用来表明当前这轮迭代是否为第一次迭代，该属性为boolean类型。
           last：用来表明当前这轮迭代是否为最后一次迭代，该属性为boolean类型。
           begin：begin属性的值。
           end：end属性的值
           step：step属性的值
		-->
		<!-- 当前处于首页轮播图的按钮处，可以切换轮播图的功能按钮，按钮的个数根据轮播广告的个数来定 -->
        <c:forEach begin="1" end="${fn:length(bannerList) }" step="1" varStatus="i">
        	<a href="#">${i.count }</a>			
        </c:forEach>
        <div class="clear"></div>
    </div>
    <c:if test="${fn:length(bannerList)>1}">
    	<script type="text/javascript">
	        $("#index1 .indexPic li").soChange({
			        thumbObj:"#index1 .indexPicBT a",
			        thumbNowClass:"hot",
			        changeTime:4200,
			        autoChange:true,
			        slideTime:300
		        })
	    </script>
    </c:if>
</div>
<div class="gonggao right">
<h2>通知公告<a href="@Url.Action("list", "news")" class="more">更多公告></a></h2>
<ul class="textList">
    <c:forEach items="${news }" var="n">
    	<li><a href="">${n.title }</a></li>
    </c:forEach>
</ul>
</div>
<div class="clear"></div>
</div>

<!-- 1楼 -->
<div id="floor1" class="floor box">
<h2 class="floorT">
<b>1F</b>电脑数码
<ul>
    <li><a href="javascript:void(0)" class="hot">手机</a></li>
    <li><a href="javascript:void(0)">耳机</a></li>
    <li><a href="javascript:void(0)">数码影音</a></li>
    <li><a href="javascript:void(0)">摄影摄像</a></li>
    <div class="clear"></div>
</ul>
<div class="floorBt"><a href="#">DIY装机大师</a><a href="#">游戏社区</a></div>
<div class="clear"></div>
</h2>
<div class="floorL left">
<ul>
   <c:forEach items="${floor1AdvertList1 }" var="fla1">
   	  <li><a href="${fla1.url} }" class="hot">${fla1.image }</a></li>
   </c:forEach>
   <div class="clear"></div>
</ul>
     <c:if test="${fn:length(floor1AdvertList2)>0 }">
     	<a href="${floor1AdvertList2[0].url}" class="floorAD"><img src="${pageContext.request.contextPath}/upload/adv/${floor1AdvertList2[0].image}" width="202" height="155" /></a>
     </c:if>
</div>
<div class="floorR right">
<div class="floorCon">
<ul>
     <c:forEach items="${floor1AdvertList3 }" var="fla3">
   	  	<li>
	   	  	<a href="@info.Url">
		   	  	<img src="${pageContext.request.contextPath}/upload/adv/${fla3.image}" width="236" height="236" />
		   	  	<em>${fla3.extfield1 }</em>
		   	  	<b>¥${fla3.extfield2 }<s>¥${fla4.extfield3 }</s></b>
	   	  	</a>
   	  	</li>
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
     <c:forEach items="${floor1AdvertList4 }" var="fla4">
   	  	<li>
	   	  	<a href="@info.Url">
		   	  	<img src="${pageContext.request.contextPath}/upload/adv/${fla4.image}" width="236" height="236" />
		   	  	<em>${fla4.extfield1 }</em><b>¥${fla4.extfield2 }<s>¥${fla4.extfield3 }</s></b>
	   	  	</a>
   	  	</li>
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
     <c:forEach items="${floor1AdvertList5 }" var="fla5">
   	  	<li>
	   	  	<a href="@info.Url">
		   	  	<img src="${pageContext.request.contextPath}/upload/adv/${fla5.image}" width="236" height="236" />
		   	  	<em>${fla5.extfield1 }</em><b>¥${fla5.extfield2 }<s>¥${fla5.extfield3 }</s></b>
	   	  	</a>
   	  	</li>
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
     <c:forEach items="${floor1AdvertList6 }" var="fla6">
   	  	<li>
	   	  	<a href="@info.Url">
		   	  	<img src="${pageContext.request.contextPath}/upload/adv/${fla6.image}" width="236" height="236" />
		   	  	<em>${fla6.extfield1 }</em><b>¥${fla6.extfield2 }<s>¥${fla6.extfield3 }</s></b>
	   	  	</a>
   	  	</li>
	 </c:forEach>
</ul>
</div>
</div>
<div class="clear"></div>
</div>
<script type="text/javascript">
    $(function(){
        $("#floor1 h2 ul li a").mouseover(function(){
            var aList = $("#floor1 h2 ul li a");
            var divList = $("#floor1 .floorR");
            var index = aList.index(this);

            aList.removeClass("hot");
            $(this).addClass("hot");

            divList.addClass("hide");
            divList.eq(index).removeClass("hide");
        })
    })
</script>

<!-- 2楼 -->
<div id="floor2" class="floor box">
<h2 class="floorT">
<b>2F</b>平板家电
<ul>
    <li><a href="javascript:void(0)" class="hot">平板</a></li>
    <li><a href="javascript:void(0)">电视</a></li>
    <li><a href="javascript:void(0)">冰箱</a></li>
    <li><a href="javascript:void(0)">厨房电器</a></li>
    <div class="clear"></div>
</ul>
<div class="floorBt"><a href="#">合约计划说明</a><a href="#">大家电配送</a></div>
<div class="clear"></div>
</h2>
<div class="floorL left">
<ul>
     <c:forEach items="${floor2AdvertList1 }" var="f2la1">
   	  	<li><a href="${f2la1.url }" class="hot">${f2la1.image}</a></li>
	 </c:forEach>
     <div class="clear"></div>
</ul>
	 <c:if test="${fn:length(floor2AdvertList2)>0}">
	 	<a href="${floor2AdvertList2[0].url }" class="floorAD">
   	  		<img src="${pageContext.request.contextPath}/upload/adv/${floor2AdvertList2[0].image}" width="202" height="155" />
   	  	</a> 
	 </c:if>
</div>
<div class="floorR right">
<div class="floorCon">
<ul>
     <c:forEach items="${floor2AdvertList3 }" var="f2la3">
   	  	<a href="${f2la2.url }" class="floorAD">
   	  		<li>
	   	  		<a href="@info.Url">
	   	  			<img src="${pageContext.request.contextPath}/upload/adv/${f2la3.image}" width="236" height="236" />
	   	  			<em>${f2la3.extfield1 }</em><b>¥${f2la3.extfield2 }<s>¥${f2la3.extfield3 }</s></b>
	   	  		</a>
   	  		</li>
   	  	</a> 
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
     <c:forEach items="${floor2AdvertList4 }" var="f2la4">
   	  	<a href="${f2la2.url }" class="floorAD">
   	  		<li>
	   	  		<a href="@info.Url">
	   	  			<img src="${pageContext.request.contextPath}/upload/adv/${f2la4.image}" width="236" height="236" />
	   	  			<em>${f2la4.extfield1 }</em><b>¥${f2la4.extfield2 }<s>¥${f2la4.extfield3 }</s></b>
	   	  		</a>
   	  		</li>
   	  	</a> 
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
    <c:forEach items="${floor2AdvertList5 }" var="f2la5">
   	  	<a href="${f2la2.url }" class="floorAD">
   	  		<li>
	   	  		<a href="@info.Url">
	   	  			<img src="${pageContext.request.contextPath}/upload/adv/${f2la5.image}" width="236" height="236" />
	   	  			<em>${f2la5.extfield1 }</em><b>¥${f2la5.extfield2 }<s>¥${f2la5.extfield3 }</s></b>
	   	  		</a>
   	  		</li>
   	  	</a> 
	 </c:forEach>
</ul>
</div>
</div>
<div class="floorR right hide">
<div class="floorCon">
<ul>
    <c:forEach items="${floor2AdvertList6 }" var="f2la6">
   	  	<a href="${f2la2.url }" class="floorAD">
   	  		<li>
	   	  		<a href="@info.Url">
	   	  			<img src="${pageContext.request.contextPath}/upload/adv/${f2la6.image}" width="236" height="236" />
	   	  			<em>${f2la6.extfield1 }</em><b>¥${f2la6.extfield2 }<s>¥${f2la6.extfield3 }</s></b>
	   	  		</a>
   	  		</li>
   	  	</a> 
	 </c:forEach>
</ul>
</div>
</div>
<div class="clear"></div>
</div>
<script type="text/javascript">
    $(function(){
        $("#floor2 h2 ul li a").mouseover(function(){
            var aList = $("#floor2 h2 ul li a");
            var divList = $("#floor2 .floorR");
            var index = aList.index(this);

            aList.removeClass("hot");
            $(this).addClass("hot");

            divList.addClass("hide");
            divList.eq(index).removeClass("hide");
        })
    })
</script>

<!-- 嵌入尾部页面开始 -->
<jsp:include page="../shared/_footer.jsp"/>

</body>
</html>