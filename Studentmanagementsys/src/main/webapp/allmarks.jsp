<%@page import="models.marks"%>
<%@page import="java.util.List"%>
<%@page import="dbconnection.studentdb"%>
<%@page import="services.marksservice"%>
<%@page import="models.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Marks</title>
</head>
<body>
<table border = 2 style="margin: 4% 26%; border-radius: 5px; padding: 2%">
       
       <h1 style="padding: 4% 25% 0% 38%"> Student Marks</h1>
       
    <thead>
    
        <tr>
            <th style="padding: 4px">Pinnumber</th>
            <th style="padding: 4px">CNS</th>
            <th style="padding: 4px">BDA</th>
            <th style="padding: 4px">ML</th>
            <th style="padding: 4px">ADS</th>
            <th style="padding: 4px">SWM</th>
            <th style="padding: 4px">IPR</th>
            <th style="padding: 4px">Actions</th>
        </tr>
    </thead>
    <tbody>
    <% 
    marksservice service = new marksservice(studentdb.conn());
    List<marks> list = service.getall();
    for(marks m : list){
    	
    %>
        <tr>
            <td style="padding: 4px"><%=m.getpinnumber() %></td>
            <td style="padding: 4px"><%=m.getcns()%></td>
            <td style="padding: 4px"><%=m.getbda() %></td>
            <td style="padding: 4px"><%=m.getml()%></td>
            <td style="padding: 4px"><%=m.getads()%></td>
            <td style="padding: 4px"><%=m.getswm()%></td>
            <td style="padding: 4px"><%=m.getipr()%></td>
            <td style="padding: 4px">
            <a href="updatemarks.jsp?pinnumber=<%=m.getpinnumber()%>"><button>Update</button></a>
            <a href="deletemar?pinnumber=<%=m.getpinnumber()%>"><button>Delete</button></a>
            </td>
        </tr>
        <%
    }
        %>
    </tbody>
</table>
</body>
</html>