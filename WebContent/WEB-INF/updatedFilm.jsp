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
Film Updated

<br>
<table>
<tr>
<td>${updateFilm.title}</td>
<td>${updateFilm.description}</td>
<td>${updateFilm.releaseYr}</td>
<td>${updateFilm.rating}</td>
</tr>
</table>
<form:form action="saveFilm.do" method="POST" modelAttribute="updateFilm">

		<input type="submit" value="SAVE FILM"/>
	</form:form>
<br>



<a href="index.html">Return home.</a>
</body>
</html>