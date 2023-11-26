<%@ page language="java" import="daoPackage.EditServletDao,java.sql.*,java.io.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editing candidate details</title>
</head>
<body>
	<% 
		String mobile = request.getParameter("mobile");
		session.setAttribute("mobile", mobile);
		response.setContentType("text/html");
		PrintWriter out1 = response.getWriter();
		try{
			ResultSet rs = EditServletDao.getDao(mobile);
			out1.println("<body style='background-image:url(admin.jpg)'>"
						+"<h3 align='center' style='color:Brown;font-size:23px'>CANDIDATE EDITING PROCESS</h3>");
			while(rs.next())
			{
				out1.println("<form action='Update.jsp' method='get'>"
						+"<table align='center' border style='border-collapse:collapse;background-color:#708090' cellpadding='5' cellspacing='5'>"
						+"<tr><td style='color:white'>Username:</td><td><input type='text' name='userName' value=" + rs.getString(1) + "></td></tr>"
						+"<tr><td style='color:white'>Mobile:</td><td><input type='text' name='mobile' value=" + rs.getString(2) + "></td></tr>"
						+"<tr><td style='color:white'>Password:</td><td><input type='text' name='password' value=" + rs.getString(3) + "></td></tr>"
						+"<tr><td style='color:white'>Location:</td><td><input type='text' name='location' value=" + rs.getString(4) + "></td></tr>"
						+"<tr><td><input style='color:white;background-color:#FF7F50;font-size:15px' type='submit' value='Update'</td>&nbsp&nbsp"
						+"<td><input style='color:white;background-color:black;font-size:15px' bgcolor='red' type='reset' value='Cancel'></td></tr>"
						+"</table>"
						+"</form>");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>