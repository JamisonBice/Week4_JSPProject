<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  background-color: Tomato;
  color: white;
}
p {
  background-color: Turquoise;
  color: white;
}
</style>
<meta charset="UTF-8">
<title>Temperature Converter!</title>
</head>
<body>
<h1>Celsius to Fahrenheit Converter</h1> <br>

<form action="CelToFahServlet" method="post">
 <p> Enter the temperature in Celsius </p> <input type="text" name="celsiusTemp" size="10">
<input type="submit" value="Calculate Fahrenheit" />
</form>
 <br>
 <br>
<a href="fahForm.jsp">Convert Fahrenheit to Celsius?</a>
</body>
</html>	