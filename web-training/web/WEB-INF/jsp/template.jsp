<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="content" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
	<jsp:include page="/WEB-INF/jsp/head.jsp" />
<body>
<header>
	<jsp:include page="/WEB-INF/jsp/header.jsp" />
</header>
<main>
	<div class="container">
		<jsp:include page="/WEB-INF/jsp/${param.content}.jsp" />
	</div>
</main>
</body>
<footer>
	<jsp:include page="/WEB-INF/jsp/footer.jsp" />
</footer>
</html>