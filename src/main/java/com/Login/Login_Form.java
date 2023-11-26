package com.Login;

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

import daoPackage.Login_Dao;

@WebServlet("/Login")
public class Login_Form extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			ResultSet rs = Login_Dao.getDao(userName, password);
			if(rs.next())
			{
				res.sendRedirect("Candidate_Life.html");
			}
			else
			{
				out.println("Incorrect Username & Password");
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.include(req, res);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
