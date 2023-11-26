<%@ page language="java" import="daoPackage.DisplayDao,java.sql.ResultSet,java.io.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleting Candidate Data</title>
</head>
<body>
	<%
		String mobile = request.getParameter("mobile");
		response.setContentType("text/html");
		PrintWriter out1 = response.getWriter();
		try
		{
			int rows = DisplayDao.getData(mobile);
			
			if(rows>0)
			{
				out1.println("<body style='background-image:url(admin.jpg)'>"
						+"DELETED SUCCESSFULLY<br><hr>"
						+"<center><button style='font-size:25px'>Login For Admin:&nbsp&nbsp<a href='Admin.html'>Login</a></button></center></body>");
			}
			else
			{
				out1.println("Not Deleted");
				RequestDispatcher rd = request.getRequestDispatcher("Candidate1");
				rd.forward(request,response);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>