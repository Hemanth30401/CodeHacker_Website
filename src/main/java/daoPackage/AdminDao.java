package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;


public class AdminDao 
{
	public static ResultSet getAdminDao(String emailId,String password) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM ADMIN WHERE EMAILID = ? AND PASSWORD=?");
		pst.setString(1, emailId);
		pst.setString(2, password);
		return pst.executeQuery();
	}
}
