<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<ul>
		<c:forEach var="item" items="${userList}">
			<li>${item.idx} / ${item.userId} / ${item.memo} </li>
		</c:forEach>
	</ul>
</body>
</html>
