<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
        
    <title>SIGN-UP Eat It</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- font awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css" media="screen" title="no title" charset="utf-8">
    <!-- Custom style -->
    <link rel="stylesheet" href="css/style.css" media="screen" title="no title" charset="utf-8">

  </head>
  <body>
	<form name="join_form" action="UserJoinAction" method="post">
      <article class="container">
        <div class="page-header">
          <h1>ȸ������ <small>Sign up for 'EAT IT!'</small></h1>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="form-group">
              <label for="InputId">���̵�</label>
              <input type="text" name="user_id" class="form-control" id="Id" placeholder="���̵�">
            </div>
			
            <div class="form-group">
              <label for="InputPassword1">��й�ȣ</label>
              <input type="password" name="user_password" class="form-control" id="Password" placeholder="��й�ȣ">
            </div>
			
            <div class="form-group">
              <label for="InputPassword2">��й�ȣ Ȯ��</label>
              <input type="password" name="user_password_check" class="form-control" id="Password2" placeholder="��й�ȣ Ȯ��">
              <p class="help-block">��й�ȣ Ȯ���� ���� �ٽ� �ѹ� �Է� �� �ּ���</p>
            </div>
            
            <div class="form-group">
              <label for="username">�̸�</label>
              <input type="text" name="user_name" class="form-control" id="Name" placeholder="�̸��� �Է��� �ּ���">
            </div>
                     
			<div class="form-group">
              <label for="InputEmail">��ȭ ��ȣ</label>
              <input type="text" name="user_phone"class="form-control" id="PhoneNum" placeholder="��ȭ ��ȣ�� �Է��� �ּ���">
              
            </div>

            <div class="form-group">
              <label for="InputEmail">�̸��� �ּ�</label>
              <input type="email" name="user_email" class="form-control" id="Email" placeholder="�̸��� �ּҸ� �Է��� �ּ���">
            </div>
			
            <div class="form-group text-center">
              <button type="submit" class="btn btn-info" onclick="RegisterUser()">ȸ������<i class="fa fa-check spaceLeft"></i></button>
              <button type="submit" class="btn btn-warning">�������<i class="fa fa-times spaceLeft"></i></button>
            </div>
        </div>

      </article>
	</form>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
  
<div class="footer">
<br>
@Copyright Son, Oh, Lee 
<br>
Advanced Web Programming Team7
</div>
</html>

