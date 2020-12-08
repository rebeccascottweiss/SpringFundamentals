<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>We Love Java</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<h1>You have chosen wisely, <c:out value="${ name }"/>. Java is the best language!</h1>
</body>
</html>