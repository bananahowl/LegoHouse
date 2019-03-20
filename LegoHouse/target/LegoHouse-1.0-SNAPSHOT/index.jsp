<%-- 
    Document   : index
    Created on : 20-03-2019, 14:33:54
    Author     : ahmed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p><% out.print(request.getParameter("login"));%></p>
        <%if("failed".equals(request.getParameter("login"))){
        %> <p>Error you failed to log in</p> <% } %>
        <form action="FrontController?origin=login" method="post">
            email:
            <input type="text" name="email" value="hej">
            password:
            <input type="password" name="password" value="1">
            <input type="submit" value="submit">
            
        </form>
    </body>
</html>
