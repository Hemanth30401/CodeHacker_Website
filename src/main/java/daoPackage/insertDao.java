package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;

public class insertDao 
{
	public static int getInsertData(String userName,String mobile,String password,String location) throws ClassNotFoundException, SQLException 
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("INSERT INTO HACKER VALUES(?,?,?,?)");
		pst.setString(1, userName);
		pst.setString(2, mobile);
		pst.setString(3, password);
		pst.setString(4, location);
		return pst.executeUpdate();
	}
}
