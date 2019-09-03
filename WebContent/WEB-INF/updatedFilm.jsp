<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Film Database Updated:

	<br>
	<h2>${film.title}</h2>
	<ul>
		<li>Film ID: ${film.filmId}</li>
		<li>Summary: ${film.description}</li>
		<li>Release Year: ${film.releaseYr}</li>
		<li>Language ID: ${film.langId }</li>
		<li>Rental Duration: ${film.rentalDur }</li>
		<li>Rental Rate: $ ${film.rentalRate }</li>
		<li>Film Length: ${film.length } minutes</li>
		<li>Replacement Cost: $ ${film.replaceCost }</li>
		<li>Film Rating: ${film.rating }</li>
	</ul>
	<a href="index.html">Return home.</a>
</body>
</html>