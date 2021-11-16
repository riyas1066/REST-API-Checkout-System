<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<h1>Checkout System</h1>

	<form action="user" method="post">
	<table>
	<tr><td>SI.No.</td><td>Item</td><td>Quantity</td></tr>
	<tr><td>1.</td><td>Bread</td><td><input type="number" name="quanOne" value="0"></td></tr>
	<tr><td>2.</td><td>Milk</td><td><input type="number" name="quanTwo" value="0"></td></tr>
	<tr><td>3.</td><td>Butter</td><td><input type="number" name="quanThree" value="0"></td></tr>
	</table>
<!-- 		<input type="text" name="userName"> -->
		<br> 
		<input type="submit" value="CheckOut">
	</form>
</body>
</html>