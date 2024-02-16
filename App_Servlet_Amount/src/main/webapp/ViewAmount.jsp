<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,app2.AmountBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<AmountBean>al=(ArrayList<AmountBean>)request.getAttribute("list");
if(al.size()==0)
{
	out.println("Account is nill...<br>");
}
else
{
	Iterator<AmountBean>it=al.iterator();
	while(it.hasNext())
	{
		AmountBean ab=it.next();
	
		out.println(ab.getName());
		out.println(ab.getBalance()+"<br>");
	}
}
%>
<jsp:include page="Home.html"></jsp:include>
</body>
</html>