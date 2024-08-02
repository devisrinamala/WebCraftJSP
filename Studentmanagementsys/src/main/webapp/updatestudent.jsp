<%@page import="models.student"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="services.studentservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
  String pinnumber = request.getParameter("pinnumber");
  studentservice service = new studentservice(studentdb.conn());
  student s = service.getbypin(pinnumber);
  
  %>
  
  <form action="updatestu" method="post" style="margin: 8% 38%; border: solid; border-radius: 4%; padding: 4%">
  
  <h1 style="padding: 5%">Update data</h1>
  
    <input type="text" placeholder="ENTER YOUR NAME" name="name" value="<%=s.getname()%>" style="padding: 4% 8%"><br>
    
    <br><input type="email" placeholder="ENTER YOUR EMAIL" name="email" value="<%=s.getemail()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER YOUR BRANCH" name="branch" value="<%=s.getbranch()%>" style="padding: 4% 8%"><br>
    
    <br><input type="hidden" placeholder="ENTER YOUR PINNUMBER" name="pinnumber" value="<%=s.getpinnumber()%>" style="padding: 4% 8%"><br>
    
    <button style="margin: 0% 29%; padding: 2% 4%">Update</button>
</form>
</body>
</html>