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
				<li>Starring: <br> <c:forEach items="${film.actors}"
						var="actor">
						<tr>
							<td>${actor.firstName} ${actor.lastName}<br></td>
						</tr>
					</c:forEach>
				</li>
				<li>Category: ${film.category }</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>Film not found.</p>
		</c:otherwise>
	</c:choose>
	<a href="index.html">Return home.</a>
</body>
</html>
