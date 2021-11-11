<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  background-color: Turquoise;
  color: white;
}
p {
  background-color: Tomato;
  color: white;
}
</style>
<meta charset="UTF-8">
<title>Temperature Converter!</title>
<script type = "text/javascript">

	function validate(form){
  if(form.fahrenheitTemp.value == "") {
    alert("Error: Input is empty!");
    form.fahrenheitTemp.focus();
    return false;
  }
  var re = /^\d+(\.\d+)?$/;

  // validation fails if the input doesn't match our regular expression
  if(!re.test(form.fahrenheitTemp.value)) {
    alert("Error: Input contains invalid characters!");
    form.fahrenheitTemp.focus();
    return false;
  }
  
  return true;
}

</script>
</head>
<body>
<h1>Fahrenheit to Celsius Converter</h1> <br>

<form action="FahToCelServlet" method="post"  onsubmit="return validate(this);">
<p> Enter the temperature in Fahrenheit </p> <input type="text" name="fahrenheitTemp" size="10">
<input type="submit" value="Calculate Celsius" />
</form>
 <br>
 <br>
<a href="celForm.jsp">Convert Celsius to Fahrenheit?</a>
</body>
</html>	