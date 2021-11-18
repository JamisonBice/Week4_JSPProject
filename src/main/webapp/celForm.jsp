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
<script type = "text/javascript">

	function validate(form){
  if(form.celsiusTemp.value == "") {
    alert("Error: Input is empty!");
    form.celsiusTemp.focus();
    return false;
  }
  var regEx = /^\d+(\.\d+)?$/;

  // validation fails if the input doesn't match our regular expression
  if(!regEx.test(form.celsiusTemp.value)) {
    alert("Error: Input contains invalid characters!");
    form.celsiusTemp.focus();
    return false;
  }
  
  return true;
}

</script>
</head>
<body>
<h1>Celsius to Fahrenheit Converter</h1> <br>

<form  method="post" action="CelToFahServlet" onsubmit="return validate(this);">
 <p> Enter the temperature in Celsius </p> <input type="text" name="celsiusTemp" size="10">
<input type="submit" value="Calculate Fahrenheit" />
</form>
 <br>
 <br>
<a href="fahForm.jsp">Convert Fahrenheit to Celsius?</a>
</body>
</html>	