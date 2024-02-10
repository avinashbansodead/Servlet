<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
String id=request.getParameter("id");
String name=request.getParameter("name");
String age=request.getParameter("age");
int id1=Integer.parseInt(id);
int age1=Integer.parseInt(age);
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
PreparedStatement ps=con.prepareStatement("insert into studen(id,name,age) values (?,?,?)");
ps.setInt(1, id1);
ps.setString(2, name);
ps.setInt(3, age1);
ps.execute();
System.out.println("Table created");

%>

</body>
</html>