package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;

public class DisplayDao 
{
	public static int getData(String mobile) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("DELETE FROM HACKER WHERE MOBILE=?");
		pst.setString(1, mobile);
		return pst.executeUpdate();
		
	}
}
