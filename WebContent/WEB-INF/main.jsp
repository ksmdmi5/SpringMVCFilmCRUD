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
				<li>Starring:</li>
				<%-- <c:choose>
					<c:when test="${! empty actor }"> --%>
						<c:forEach items="${actor}" var="actor">
							<tr>
								<td>${actor.firstName} ${actor.lastName}<br></td>
							</tr>
						</c:forEach>
	<%-- 				</c:when>
					<c:otherwise>
						<p>No Actors found.</p>
					</c:otherwise>
				</c:choose> --%>

				<li>Category: ${film.category }</li>
			</ul>
		</c:when>
		<c:otherwise>
			<div class="alert alert-primary" role="alert">Film not found.</div>
		</c:otherwise>
	</c:choose>
	<br>
	<form action="updateForm.do" method="GET">
		Update Film<br> <input type="text" name="filmId"
			value="${film.filmId}" /> <input type="submit"
			value="Update Film Information" />
	</form>
	<br>

	<form action="deleteFilm.do" method="POST">
		Delete Film: <input type="hidden" value="${film.filmId }"
			name="filmId" /> <input type="submit" value="Submit" />
	</form>
	<a href="index.html">Return home.</a>
</body>


</html>