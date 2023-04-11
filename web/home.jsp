<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.Item" %>
<%--
  Created by IntelliJ IDEA.
  User: nbissametova
  Date: 4/9/2023
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task2-1</title>
    <%@include file="head.jsp"%>

</head>
<body>


    <div class="container">
        <%@include file="navbar.jsp"%>
        <div class="row mt-5">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>PRICE</th>
                    <th>AMOUNT</th>
                    <th>DETAILS</th>
                </tr>
                </thead>
                <tbody>

                <%
                    ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("phones");
                    for (Item item : items){

                %>

                <tr>
                    <td>
                        <%=item.getId()%>
                    </td>
                    <td>
                        <%=item.getName()%>
                    </td>
                    <td>
                        <%=item.getPrice()%>
                    </td>
                    <td>
                        <%=item.getAmount()%>
                    </td>
                    <td>
                        <button type="button" class="btn btn-secondary">DETAILS</button>
                    </td>
                </tr>

                <%
                    }
                %>


                </tbody>
            </table>
        </div>

    </div>

</body>
</html>
