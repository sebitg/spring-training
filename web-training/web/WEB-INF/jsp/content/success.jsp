<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="content" tagdir="/WEB-INF/tags"%>

<div id="greetings" class="jumbotron">
	<h1>Welcome in Spring WEB training</h1>
	<p>We'll have a lot of fun here! ;)</p>
	<br />
	<a href='<c:url value="/index" />' class="btn btn-xs btn-success">Back to home</a>
</div>

<c:if test="${form ne null}">
	<div class="alert alert-info" role="alert">
		<b>Data from step1: </b><br />
		Name: ${form.name}<br />
		Lastname: ${form.lastName}
	</div>
</c:if>

<c:if test="${form2 ne null}">
	<div class="alert alert-info" role="alert">
		<b>Data from step2: </b><br />
		Address: ${form2.address}<br />
		Postal: ${form2.postal}<br />
		Email: ${form2.email}
	</div>
</c:if>