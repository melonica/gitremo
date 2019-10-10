<%@page import = "com.capgemini.LoginServlet" %>

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	LoginServlet service = new LoginServlet();
	boolean result = service.validateLogin(username,password);
	if(result){
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request,response);
	}
	else{
		response.sendRedirect("Error.jsp");
	}
%>