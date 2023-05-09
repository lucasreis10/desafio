<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>View Books</title>
    <link href="<c:url value="/css/common.css"/>" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ISBN</th>
        <th>Name</th>
        <th>Author</th>
    </tr>
    </thead>
    <tbody>
<%--    <c:forEach items="${pessoas}" var="pessoa">--%>
<%--        <tr>--%>
<%--            <td>${pessoa.isbn}</td>--%>
<%--            <td>${pessoa.name}</td>--%>
<%--            <td>${pessoa.author}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
    </tbody>
</table>
</body>
</html>