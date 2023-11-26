package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;

public class Login_Dao 
{
	public static ResultSet getDao(String userName,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER WHERE USERNAME=? AND PASSWORD=?");
		pst.setString(1, userName);
		pst.setString(2, password);
		return pst.executeQuery();
	}
}
