package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.CandidateDisplayDao;
@WebServlet("/Candidate1")
public class CandidateDisplay extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			ResultSet rs = CandidateDisplayDao.getDao();
			out.println("<body style='background-image:url(admin.jpg);'>"
					+ "<h1 align='center' style='color:brown'>CANDIDATES INFORMATION</h1>"
					+ "<br>"
					+ "<TABLE ALIGN='CENTER' border style='border-collapse:collapse;width:100%;height:50%;font-size:20px'>"
					+ "<TR><TH>Username</TH>"
					+ "<TH>Mobile</TH>"
					+ "<TH>Password</TH>"
					+ "<TH>Location</TH>"
					+ "<TH>Edit</TH>"
					+ "<TH>Delete</TH></TR>");
			while(rs.next())
			{
				out.println("<TR align='center'>"
						+ "<TD>"+rs.getString(1) + "</TD>"
						+ "<TD>"+rs.getString(2) + "</TD>"
						+ "<TD>"+rs.getString(3) + "</TD>"
						+ "<TD>"+rs.getString(4) + "</TD>"
						+"<TD><a href='EditServlet.jsp?mobile="+rs.getString(2)+"'>Edit</a></TD>"
						+ "<TD><a href='DeleteServlet.jsp?mobile="+rs.getString(2)+"'>Delete</a></TD>"
						+ "</TR>");
				
			}
			out.println("</TABLE><br>"
					+ "<a href='insert'><button style='background-color:#6A5ACD;color:white;margin-left:85px;font-size:17px'>Add Candidate</button></a>");
			out.println("</body>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
