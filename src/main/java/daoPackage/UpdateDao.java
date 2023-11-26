package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;

public class UpdateDao 
{
	public static int getDao(String userName,String mobile,String password,String location,String no) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("UPDATE HACKER SET USERNAME=?,MOBILE=?,PASSWORD=?,LOCATION=? WHERE MOBILE=?");
		pst.setString(1, userName);
		pst.setString(2, mobile);
		pst.setString(3, password);
		pst.setString(4, location);
		pst.setString(5, no);
		return pst.executeUpdate();
	}
}
