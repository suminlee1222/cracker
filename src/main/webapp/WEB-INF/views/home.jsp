<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="<c:url value="/resources/js/test.js"/>"></script>
</head>
<body>
	<ul>
		<c:forEach var="item" items="${userList}">
			<li>${item.idx}번 / ${item.name}님 / 번호: ${item.puid} </li>
		</c:forEach>
	</ul>
	<h3>yuban commit test</h3>
</body>
</html>
