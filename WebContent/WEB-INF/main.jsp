<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Films</title>
</head>
<body>

	${film.filmId}
	<br> ${film.title} ${film.releaseYr}
	<br> ${film.description}
	<br>
	<c:forEach items="${actors}" var="actor">
	<li>${actor.firstName}</li>
	<li>${actor.lastName}</li>
	</c:forEach>
	<br>
	<form action="updateForm.do" method="GET">
		*** UPDATE THIS FILM *** <br> <input type="text" name="filmId"
			value="${film.filmId}" /> <input type="submit"
			value="Update Film Information" />
	</form>
	<br>

	<form action="deleteFilm.do" method="POST">
		Enter Film ID to Delete: <input type="text" name="filmId" /> <input
			type="submit" value="Submit Id" />
	</form>
	<a href="index.html">Return home.</a>
</body>


</html>