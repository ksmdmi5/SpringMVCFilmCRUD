<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty films }">
			<ul>
				<c:forEach items="${films}" var="film">
					<br>
					<li>${film.title }</li>
					<li>ID: ${film.filmId}</li>
					<li>${film.description }</li>
					<li>Cast:</li>
					<c:forEach items="${film.actors}" var="actor">
						<p>${actor.getFirstName()}${actor.getLastName()}</p>
					</c:forEach>
					<li>${film.category }</li>
					<form action="GetFilmById.do">
						<input type="hidden" value="${film.filmId }" name="fId" />
					</form>
				</c:forEach>
			</ul>
			<a href="index.html">Return home.</a>
		</c:when>
		<c:otherwise>
			<h2>No film found for this word.</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>