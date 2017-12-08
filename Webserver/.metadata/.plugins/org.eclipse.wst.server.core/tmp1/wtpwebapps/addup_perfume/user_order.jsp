<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*, dto.UserVO, dto.ProductVO" %>    
<%
	String user_id = (String)session.getAttribute("uLogin");
	
	System.out.println("세션에 등록된 아이디 " + user_id);
	
	if(user_id == null) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/user_login.jsp");
		dispatcher.forward(request, response);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Addup 향수</title>
<style>
html, body{
	width:100%;
	height:100%;
}
#wrap{
	width:1400px;
	height:100%;
	margin:0px auto;
}
body > #wrap{
	height:auto;
	min-height:100%;
}
#header{
	position:relative;
	padding-bottom:70px;
	border-bottom:1px solid #cccccc;
}
.logo{
	padding: 32px 0 12px 40px;
}
.logo img{
	margin-top:30px;
}
.topnav{
	position:absolute;
	right:30px;
	top:2px;
}
.topnav dd{
	float:left;
	font-size:12px;
	padding-right:11px;
	margin-right:10px;
}
.topnav dd a{
	color:black;
	font-size:1.1em;
	text-decoration:none;
}
.topnav dd a:hover{
	color:gray;
	text-decoration:underline;
}
#mainnav{
	display:block;
	padding-top:30px;
	padding-left:50px;
	width:200px;
	float:left;
}
#mainnav dl{
	display:block;
	font:'Nanum Gothic', sans-serif;
	margin-top:10px;
	margin-bottom:36px;
}
#mainnav dt{
	color:black;
	font-weight:bold;
	font-size:16px;
}
#mainnav dt a{
	color:black;
	text-decoration:none;
}
#mainnav dt a:hover{
	color:gray;
	text-decoration:line-through;
}
#mainnav dd{
	display:block;
	margin-top:15px;
}
#mainnav dd a{
	color:black;
	font-size:0.9em;
	text-decoration:none;
}
#mainnav dd a:hover{
	color:gray;
	text-decoration:underline;
}
#container{
	width:100%;
	position:relative;
	padding-bottom:140px;
	height:1100px;
	*zoom: 1;
	
}
#container:after{
	content:'';
	display:block;
	clear:both;
}
#content{
	display:block;
	position:absolute;
	float:right;
	left:150px;
	padding:30px;
}
#footer{
	position:relative;
	margin-top:-101px;
	background-color:#fff;
}
#footer .footerArea{
	border-top: 1px solid #cccccc;
	padding: 0;
	width: 1400px;
	height: 100px;
	margin: 0 auto;	
	color: #666;
	font-size: 0.9em;
	*zoom: 1;
}
#footer .footerArea:after{
	content: '';
	display: block;
	clear: both;	
}
#footer .copy{
	margin-left:38%;
	font-family: 'Nanum Gothic', sans-serif;
}
#content{
	padding:20px 90px;
	floate:right;
	width:1150px;
}
#content ul{
	padding:30px 50px;
	background: #f1f1f1;
	list-style:none;
}
#order{
	width:1150px;
	height:900px;
	text-align:center;
	margin-top:60px;
}
#order_table{
	width:1000px;
	border-collapse:collapse;
	font-size:16px;
	height:500px;
	font:'Nanum Gothic', sans-serif;
	margin:0px auto;
	background:#f1f1f1;
}
#order_table th{
	border:#d3d3d3 solid 1px;
	background:gray;
}
#order_table td{
	border:#d3d3d3 solid 1px;
	padding-left:20px;
}
</style>
</head>
<body>
<div id="wrap">
	<div id="header">
		<h1 class="logo"><a href="index.jsp"><img src="img/logo.png"/></a></h1>	
		<dl class="topnav">
			<dd><a href="user_login.jsp">login</a></dd>
			<dd><a href="ControllerServlet?command=logout">log out</a></dd>
			<dd><a href="#">my page</a></dd>
			<dd><a href="#">cart</a></dd>
			<dd><a href="#">order</a></dd>
			<dd><a href="manager_login.jsp">manager</a></dd>
		</dl>
	</div> <!-- header -->
	
	<div id="container">
		<div id="mainnav">
			<dl class="category_about_us">
				<dt><a href="#">about us</a></dt>
			</dl>
			<dl class="category_shop">
				<dt><a href="#">shop</a></dt>
				<dd><a href="ControllerServlet?command=product_list&category=man">Man</a></dd>
				<dd><a href="ControllerServlet?command=product_list&category=woman">Woman</a></dd>
				<dd><a href="ControllerServlet?command=product_list2&category=perfume">Perfume</a></dd>
				<dd><a href="ControllerServlet?command=product_list2&category=eaudeperfume">Eau de perfume</a></dd>
				<dd><a href="ControllerServlet?command=product_list2&category=eaudecologne">Eau de cologne</a></dd>
				<dd><a href="#">Recommend</a></dd>
			</dl>
			<dl class="category_community">
				<dt><a href="#">community</a></dt>
			</dl>
			<dl class="category_qna">
				<dt><a href="#">Q & A</a></dt>
			</dl>
		</div> <!-- mainnav -->
		<div id="content">
			<ul>
				<li>주문서 작성</li>
			</ul>
			<div id="order">
					<%
						UserVO uVo = (UserVO)request.getAttribute("user");	
						ProductVO pVo = (ProductVO)request.getAttribute("product");
					%>
				<form name="join_form" method="post" action="UserOrderAction2?product_number=<%= pVo.getProductNumber() %>">
					
					<table id="order_table">
						<tr>
							<th style="width:150px;">상품&nbsp;번호</th><td style="width:600px;"><%= pVo.getProductNumber() %></td>
						</tr>
						<tr>
							<th>상품명</th><td><%= pVo.getProductName() %></td>
						</tr>
						<tr>
							<th>상품&nbsp;가격</th><td><%= pVo.getProductPrice() %></td>
						</tr>
						<tr>
							<th>주문자</th><td><%= uVo.getUser_name() %></td>
						</tr>
						<tr>
							<th>주문자 배송지</th><td><input name="new_address" type="text" style="width:640px; height:40px; font-size:20px"></td>
						</tr>
					</table>
					<input type="submit" style="width:200px; height:40px; margin-top:50px; margin-left:60px" value="주문하기">
					<input type="reset" style="width:200px; height:40px; margin-left:40px" value="다시 작성">
				</form>
			</div>
		</div>
	</div> <!-- container -->
</div> <!-- wrap -->

<div id="footer">
	<div class="footerArea">
		<p class="copy">
			&copy; Copyright WebServer Programming Project <br>
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Team 8 Sonminho, Leewujin <br>
			&nbsp; &nbsp; &nbsp; &nbsp;Contact us smin2846@gmail.com
		</p>
	</div>
</div>
</body>
</html>