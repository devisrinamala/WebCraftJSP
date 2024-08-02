<%@page import="models.student"%>
<%@page import="java.util.List"%>
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

<table border = 2 style="margin: 4% 26%; border-radius: 5px; padding: 2%">
       
       <h1 style="padding: 4% 25% 0% 38%"> Registerd Students</h1>
       
    <thead>
    
        <tr>
            <th style="padding: 4px">Pinnumber</th>
            <th style="padding: 4px">Name</th>
            <th style="padding: 4px">Email</th>
            <th style="padding: 4px">Branch</th>
            <th style="padding: 4px">Actions</th>
        </tr>
    </thead>
    <tbody>
    <% 
     studentservice service = new studentservice(studentdb.conn());
    List<student> list = service.getall();
    for(student s : list){
    	
    
    %>
        <tr>
            <td style="padding: 4px"><%=s.getpinnumber() %></td>
            <td style="padding: 4px"><%=s.getname() %></td>
            <td style="padding: 4px"><%=s.getemail() %></td>
            <td style="padding: 4px"><%=s.getbranch() %></td>
            <td style="padding: 4px">
            <a href="updatestudent.jsp?pinnumber=<%=s.getpinnumber()%>"><button>Update</button></a>
            <a href="deletestu?pinnumber=<%=s.getpinnumber()%>"><button>Delete</button></a>
            </td>
        </tr>
        <%
    }
        %>
    </tbody>
</table>
</body>
</html>