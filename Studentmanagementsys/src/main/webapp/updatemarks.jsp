<%@page import="models.marks"%>
<%@page import="models.student"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="services.marksservice"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Marks</title>
</head>
<body>
<%
String pinnumber = request.getParameter("pinnumber");
marksservice service = new marksservice(studentdb.conn());
marks m = service.getbypin(pinnumber);
%>

<form action="updatemar" method="post" style="margin: 8% 38%; border: solid; border-radius: 4%; padding: 4%">

<h1 style="padding: 5%">Update data</h1>

    <input type="text" placeholder="ENTER CNS MARKS" name="cns" value="<%=m.getcns()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER BDA MARKS" name="bda" value="<%=m.getbda()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER ML MARKS" name="ml" value="<%=m.getml()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER ADS MARKS" name="ads" value="<%=m.getads()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER SWM MARKS" name="swm" value="<%=m.getswm()%>" style="padding: 4% 8%"><br>
    
    <br><input type="text" placeholder="ENTER IPR MARKS" name="ipr" value="<%=m.getipr()%>" style="padding: 4% 8%"><br>
    
    <br><input type="hidden" placeholder="ENTER YOUR PINNUMBER" name="pinnumber" value="<%=m.getpinnumber()%>" style="padding: 4% 8%"><br>
    
    <br><button style="margin: 0% 29%; padding: 2% 4%">Update</button>
</form>
</body>
</html>