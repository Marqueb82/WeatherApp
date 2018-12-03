<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="weather.css">
<title>Weather</title>
</head>
<body>

	<button onclick="myFunction()">Refresh page</button>

	<script>
		function myFunction() {
    	location.reload();
	}
	</script>
	
	<h2 align="center">That's Detroit weather for you.....</h2>
	<div>
		<h3>Current Temperature:</h3>
		<br>
		<h4>${currently.temperature}</h4>
		<br><br>
		<h3>Current Weather Summary:</h3>
		<br>
		<h4>${currently.summary}</h4>
		<br><br>
		<h3>To The Minute Weather Summary:</h3>
		<br>
		<h4>${minutely.summary}</h4>
		<br><br>
		<h3>To The Hourly Weather Summary:</h3>
		<br>
		<h4>${hourly.summary}</h4>
		<br><br>
		<h3>Daily Look Ahead:</h3>
		<br>
		<h4>${daily.summary}</h4>
	</div>
	
</body>
</html>