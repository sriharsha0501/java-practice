package app2;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAmountServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		ArrayList<AmountBean>al=new ViewAmountDAO().retrieve();
		req.setAttribute("list", al);
		RequestDispatcher rd=req.getRequestDispatcher("ViewAmount.jsp");
		rd.forward(req, res);
	}
	
	

}
