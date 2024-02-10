<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
    String id = request.getParameter("id");
String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("pass");
int id1 = Integer.parseInt(id);
   
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider", "root", "root");
 //Statement st = con.createStatement();
 
 PreparedStatement ps= con.prepareStatement("insert into student3(id,name,email,pass) values(?,?,?,?)");
 ps.setInt(1,id1);
 ps.setString(2, name);
 ps.setString(3,email);
 ps.setString(4,password);
 ps.execute();
 
 
 



%>
</body>
</html>