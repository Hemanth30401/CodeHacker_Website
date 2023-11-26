package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.AdminDao;

@WebServlet("/Adm1")
public class Admin extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("emailId");
		String password = req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			ResultSet rs = AdminDao.getAdminDao(email,password);
			if(rs.next())
			{
				res.sendRedirect("Candidate1");
			}
			else {
				out.println("Give Correct EmailId & Password");
				RequestDispatcher rd = req.getRequestDispatcher("Admin.html");
				rd.include(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
