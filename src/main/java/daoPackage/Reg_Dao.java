package daoPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Registration.Reg_Bean;
import com.pack.connectionFactory.ConnectionFactory;

public class Reg_Dao 
{
	public static int getData(Reg_Bean dto) throws ClassNotFoundException, SQLException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("INSERT INTO HACKER VALUES(?,?,?,?)");
		pst.setString(1, dto.getUsername());
		pst.setString(2, dto.getMobile());
		pst.setString(3, dto.getPassword());
		pst.setString(4, dto.getLocation());
		return pst.executeUpdate();
		
	}
}
