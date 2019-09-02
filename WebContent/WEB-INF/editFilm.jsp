<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><title>Update Film</title>
</head>
<body>

<h1>Update Film</h1>


<form:form action ="editFilm.do" method="POST" modelAttribute="updateFilm">
<table>
<tr>
<td><form:input path="filmId" type="hidden" value="${updateFilm.filmId}"/></td>

</tr>
<tr>
<td>Title</td>
<td><form:input path="title" type="text" value="${updateFilm.title}"/></td>
</tr>
<tr>
<td>Description</td>
<td><form:input path="description" type="text" value="${updateFilm.description}"/></td>
</tr>
 <tr>
<td>Release Year</td>
<td><form:input path="releaseYr" type="text" value="${updateFilm.releaseYr}"/></td>
</tr>
<tr>
<td>Rental Duration</td>
<td><form:input path="rentalDur" type="text" value="${updateFilm.rentalDur}"/></td>
</tr>
<tr>
<td>Rental Rate</td>
<td><form:input path="rentalRate" type="text" value="${updateFilm.rentalRate}"/></td>
</tr>
<tr>
<td>Length</td>
<td><form:input path="length" type="text" value="${updateFilm.length}"/></td>
</tr>
<tr>
<td>Replacement Cost</td>
<td><form:input path="replaceCost" type="text" value="${updateFilm.replaceCost}"/></td>
</tr>
<tr>
<td>Rating</td>
<td><form:input path="rating" type="text" value="${updateFilm.rating}"/></td>
</tr>

<tr>
<td><input type="submit" value="Update" /></td>

</tr>
</table>
</form:form>
</body>
</html>