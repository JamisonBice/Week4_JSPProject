<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
p {
  background-color: Tomato;
  color: white;
}
</style>
<meta charset="UTF-8">
<title>Results</title>
</head>
<br>
<body>
<p>${userTemp.getTemp()} degrees in Celsius <br />

</p>
<br>
<br>
<a href="fahForm.jsp">Enter another temperature</a>
</body>
</html>