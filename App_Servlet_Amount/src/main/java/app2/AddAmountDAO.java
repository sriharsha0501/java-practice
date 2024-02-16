package app2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddAmountDAO 
{
	public int k=0;
	public int insert(AmountBean ab)
	{
		try
		{
			//geting connection object
			Connection con = DBConnection.getCon();
			
			//preparing statement
			PreparedStatement ps=con.prepareStatement("insert into amount57 values(?,?,?)");
			
			// setting attributes to prepare statement
			ps.setInt(1, ab.getAmount());
			
			ps.setString(2, ab.getName());
			ps.setInt(3, ab.getBalance());
			
			//executing query
			k=ps.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return k;
		
	}
	
	
	

}
