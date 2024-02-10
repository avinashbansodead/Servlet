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
int a=10;
System.out.println("hello");
System.out.println(a);
m1();
%>
<%!
public void m1()
{
	System.out.println("hii");
	System.out.println("byee");
}
%>

</body>
</html>