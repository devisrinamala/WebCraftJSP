package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnection.studentdb;
import services.studentservice;
@WebServlet("/deletestu")
public class deletestudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String pinnumber = req.getParameter("pinnumber");
		
		studentservice service = new studentservice(studentdb.conn());
		boolean f = service.deletestu(pinnumber);
		if(f) {
			resp.sendRedirect("allstudent.jsp");
		}
		else {
			resp.sendRedirect("error.jsp");
		}
	}
}
