package app2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddAmountServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		AmountBean ab=new AmountBean();
		ab.setAmount(Integer.parseInt(req.getParameter("code")));
		ab.setName(req.getParameter("name"));
		ab.setBalance(Integer.parseInt(req.getParameter("amt")));
		int k=new AddAmountDAO().insert(ab);
		 if(k>0)
		 {
			 req.setAttribute("msg", "Amount Added Sucessfully....<br>");
			 RequestDispatcher rd=req.getRequestDispatcher("AddAmount.jsp");
			 rd.forward(req, res);
		 }
	}
	

}
