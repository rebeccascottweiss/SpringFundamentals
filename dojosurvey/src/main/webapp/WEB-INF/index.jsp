<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Survey</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container">
		<form action="/process" method="POST">
			<label for="name">Your Name: <input name="name" type="text" /></label>
			<br /><br />
			<label for="location">Dojo Location: <select name="location" id="location">
					<option value="Burbank">Burbank</option>
					<option value="San Jose">San Jose</option>
					<option value="Dallas">Dallas</option>
					<option value="Seattle">Seattle</option>
					<option value="Bellevue">Bellevue</option>
					
				</select>
			</label>
						<br /><br />
			
			<label for="language">Favorite Language: <select name="language" id="language">
					<option value="Python">Python</option>
					<option value="JavaScript">JavaScript</option>
					<option value="Java">Java</option>
					<option value="Html">Html</option>
					<option value="C++">C++</option>
				</select>
			</label>
						<br /><br />
			
			<label for="comment">Comment (Optional): 
				<textarea name="comment" id="comment" cols="30" rows="10"></textarea>
			</label>
						<br /><br />
			
			<input type="submit" value="Submit" />
		</form>
	</div>
</body>
</html>