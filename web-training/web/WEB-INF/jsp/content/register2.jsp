<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="content" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="greetings" class="jumbotron">
	<h1>Welcome in Spring WEB training</h1>
	<p>We'll have a lot of fun here! ;)</p>
	<br />
	<a href='<c:url value="/index" />' class="btn btn-xs btn-success">Back to home</a>
</div>

<h3 style="margin-top: 5px; margin-bottom: 15px;">Register in system</h3>

<c:if test="${error ne null}">
	<div class="alert alert-danger" role="alert">
		${error}
	</div>
</c:if>

<c:if test="${form ne null}">
	<div class="alert alert-info" role="alert">
		<b>Data from step1: </b><br />
		Name: ${form.name}<br />
		Lastname: ${form.lastName}
	</div>
</c:if>

<c:set var="path">
	<c:url value="register2" />
</c:set>

<form:form method="post" action='${path}' commandName="form2" cssClass="form" role="form"> 
	<div class="form-group">
		<form:label path="address">Address</form:label>
		<form:input path="address" cssClass="form-control" />
	</div>
	<div class="form-group">
		<form:label path="postal">Postal</form:label>
		<form:input path="postal" cssClass="form-control" />
	</div>
	<div class="form-group">
		<form:label path="email">Email</form:label>
		<form:input path="email" cssClass="form-control" />
	</div>
	<div class="form-group submit-button">
		<button type="submit" class="btn btn-lg btn-success">Register</button>
	</div>
</form:form>