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
<title>Insert title here</title>
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
	<h1>FCM �޽��� �����ϱ�</h1>
	<h3>
	�ȳ��ϼ��� (${loginUser.userid })��
	</h3>
	<form name="frm" action="AndroidServlet?command=web_transfer_action" method="post">
		<textarea rows="20" cols="50">
		
		</textarea><br><br>
		<select name="transfer_select" style="width:300px">
			<option value="where">����Ʈ�� ��ġ</option>
			<option value="battery">���͸� �ܿ���</option>
			<option value="sound_on">���� ����</option>
			<option value="camera_on">ī�޶� �ѱ�</option>
		</select>
		<input type="submit" value="����"/>
	</form><br>
	<form name="frm2" action="AndroidServlet?command=web_logout_action" method="post">
		<input type="submit" value="�α׾ƿ�" style="width:360px"/>	
	</form>
	</div>
</div>
</center>
</body>
</html>