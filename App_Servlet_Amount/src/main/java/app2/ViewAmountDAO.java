package app2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAmountDAO
{
	public ArrayList<AmountBean>al=new ArrayList<AmountBean>();
	public ArrayList<AmountBean>retrieve()
	{
		try 
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from amount57");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				AmountBean ab=new AmountBean();
				ab.setAmount(rs.getInt(1));
				ab.setName(rs.getString(2));
				ab.setBalance(rs.getInt(3));
				al.add(ab);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return al;
	}
}