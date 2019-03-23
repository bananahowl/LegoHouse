<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        
        You are now logged in as a customer of our wonderful site.


        <br><br>

        <form name="addProduct" action="FrontController" method="POST">
            <input type="hidden" name="command" value="addProduct">
                <table class="table table-striped">
                    <thead><tr><th>Length</th><th>Width</th><th>Height</th><th>Select</th><th></th></tr></thead>
                    <tbody>
                        <%-- <tr> <th> Length </th> <th> Width </th> <th> Height </th>  <th> Confirm </th>  </tr> --%>

                    <td><input type="text" name="length" placeholder="length" id="qtyInput"></td>

                    <td><input type="text" name="width" placeholder="width" id="qtyInput"></td>

                    <td><input type="text" name="height" placeholder="height" id="qtyInput"></td>
                    <td><input type="submit" name="action" value="Add to cart"></td>
                    </tr>
                </table>
            </form>
    </body>
</html>
