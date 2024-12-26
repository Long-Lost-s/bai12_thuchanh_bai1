<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Customer List</title>
  <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<h1>Danh sách khách hàng</h1>
<p>
  <a href="/customers?action=create">Create new customer</a>
</p>
<table border="1">
  <tr>
    <td>Name</td>
    <td>Email</td>
    <td>Address</td>
    <td>Edit</td>
    <td>Delete</td>
  </tr>
  <c:forEach items='${requestScope["customers"]}' var="customer">
    <tr>
      <td><a href="/customers?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
      <td>${customer.getEmail()}</td>
      <td>${customer.getAddress()}</td>
      <td><a href="/customers?action=edit&id=${customer.getId()}">Sửa thông tin</a></td>
      <td><a href="/customers?action=delete&id=${customer.getId()}">Xóa thông tin</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>