package daoPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.connectionFactory.ConnectionFactory;


public class EditServletDao extends HttpServlet {
	
	public static ResultSet getDao(String mobile) throws SQLException, ClassNotFoundException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER WHERE MOBILE = ?");
		pst.setString(1, mobile);
		return pst.executeQuery();
	}

}
