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
			Connection con = DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into amount57 values(?,?,?)");
			ps.setInt(1, ab.getAmount());
			ps.setString(2, ab.getName());
			ps.setInt(3, ab.getBalance());
			k=ps.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return k;
		
	}
	
	
	

}
