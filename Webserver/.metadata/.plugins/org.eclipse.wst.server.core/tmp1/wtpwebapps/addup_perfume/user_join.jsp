<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
	String user_id = (String)session.getAttribute("uLogin");
	
	System.out.println("세션에 등록된 아이디 " +user_id);
	
	if(user_id != null) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Language" content="ko"
http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Addup 사용자 회원가입</title>
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
	position:relative;
	min-height:900px;
	padding-bottom:150px;
	*zoom: 1;
}
#container:after{
	content:'';
	display:block;
	clear:both;
}
#content{
	position:relative;
	width:1200px;
	height:900px;
	float:right;
}

#join{
	width:800px;
	margin:0px auto;
	height:800px;
	padding-top:40px;
}

#join table{
	width:100%;
	border-collapse:collapse;
	font-size:16px;
	line-height:70px;
	background:#f1f1f1;
}
#join table input{
	height:25px;
}
#join table th{
	border:#d3d3d3 solid 1px;
	width:200px;
	background:gray;
}
#join table td{
	border:#d3d3d3 solid 1px;
	padding-left:20px;
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

</style>
<script type="text/javascript">
	function joinCheck() {
		if(document.join_form.user_id.value.length == 0) {
			alert("아이디를 입력해주세요");
			join_form.user_id.focus();
			return false;
		}
		if(document.join_form.user_password.value.length == 0) {
			alert("비밀번호를 입력해주세요");
			join_form.user_password.focus();
			return false;
		}
		if(document.join_form.user_password_check.value.length == 0) {
			alert("비밀번호 확인을 입력해주세요.");
			join_form.user_password_check.focus();
			return false;
		}
		if(document.join_form.user_name.value.length == 0) {
			alert("이름을 입력하세요");
			join_form.user_name.focus();
			return false;
		}
		if(document.join_form.user_address.value.length == 0) {
			alert("주소를 입력해주세요");
			join_form.user_address.focus();
			return false;
		}
		if(document.join_form.user_phone.value.length == 0) {
			alert("전화번호를 입력해주세요");
			join_form.user_phone.focus();
			return false;
		}
		if(document.join_form.user_age.value.length == 0) {
			alert("나이를 입력해주세요");
			join_form.user_age.focus();
			return false;
		}
		return true;
	}
</script>
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
				<dd><a href="#">Man</a></dd>
				<dd><a href="#">Woman</a></dd>
				<dd><a href="#">Perfume</a></dd>
				<dd><a href="#">Eau de perfume</a></dd>
				<dd><a href="#">Eau de cologne</a></dd>
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
			<div id="join">
				<h2>회원가입</h2><br>
				<form name="join_form" method="post" action="UserJoinAction">
					<table border=0 width="680px">
						<tr>
							<th>아이디</th>
							<td><input type="text" name="user_id"></td>
						</tr>
						<tr>
							<th>비밀번호</th>
							<td><input type="password" name="user_password"></td>
						</tr>
						<tr>
							<th>비밀번호&nbsp;확인</th>
							<td><input type="password" name="user_password_check"></td>
						</tr>
						<tr>
							<th>이름</th>
							<td><input type="text" name="user_name"></td>
						</tr>
						<tr>
							<th>주소</th>
							<td><input type="text" name="user_address" style="width:500px"></td>
						</tr>
						<tr>
							<th>전화번호</th>
							<td><input type="text" name="user_phone"></td>
						</tr>
						<tr>
							<th>나이</th>
							<td>
								<input type="text" name="user_age">
							</td>
						</tr>
						<tr>
							<th>성별</th>
								<td>
									<select name="user_sex" style="width:100px; height:25px;">
										<option value="남자">남자</option>
										<option value="여자">여자</option>
									</select>
								</td>
						</tr>
					</table>
					<input type="submit" style="width:200px; height:40px; margin-top:20px; margin-left:200px" value="가입하기" onclick="return joinCheck()">
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