<%@page import="java.nio.charset.Charset"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="atest.AuserDAO"%>
<%@ page import="atest.Ausers"%>
<%@ page import="java.io.PrintWriter"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<script src="./jquery-3.4.1.min.js"></script>
<script src="./login.js"></script>
</head>

<body>
 
  <h2>Login</h2>

  <form id="frmLogin" name="frmLogin" action="login.jsp" method="post"><br/>
	
	<input type="text" id="id" name="id" placeholder="아이디" /><br/>

  	<input type="password" id="pw" name="pw" placeholder="패스워드" /><br/>

  
   <input type="button" id="btnLogin" value="로그인"  />

 
  </form>

  <div id="msg"></div>

</body>
<body>


</body>
</html>