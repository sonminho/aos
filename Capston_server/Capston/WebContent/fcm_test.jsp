<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.jsp'/>
</c:if>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>WIMP 전송 페이지</title>
<style>
#transfer{
	width:800px;
	padding:50px;
}
</style>
</head>
<body>
<center>
<div class="wrapper">
	<div id="transfer">
	<h1>WIMP 메시지 전송하기</h1>
	<h3>
	안녕하세요 (${loginUser.userid })님
	</h3>
	<form name="frm" action="AndroidServlet?command=web_transfer_action" method="post">
		<select name="transfer_select" style="width:300px">
			<option value="where">스마트폰 위치</option>
			<option value="battery">배터리 잔여량</option>
			<option value="sound_on">무음 해제</option>
			<option value="camera_on">카메라 켜기</option>
		</select>
		<input type="submit" value="전송"/>
	</form><br>
	<form name="frm2" action="AndroidServlet?command=web_response_list" method="post">
		<input type="submit" value="조회 목록" style="width:360px"/>
	</form><br>
	<form name="frm3" action="AndroidServlet?command=web_logout_action" method="post">
		<input type="submit" value="로그아웃" style="width:360px"/>	
	</form>
	</div>
</div>
</center>
</body>
</html>