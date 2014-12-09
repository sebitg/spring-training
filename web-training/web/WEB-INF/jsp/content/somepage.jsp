<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="content" tagdir="/WEB-INF/tags"%>

<div id="greetings" class="jumbotron">
	<h1>Welcome in Spring WEB training</h1>
	<p>We'll have a lot of fun here! ;)</p>
	<br />
	<a href='<c:url value="/index" />' class="btn btn-xs btn-success">Back to home</a>
</div>

<div>
	<c:if test="${vip}">
		<div class="alert alert-success" role="alert">
			Hello <b>${fullname}</b>. You are VIP!
		</div>
	</c:if>
	<c:if test="${!vip}">
		<div class="alert alert-info" role="alert">
			Hello <b>${fullname}</b>. You're regular user!
		</div>
	</c:if>
</div>