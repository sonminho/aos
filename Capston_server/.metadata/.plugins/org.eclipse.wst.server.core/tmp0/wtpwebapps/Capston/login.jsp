<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
.wrapper{
	width:1000px;
	margin:0px auto;
}

#login{
	padding:50px;
}

#login form{
	border-top: 1px solid #cccccc;
	padding:50px;
}
</style>

<script type="text/javascript">
	function loginCheck() {
		if(document.frm.id.value.length == 0) {
			alert("���̵� �Է����ּ���");
			frm.id.focus();
			return false;
		}
		if(document.frm.pw.value.length == 0) {
			alert("��й�ȣ�� �Է����ּ���");
			frm.pw.focus();
			return false;
		}
		
		return true;
	}
</script>
</head>
<body>
<center>
<div class="wrapper">
	<div id="login">
		<h2>WIMP �α���</h2><br><br>
		<form name="frm" action="AndroidServlet?command=web_login" method="post">
			���̵�&nbsp; &nbsp;&nbsp; &nbsp;<input type="text" name="id"><br><br>
			��й�ȣ&nbsp; &nbsp;<input type="password" name="pw"><br><br>
			<input type="submit" onclick="return loginCheck();"value="�α���" style="width:240px;">
		</form>
	</div>
</div>
</center>
</body>
</html>