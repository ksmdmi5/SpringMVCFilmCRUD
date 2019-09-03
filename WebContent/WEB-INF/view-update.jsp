<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- TODO: Add the @taglib for form -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Film</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty film }">
			<h2>${newFilm.title}</h2>
			<p>Film database updated.</p>
			<ul>
				<li>Film ID: ${film.filmId}</li>
				<li>Summary: ${newFilm.description}</li>
				<li>Release Year: ${newFilm.releaseYr}</li>
				<li>Language ID: ${newFilm.langId }</li>
				<li>Rental Duration: ${newFilm.rentalDur }</li>
				<li>Rental Rate: $${newFilm.rentalRate }</li>
				<li>Film Length: ${newFilm.length } minutes</li>
				<li>Replacement Cost: $${newFilm.replaceCost }</li>
				<li>Film Rating: ${newFilm.rating }</li>
				<li>Starring: <br> <c:forEach items="${newFilm.actors}"
						var="actor">
						<tr>
							<td>${actor.firstName} ${actor.lastName}<br></td>
						</tr>
					</c:forEach>
				</li>
				<li>Category: ${newFilm.category }</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>Film not found.</p>
		</c:otherwise>
	</c:choose>
	<a href="index.html">Return home.</a>
</body>
</html>
