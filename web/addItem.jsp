<%--
  Created by IntelliJ IDEA.
  User: nbissametova
  Date: 4/10/2023
  Time: 2:13 AM
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

      <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">NAME:</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Insert name...">
      </div>

      <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">NAME:</label>
        <input type="text" class="form-control" id="exampleFormControlInput2" placeholder="Insert price...">
      </div>

      <div class="mb-3">
        <label for="exampleFormControlInput3" class="form-label">AMOUNT:</label>
        <input type="number" class="form-control" id="exampleFormControlInput3" placeholder="Insert amount...">
      </div>

      <button type="button" class="btn btn-secondary">ADD ITEM</button>

      <%
        
      %>

    </div>

</body>
</html>
