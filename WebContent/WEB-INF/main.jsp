<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Films</title>
</head>
<body>
${film.title}
${film.filmId}
<br>
	<form action="updateForm.do" method="GET">
Enter Film ID to Update:
<input type="text" name="filmId"/>
<input type="submit" value="Submit Id"/>
</form>


	<form action="deleteFilm.do" method="POST">
Enter Film ID to Delete:
<input type="text" name="filmId"/>
<input type="submit" value="Submit Id"/>
</form>
<a href="index.html">Return home.</a>
</body>


</html>