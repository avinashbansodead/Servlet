<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page errorPage="ErrorMsg.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String choice=request.getParameter("operation");
String num1=request.getParameter("num1");
String num2=request.getParameter("num2");
int a=Integer.parseInt(num1);
int b=Integer.parseInt(num2);
if(choice.equals("addition"))
{
	out.println(a+b);
	
}
else if(choice.equals("subtraction"))
{
	out.println(a-b);
}
else if(choice.equals("multiplication"))
{
	out.println(a*b);
	
}
else if(choice.equals("division"))
{
	out.println(a/b);
}



%>

</body>
</html>