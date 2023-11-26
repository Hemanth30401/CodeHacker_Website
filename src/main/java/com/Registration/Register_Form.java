package com.Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daoPackage.Reg_Dao;

@WebServlet("/Reg")
public class Register_Form extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Reg_Bean dto = new Reg_Bean();
		String userName = req.getParameter("userName");
		dto.setUsername(userName);
		String mobile = req.getParameter("mobile");
		dto.setMobile(mobile);
		String password = req.getParameter("password");
		dto.setPassword(password);
		String location = req.getParameter("location");
		dto.setLocation(location);
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		try {
			int rows = Reg_Dao.getData(dto);
			if(rows>0) 
			{
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.forward(req, res);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
