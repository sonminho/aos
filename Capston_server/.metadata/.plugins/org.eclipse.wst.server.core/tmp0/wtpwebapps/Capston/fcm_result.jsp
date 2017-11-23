<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.jsp'/>
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WIMP 조회 목록</title>
<style>
body{
	margin:0px;
}
#wrapper{
	width: 100%;
	overflow: hidden;
}
#tb{
	width: 70%;
}
table{
	border-collapse: collapse; /* 테이블 경계선 제거 */
}
tr{
	min-height: 100px;
}
td{
	font-size: 9pt;
	min-width: 200px;

	text-align:center;
}
*{
	color:#333333;
	font-size: 9pt;
}
th{
	background-color: #55CC55;
}

</style>
</head>
<body>
<center>
<div id="wrapper">
	<div id="tb">
	<table border="1px solid #cccccc">
		<h2>(${loginUser.userid })의 조회 목록</h2>
		<thead>
			<th>응답 요청 날짜</th>
			<th>메세지 내용</th>
		</thead>
		<tbody>
		<c:forEach var="data" items="${dataList }">
			<tr>
				<td>
					${data.rDate }
				</td>
				<td>
					${data.rMsg }
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</div>
</center>

</body>
</html>