<%@page import="net.javaguides.usermanagement.model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Users user = (Users) session.getAttribute("logUser");
    if(user==null){
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
 Welcome, <%= user.getName() %></h1>
<h3>
Your Account ID: <%= user.getId() %> </h3>
<h3>
Your Email: <%= user.getEmail() %> </h3>
<h3>
Your Password: <%= user.getPassword() %></h3>
<button><a href="LogoutServlet">Log Out</a></button>
    </body>
</html>