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
<td>${updated.title}</td>
<td>${updated.description}</td>
<td>${updated.releaseYr}</td>
<td>${updated.rating}</td>
</tr>
</table>




<a href="index.html">Return home.</a>
</body>
</html>