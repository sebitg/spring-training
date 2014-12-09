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



<c:set var="path">
	<c:url value="register" />
</c:set>

<form:form method="post" action='${path}' commandName="form" cssClass="form" role="form"> 

	<c:if test="${error ne null}">
		<div class="alert alert-danger" role="alert">
			${error}<br />
			<form:errors path="*" element="div" />
		</div>
	</c:if>

	<div class="form-group">
		<form:label path="name">Name</form:label>
		<form:input path="name" cssClass="form-control" />
	</div>
	<div class="form-group">
		<form:label path="lastName">Last name</form:label>
		<form:input path="lastName" cssClass="form-control" />
	</div>
	<div class="form-group submit-button">
		<button type="submit" class="btn btn-lg btn-success">Next</button>
	</div>
</form:form>