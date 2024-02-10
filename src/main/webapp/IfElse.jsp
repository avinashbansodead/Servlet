<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");
if(email.equals("abcd@gmail.com")&& password.equals("1234"))
{
%>
<h1>Wlcome</h1>
<%
}
else
{
%>
<h1>Invalid</h1>
<%
}
%>
</body>
</html>