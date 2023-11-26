package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pack.connectionFactory.ConnectionFactory;

public class CandidateDisplayDao 
{
	public static ResultSet getDao() throws ClassNotFoundException, SQLException 
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER");
		return pst.executeQuery();
	}
}
