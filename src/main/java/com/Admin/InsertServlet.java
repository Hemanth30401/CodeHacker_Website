package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<body style='background-image:url(admin.jpg);'>"
				+ "<center>"
				+ "<fieldset style='width=30%;position:relative;margin-top:200px;margin-left:50px;margin-right:50px;'>"
				+ "<h2>Adding the Candidate:</h2><br>"
				+ "<form action='addCandid' method='post'>"
				+ "<table style='font-style:20px'>"
				+ "<tr>"
				+ "<td>Username:</td>"
				+ "<td><input type='text' name='userName'></td>"
				+ "</tr>"
				+ "<td>Mobile:</td>"
				+ "<td><input type='text' name='mobile'></td>"
				+ "</tr>"
				+ "<td>Password:</td>"
				+ "<td><input type='text' name='password'></td>"
				+ "</tr>"
				+"<td>Location:</td>"
				+ "<td><input type='text' name='location'></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td><input type='submit' style=color:white;background-color:#1e90ff;margin-top:10px;font-size:17px value='Insert'></td>"
				+ "<td><input type='reset' style=color:white;background-color:black;margin-left:10px;margin-top:10px;font-size:17px value='Cancel'></td>"
				+ "</tr><table>"
				+ "</form>"
				+ "</fieldset>"
				+ "</center>"
				+ "</body>");
	}
	
}
