package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.insertDao;

@WebServlet("/addCandid")
public class AddCandidateServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName=request.getParameter("userName");
		String mobile=request.getParameter("mobile");
		String password = request.getParameter("password");
		String location=request.getParameter("location");
		try {
			int rows = insertDao.getInsertData(userName, mobile, password, location);
			if(rows>0) {
				out.println("<body style='background-image:url(admin.jpg)'><center>"
						+ "<fieldset style='width:30%;text-align:center;background-color:white;position:relative; margin-top:200px;margin-left:50px';"
						+ "<h2>Inserted Successfully</h2><br><br>"
						+ "<a href='Candidate1'><button style='color:white;background-color:#1e90ff;'>Back</button></a>&nbsp;&nbsp;"
						+ "<a href='Admin.html'><button style='color:white;background-color:black'>Home</button></a>"
						+ "</fieldset>"
						+ "</center>"
						+ "</body>");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
