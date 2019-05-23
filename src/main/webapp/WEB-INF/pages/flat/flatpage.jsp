<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 23.05.2019
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Квартиры</title>
</head>
<body>

<a href="../">На главную</a>

<h1>Квартиры</h1>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>ID продавца</th>
        <th>Кадастровый номер</th>
        <th>Площадь</th>
        <th>Комнат</th>
        <th>Стоимость</th>
        <th>Город</th>
        <th>Район</th>
        <th>Улица</th>
    </tr>
    <c:forEach items="${listFlats}" var="flat">
        <tr>
            <td>${flat.id}</td>
            <td>${flat.sellerId}</td>
            <td>${flat.cadastralNumber}</td>
            <td>${flat.rooms}</td>
            <td>${flat.square}</td>
            <td>${flat.cost}</td>
            <td>${flat.city}</td>
            <td>${flat.district}</td>
            <td>${flat.streetHouse}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
