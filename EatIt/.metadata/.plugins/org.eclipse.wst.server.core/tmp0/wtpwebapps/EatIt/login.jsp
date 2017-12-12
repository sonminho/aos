<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.UserDAO, dto.UserVO, java.util.*" %>
<%
	UserVO uVo = (UserVO)session.getAttribute("uLogin");
	
	// �α��� �Ϸ� ������ ����ڴ� ������������ �̵�
	if(uVo != null) {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eat it ���� ��ſ�</title>
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
   
   #container {
      width:100%;
      min-height:1400px;
      margin-top:30px;
      padding-bottom:30px;
   }
   
   #side_bar{
   	  display:block;
   	  width:390px;
   	  padding:40px;
   	  padding-top:80px;
   	  height:1020px;
   	  font-family:"Open Sans", sans-serif
   	  font-size: 1em;
   	  background: #f1f1f1;
   	  margin:0px auto;
   	  float:left;
   }
   
   #side_bar nav {
   	  font-size:0.875;
   }
   
   #side_bar nav ul {
   	  margin:0;
   	  padding:0;
   	  width:380px;
   	  list-style:none;
   	  text-indent:10px;
   }
   
   .menu {
   	  margin-bottom:3px;
   }
   
   .menu .main{
   	  display:block;
   	  height:70px;
   	  line-height:70px;
   	  text-indent:20px;
   	  text-decoration:none;
   	  background:gray;
   	  color:#fff;
   	  cursor: pointer;
   }
   
   .menu .main.on {
      background:red;
   }
   
   .menu .sub {
   	  display:none;
   }
   
   .menu .sub li {
   	  height:80px;
   	  line-height:80px;
   	  background:#fff;
   	  border-top:1px solid #eaeaea;
   }
   
   .menu .sub li:first-child{
   	  border-top:none;
   }
   
   .menu .sub li a {
   	  display:block;
   	  width:100%;
   	  height:100%;
   	  text-decoration: none;
   	  text-indent:20px;
   	  color:#555;
   }
   
   .menu .sub li a:hover{
   	  background:#eaeaea;
   	  color:#333;
   }
   
   #content{
   	  display:block;
   	  width:1300px;
   	  float:right;
   }
   
   #content:after{
      clear:both;
   }
   
   .footer{
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
   		margin:0px auto;
   		padding-top:20px;
   }
  
   #main_bar:before, #main_after{
   		content:"";
   		display:block;
   }
   #main_bar:after{
   		clear:both;
   }
   
   #main_bar nav {
   		font-size: 1rem;
   }
   
   #main_bar nav > ul {
   		margin: 0;
   		padding: 0;
   		list-style: none;
   }
   
   #main_bar nav li {
   		position:relative;
   		float:left;
   		width:450px;
   		height:38px;
   }
   
   #main_bar ul{
   		margin: 0;
		padding: 0;
   }
   
   #main_bar nav li a {
   		display: block;
   		width:100%;
   		line-height:38px;
   		text-align:center;
   		text-decoration:none;
   		background:black;
   		color:#fff;
   }
   
   #main_bar nav li a:hover, nav li a.on{
   		background: gray;
   }
   
   #main_bar nav ul ul {
   		display: none;
   		position: absolute;
   		top:38px;
   }
   
   #main_bar nav ul ul li a {
		background: #fff;
		color: #555;
		border-top: 1px solid #eaeaea;
	}
	
	#main_bar nav ul ul li:first-child a {
		border-top: none;
	}
	
	#main_bar nav ul ul li a:hover, .nav ul ul li a.on {
		background: #eaeaea;
		color: #333;
	}
	
	#content ul{
		padding:40px 50px;
		background: gray;
	}
	
	#content table{
		width:800px;
		height:300px;
		margin:0px auto;
		background:#f1f1f1;
		border:0;
		margin-top:100px;
	}
	#content table tr{
		height:50px;
	}
	#detail{
		background:#f1f1f1;
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
<script>
	$(function(){
		$(".sub").hide();
		
		$(".main").on("click", function(){
			if($(this).hasClass("on") == false) {
				$(".main").removeClass("on");
				$(this).addClass("on");
				$(".sub").slideUp("fast");
				$(this).next().slideDown("fast");
			} else {
				$(this).removeClass("on");
				$(this).next().slideUp("fast");
			}
		});
	});
</script>

</head>
<body>
<div class="main_div">
<table class="top_nav">
   <tr>
      <td><a href="login.jsp">�α���</a></td>
      <td><a href="join_main.jsp">ȸ������</a></td>
      <td>����������</td>
      <td>���ã��</td>
      <td><a href="ControllerServlet?command=user_logout">�α׾ƿ�</a></td>
   </tr>
</table><br>
<form class="main_search">
   <a href="index.jsp"><img class="search_img" src="img/eat_it.jpg"></a>
   <select>
   		<option>���� �˻�</option>
   		<option>���� �˻�</option>
   		<option>�׸� �˻�</option>
   </select>
   <input type="text" size="50">
   <input type="submit" value="�˻�" style="height:28px;">
</form>
<br>
<div id="main_bar">
	<nav>
	<ul id="main_category">
		<li class="m1"><a href="#">���� ����</a>
		</li>
		<li class="m2"><a href="#">���� �˻�</a>
			<ul>
				<li><a href="ControllerServlet?command=place_location&location=nowongu">�����</a></li>
				<li><a href="#">������</a></li>
				<li><a href="#">���ϱ�</a></li>
				<li><a href="#">��������</a></li>
				<li><a href="ControllerServlet?command=place_location&location=gangseogu">������</a></li>
				<li><a href="#">������</a></li>
				<li><a href="#">������</a></li>
			</ul>
		</li>
		<li class="m3"><a href="#">���� �˻�</a>
			<ul>
				<li><a href="ControllerServlet?command=place_type&type=hansik">�ѽ�</a></li>
				<li><a href="ControllerServlet?command=place_type&type=ilsik">�Ͻ�</a></li>
				<li><a href="ControllerServlet?command=place_type&type=joongsik">�߽�</a></li>
				<li><a href="ControllerServlet?command=place_type&type=yangsik">���</a></li>
			</ul>
		</li>
		<li class="m4"><a href="#">�׸� �˻�</a>
			<ul>
				<li><a href="ControllerServlet?command=place_tema&tema=date">����Ʈ</a></li>
				<li><a href="ControllerServlet?command=place_tema&tema=family">����</a></li>
				<li><a href="ControllerServlet?command=place_tema&tema=bussiness">�����Ͻ�</a></li>
				<li><a href="#">��߷�</a></li>
			</ul>
		</li>
	</ul>
	</nav>
</div>
<br><br>
<br>
<div id="container">
	<div id="side_bar">
		<nav>
			<ul>
				<li class="menu"><a class="main" href="#">���� ����</a>
				</li>
				<li class="menu"><a class="main" href="#">���� �˻�</a>
					<ul class="sub">
						<li><a href="ControllerServlet?command=place_location&location=nowongu">�����</a></li>
						<li><a href="#">������</a></li>
						<li><a href="#">���ϱ�</a></li>
						<li><a href="#">��������</a></li>
						<li><a href="ControllerServlet?command=place_location&location=gangseogu">������</a></li>
						<li><a href="#">������</a></li>
						<li><a href="#">������</a></li>
					</ul>
				</li>
				<li class="menu"><a class="main" href="#">���� �˻�</a>
					<ul class="sub">
						<li><a href="ControllerServlet?command=place_type&type=hansik">�ѽ�</a></li>
						<li><a href="ControllerServlet?command=place_type&type=ilsik">�Ͻ�</a></li>
						<li><a href="ControllerServlet?command=place_type&type=joongsik">�߽�</a></li>
						<li><a href="ControllerServlet?command=place_type&type=yangsik">���</a></li>
					</ul>
				</li>
				<li class="menu"><a class="main" href="#">�׸� �˻�</a>
					<ul class="sub">
						<li><a href="ControllerServlet?command=place_tema&tema=date">����Ʈ</a></li>
						<li><a href="ControllerServlet?command=place_tema&tema=family">����</a></li>
						<li><a href="ControllerServlet?command=place_tema&tema=bussiness">�����Ͻ�</a></li>
						<li><a href="#">��߷�</a></li>
					</ul>
				</li>
			</ul>
	</nav>
	</div> <!-- side bar -->
	<div id="content">
		<ul>
			<li>�α���</li>
		</ul>
		<div id="content_list">
			<form method="post" action="ControllerServlet?command=user_login">
			<table>
				<tr>
					<th style="width:400px;">��&nbsp;��&nbsp;��</th><td><input name="user_id" type="text" style="width:200px; hiehgt:20px"></td>
				</tr>
				<tr>
					<th style="width:400px;">��&nbsp;��&nbsp;��&nbsp;ȣ</th><td><input name="user_password" type="password" style="width:200px; hiehgt:20px"></td>
				</tr>
				<tr>
					<td style="padding-left:150px;"><input type="submit" style="width:200px;" value="�α���"></td>
					<td><input type="button" style="width:200px;" value="ȸ������" onclick="location.href='join_main.jsp'"></td>  
				</tr>
			</table>
			</form>
		</div>
	</div>
</div><!-- container -->
</div> <!-- main_div -->

<div class="footer">
<br>
@Copyright Son, Oh, Lee 
<br>
Advanced Web Programming Team7
</div>
</body>
</html>