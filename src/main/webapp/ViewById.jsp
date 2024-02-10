<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
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
String id = request.getParameter("id");
int id1 = Integer.parseInt(id);


Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user5", "root", "tiger");
//Statement st = con.createStatement();
PreparedStatement ps= con.prepareStatement("select * from student3 where id=?");
   ps.setInt(1,id1);
   
  ResultSet rs= ps.executeQuery();
  rs.next();
%>
<table>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>password</th>
        <tr>
             <td><%=rs.getInt(1)%></td>
              <td><%=rs.getString(2)%></td>
               <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
        
        </tr>
        
</table>
</body>
</html>