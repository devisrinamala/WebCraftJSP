package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.studentdb;
import models.student;
import services.studentservice;

@WebServlet("/addstudent")
public class studentservlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pinnumber = req.getParameter("pinnumber");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String branch = req.getParameter("branch");
		
		student s = new student(pinnumber,name,email,branch);
		studentservice service = new studentservice(studentdb.conn());
		boolean f = service.addstudent(s);
		if(f) {
			
			resp.sendRedirect("home.jsp");
		}
		else {
			resp.sendRedirect("addstudent.jsp");
		}
	}
}
