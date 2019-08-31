<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- TODO: Add the @taglib for form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Film</title>
</head>
<body>
	<!-- TODO: Add registration form -->
	<form:form action="AddFilm.do" method="POST" modelAttribute="newFilm">
		<form:label path="title">Title:</form:label>
		<form:input path="title" />
		<form:errors path="title" />
		<br />
		<form:label path="description">Description:</form:label>
		<form:input path="description" />
		<form:errors path="description" />
		<br />
		<form:label path="releaseYr">Release Year:</form:label>
		<form:input path="releaseYr" />
		<form:errors path="releaseYr" />
		<br />
		<form:label path="rentalDur">Rental Duration:</form:label>
		<form:input path="rentalDur" />
		<form:errors path="rentalDur" />
		<br />
		<form:label path="rentalRate">Rental Rate:</form:label>
		<form:input path="rentalRate" />
		<form:errors path="rentalRate" />
		<br />
		<form:label path="length">Movie Length:</form:label>
		<form:input path="length" />
		<form:errors path="length" />
		<br />
		<form:label path="replaceCost">Replacement Cost:</form:label>
		<form:input path="replaceCost" />
		<form:errors path="replaceCost" />
		<br />
		<form:label path="rating">Movie Rating:</form:label>
		<form:input path="rating" />
		<form:errors path="rating" />
		<input type="submit" value="Add Film" />
	</form:form>
</body>
</html>