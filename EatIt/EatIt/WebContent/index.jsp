<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@ page import="dto.UserVO" %>
<%
	UserVO uVo = (UserVO)session.getAttribute("uLogin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eat it 맛과 즐거움</title>
<style>
	html, body{
		height:100%;
	}
	
	body > .main_div{
		height:auto;
		min-height:100%;
	}
	
	.main_div{
		width:1800px;
		height:100%;
		margin:0px auto;
	}
	
   .top_nav {
      width:400px;
      height:40px;
      float:right;
      text-align:center;
   }
   
   .main_search {
   	  clear:both;
   	  width:800px;
      margin:0px auto;
      margin-top:50px;
   }

   .main_search input{
      vertical-align:30px;
      height:24px;
   }
   
   .main_search select{
      vertical-align:28px;
      height:30px;
   }
   
   .search_img {
      width:200px;
   }
      
   #main_category{
      width:1800px;
      margin:0px auto;
      text-align:center;
   }
   
   .ad_img{
   	  padding:30px;
   	  width:1100px;
   	  margin:0px auto;
   	  
   }
   
   .ad_img img{
   		width:1150px;
   		height:580px;
   		margin:0 auto;
   }
   
   .content{
   		width:100%;
   		height:600px;
   		padding-bottom:50px;
   }
   
   .content fieldset{
   		margin-top:20px;
   		width:800px;
   		height:500px;
   		float:left;
   }
   
   .content img{
   		width:800px;
   		height:530px;
   		margin-left:120px
   }
   
   .footer{
   	   clear:both;
   	   width:1800px;
	   margin:0px auto;
	   height:70px;
	   padding:0;
	   text-align:center;
	   border-top:1px solid #cccccc;
	   font-size:0.9em;
	   color:#666;
	   *zom:1;
   }
   
   li{list-style:none;}
   
   a{color:#000; text-decoration:none;}
   
   #main_bar{
   		width:100%;
   		margin:0 auto;
   		padding-top:20px;
   }
  
   #main_bar:before, #main_after{
   		content:"";
   		display:block;
   }
   #main_bar:after{
   		clear:both;
   }
   nav {
   		font-size: 1rem;
   }
   nav > ul {
   		margin: 0;
   		padding: 0;
   		list-style: none;
   }
   nav li {
   		position:relative;
   		float:left;
   		width:450px;
   		height:38px;
   }
   ul{
   		margin: 0;
		padding: 0;
   }
   nav li a {
   		display: block;
   		width:100%;
   		line-height:38px;
   		text-align:center;
   		text-decoration:none;
   		background:black;
   		color:#fff;
   }
   nav li a:hover, nav li a.on{
   		background: gray;
   }
   nav ul ul {
   		display: none;
   		position: absolute;
   		top:38px;
   }
   nav ul ul li a {
	background: #fff;
	color: #555;
	border-top: 1px solid #eaeaea;
	}
	nav ul ul li:first-child a {
		border-top: none;
	}
	nav ul ul li a:hover, .nav ul ul li a.on {
		background: #eaeaea;
		color: #333;
	}
	
	.scale {
	  transform: scale(1);
	  -webkit-transform: scale(1);
	  -moz-transform: scale(1);
	  -ms-transform: scale(1);
	  -o-transform: scale(1);
	  transition: all 0.3s ease-in-out;   /* 부드러운 모션을 위해 추가*/
	}
	.scale:hover {
	  transform: scale(1.2);
	  -webkit-transform: scale(1.2);
	  -moz-transform: scale(1.2);
	  -ms-transform: scale(1.2);
	  -o-transform: scale(1.2);
	}
	.img {overflow:hidden }
	.scale img{
		width:800px;
   		height:530px;
   		margin:0 auto;
	}
</style>
<script src="http://code.jquery.com/jquery-3.1.1.js"></script>
<script>
$(function() {
	var gnbA = $('#main_category>li>a');
	var ul = $('#main_category>li>ul');
	gnbA.on("mouseenter focus", function(){
		if(gnbA.target){
			$(gnbA.target).next().hide();
			$(this).next().show();
		} else {
			$(this).next().show();
		}
		
		gnbA.target = this;
	});
	gnbA.mouseleave(function() {
		$(this).next().hide();
	});
	ul.hover(function(){
		$(this).show();
	}, function(){
		$(this).hide();
	});
});
</script>
<script>
	var index = 0;
	
	window.onload = function() {
		slideShow();
	}
	
	function slideShow() {
		var i;
		var x = document.getElementsByClassName("img_ad");
		
		for(i = 0; i<x.length; i++) {
			x[i].style.display = "none";	
		}
		
		index++;
		
		if(index > x.length) {
			index = 1;
		}
		
		x[index-1].style.display = "block";
		
		setTimeout(slideShow, 2000);
	}
</script>
</head>
<body>
<div class="main_div">
<table class="top_nav">
   <tr>
      <td><a href="login.jsp">
      <%
      		if((UserVO)session.getAttribute("uLogin") == null) {
      %>	로그인     
      <%	
      		} else {
      %>
      			<%= uVo.getUser_id() %>님 로그인
      <%
      		}
      %>
      </a></td>
      <td><a href="join_main.jsp"><%if((UserVO)session.getAttribute("uLogin") == null) {%>	회원가입   <%}%></a></td>
      <td><%if((UserVO)session.getAttribute("uLogin") != null) {%>마이페이지<%} %></td>
      <td><a href="ControllerServlet?command=cart_list"><%if((UserVO)session.getAttribute("uLogin") != null) {%>즐겨찾기<%} %></a></td>
      <td><a href="ControllerServlet?command=user_logout"><%if((UserVO)session.getAttribute("uLogin") != null) {%>로그아웃<%} %></a></td>
   </tr>
</table><br>
<form class="main_search">
   <a href="index.jsp"><img class="search_img" src="img/eat_it.jpg"></a>
   <select>
   		<option>지역 검색</option>
   		<option>종류 검색</option>
   		<option>테마 검색</option>
   </select>
   <input type="text" size="50">
   <input type="submit" value="검색" style="height:28px;">
</form>
<br>
<div id="main_bar">
	<nav>
	<ul id="main_category">
		<li class="m1"><a href="#">공지 사항</a>
		</li>
		<li class="m2"><a href="#">지역 검색</a>
			<ul>
				<li><a href="ControllerServlet?command=place_location&location=nowongu">노원구</a></li>
				<li><a href="#">광진구</a></li>
				<li><a href="#">강북구</a></li>
				<li><a href="#">영등포구</a></li>
				<li><a href="ControllerServlet?command=place_location&location=gangseogu">강서구</a></li>
				<li><a href="#">강남구</a></li>
				<li><a href="#">마포구</a></li>
			</ul>
		</li>
		<li class="m3"><a href="#">종류 검색</a>
			<ul>
				<li><a href="ControllerServlet?command=place_type&type=hansik">한식</a></li>
				<li><a href="ControllerServlet?command=place_type&type=ilsik">일식</a></li>
				<li><a href="ControllerServlet?command=place_type&type=joongsik">중식</a></li>
				<li><a href="ControllerServlet?command=place_type&type=yangsik">양식</a></li>
			</ul>
		</li>
		<li class="m4"><a href="#">테마 검색</a>
			<ul>
				<li><a href="ControllerServlet?command=place_tema&tema=date">데이트</a></li>
				<li><a href="ControllerServlet?command=place_tema&tema=family">가족</a></li>
				<li><a href="ControllerServlet?command=place_tema&tema=bussiness">비지니스</a></li>
				<li><a href="#">상견례</a></li>
			</ul>
		</li>
	</ul>
	</nav>
</div>
<br><br>
<br>
	<div class="ad_img">
		<img class="img_ad" src="img/img3.png"/>
		<img class="img_ad" src="img/img5.png"/>
		<img class="img_ad" src="img/img6.png"/>
	</div>
<br><br><br>
<div class="content">
<fieldset>
<legend>공지사항</legend>
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
<TBODY>
<TR vAlign=center align=left>
<TD><HEIGHT=30 width="12" border="0"></TD>
<TD width="100%">
<TD><HEIGHT=30 width="8" border="0"></TD></TR>
<TR vAlign=top>
<TD>&nbsp;</TD>
<TD>
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
<TBODY>
<TR>
<TD bgColor=#ffffff>
<MARQUEE onmouseover=this.stop() style="WIDTH: 100%; HEIGHT: 100px" onmouseout=this.start() scrollAmount=1 direction=up>
<DIV style="PADDING-RIGHT: 0px; OVERFLOW-Y: auto; PADDING-LEFT: 0px; OVERFLOW-X: hidden; PADDING-BOTTOM: 3px; WIDTH: 100%; PADDING-TOP: 3px">
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
<TBODY>
<TR>
<TD vAlign=top width="100%">
<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
<TBODY>
<TR>
<TD height=20>&nbsp;<SPAN class=board style="FONT-SIZE: 14pt">공릉동 조마루 감자탕 오픈 예정</SPAN></TD></TR>
<TR>
<TD height=20>&nbsp;<SPAN class=board style="FONT-SIZE: 14pt">족발야시장 이번달 맛집 선정</SPAN></TD></TR>
<TR>
<TD height=20>&nbsp;<SPAN class=board style="FONT-SIZE: 14pt">공지사항3</SPAN></TD></TR>
<TR>
<TD height=20>&nbsp;<SPAN class=board style="FONT-SIZE: 14pt">공지사항4</SPAN></TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></DIV></MARQUEE></TD></TR></TBODY></TABLE></TD>
<TD>&nbsp;</TD></TR></TBODY></TABLE>
</fieldset><br>
<div class="img">
<div class="scale">
	<img src="img/seoul.png" usemap="#seoul_main" >

<map id="seoul_main" name="seoul_main">
<area shape="circle" alt="강서구" title="" coords="142,260,24" href="ControllerServlet?command=place_location&location=gangseogu" target="_self" />
<area shape="circle" alt="은평구" title="" coords="319,152,21" href="http://localhost:8080/jQuery/detail_page.html" target="_self" />
<area shape="circle" alt="강남구" title="" coords="525,383,25" href="http://localhost:8080/jQuery/detail_page.html" target="_self" />
<area shape="circle" alt="동작구" title="" coords="352,370,18" href="http://localhost:8080/jQuery/detail_page.html" target="_self" />
<area shape="circle" alt="노원구" title="" coords="554,126,24" href="ControllerServlet?command=place_location&location=nowongu" target="_self" />
</map>
</div></div>
</div> <!-- content -->
</div> <!-- main_div -->

<div class="footer">
<br>
@Copyright Son, Oh, Lee 
<br>
Advanced Web Programming Team7
</div>

</body>
</html>