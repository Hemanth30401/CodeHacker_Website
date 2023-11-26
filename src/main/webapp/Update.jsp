<%@ page language="java" import="daoPackage.UpdateDao,java.io.PrintWriter" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updating details</title>
</head>
<body>
	<%
		String userName = request.getParameter("userName");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String location = request.getParameter("location");
		response.setContentType("text/html");
		PrintWriter out2 = response.getWriter();
		try{
			String num = (String)session.getAttribute("mobile");
			int rows = UpdateDao.getDao(userName,mobile,password,location,num);
			if(rows>0)
			{
				out2.println("<body style='background-image:url(admin.jpg)'>"
							+"Updated Successfully<br><hr>"
							+"<center>Login For Admin:&nbsp&nbsp<button style='font-size:25px'><a href='Admin.html'>Login</a></button></body>");
			}
			else{
				out2.println("Not updated");
				response.sendRedirect("Candidate1");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	%>
</body>
</html>