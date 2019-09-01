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
ID: ${newFilm.filmId }
${newFilm.title}
${newFilm.description}
${newFilm.releaseYr}
${newFilm.rating }
${newFilm.rentalDur }
${newFilm.rentalRate }
${newFilm.length }
${newFilm.replaceCost }
${newFilm.category }

</body>
</html>
