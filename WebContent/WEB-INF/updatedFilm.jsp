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
${updateFilm.title}
${updateFilm.description}
${updateFilm.releaseYr}
${updateFilm.rating}

<form:form action="saveFilm.do" method="POST" modelAttribute="saveFilm">

		<input type="submit" value="SAVE FILM"/>
	</form:form>
<br>



<a href="index.html">Return home.</a>
</body>
</html>