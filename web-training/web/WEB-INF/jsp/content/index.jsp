<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="content" tagdir="/WEB-INF/tags"%>

<div id="greetings" class="jumbotron">
	<h1>Welcome in Spring WEB training</h1>
	<p>We'll have a lot of fun here! ;)</p>
	<br />
	<a href='<c:url value="somePage/Jan/Kowalski" />' class="btn btn-lg btn-success">Fill this page!</a>
	<a href='<c:url value="somePage2?name=Jan&lastname=Kowalski" />' class="btn btn-lg btn-success">Fill this page as well!</a>
	<a href='<c:url value="register" />' class="btn btn-lg btn-primary">Register in system</a>
</div>