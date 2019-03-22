<%-- 
    Document   : orderPage
    Created on : 21-03-2019, 14:03:59
    Author     : ahmed
--%>

<%@page import="FunctionLayer.House"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%House house1 = (House) request.getAttribute("house"); %>
        <p> height : <%=house1.getHeight() %></p>
        <p> lenght : <%=house1.getLength()%></p>
        <p> width : <%=house1.getWidth()%></p>
        
    </body>
</html>
