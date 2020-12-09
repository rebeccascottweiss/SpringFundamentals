<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
<div class="wrapper score">
        <h3>Your Gold:</h3>
        <div class="bank"><c:out value="${ gold }"/></div>
    </div>
    <div class="wrapper gold">
        <div class="earn">
            <h2>Farm</h2>
            <h3>(earns 10-20 gold)</h3>
            <form action="/process_money/farm" method="post">
                <input type="submit" value="Find Gold">
                <input type="hidden" name="min" value="10">
                <input type="hidden" name="max" value="20">
            </form>
        </div>
        <div class="earn">
            <h2>Cave</h2>
            <h3>(earns 5-10 gold)</h3>
            <form action="/process_money/cave" method="post">
                <input type="submit" value="Find Gold">
                <input type="hidden" name="min" value="5">
                <input type="hidden" name="max" value="10">
            </form>
        </div>
        <div class="earn">
            <h2>House</h2>
            <h3>(earns 2-5 gold)</h3>
            <form action="/process_money/house" method="post">
                <input type="submit" value="Find Gold">
                <input type="hidden" name="min" value="2">
                <input type="hidden" name="max" value="5">
            </form>
        </div>
        <div class="earn">
            <h2>Casino</h2>
            <h3>(earns/takes 0-50 gold)</h3>
            <form action="/process_money/casino" method="post">
                <input type="submit" value="Find Gold">
                <input type="hidden" name="min" value="-50">
                <input type="hidden" name="max" value="50">
            </form>
        </div>
    </div>
    <div class="wrapper activities">
        <p>Activities:</p>
        <div class="log">
			<c:forEach var="activity" items="${ activity_log }">
					<c:out value="${ activity }" escapeXml="false"/>
			</c:forEach>
        </div>
    </div>
    </body>
</html>