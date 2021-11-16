<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User CheckOut Page</title>
</head>
<body>

<h1>CheckOut</h1>
<table>
<tr style="background-color: #f3f1f5;"><td></td><td colspan="2">Before Offer</td><td colspan="2">After Offer</td></tr>
	<tr style="background-color: #e3e0e7;"><td>Item</td><td>Quantity</td><td>Amount ($)</td><td>Quantity</td><td>Amount($)</td></tr>
	<c:if test="${quanOneOrg!=0}">
	<tr><td>Bread</td><td>${quanOneOrg}</td><td>${quanOne}</td><td>${brdQun}</td><td>${quanOne}</td></tr>
	</c:if>
	<c:if test="${quanTwoOrg!=0}">
	<tr style="background-color: #e3e0e7;"><td>Milk</td><td>${quanTwoOrg}</td><td>${quanTwo}</td><td>${milkQun}</td><td>${milkQunAmt}</td></tr>
	</c:if>
	<c:if test="${quanThreeOrg!=0}">
	<tr><td>Butter</td><td>${quanThreeOrg}</td><td>${quanThree}</td><td>${butrQun}</td><td>${butrQunAmt}</td></tr>
	</c:if>
	<tr style="background-color: #e3e0e7;"><th colspan="2">Total</th><td>${total}</td><th>Total Cost</th><td>${alltotal}</td></tr>
	</table>
</body>
</html>