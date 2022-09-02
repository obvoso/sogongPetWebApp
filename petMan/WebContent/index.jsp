<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>petManagemantSystem</title>
</head>
<body>
	<form action="./petManAction.jsp" method="post">
		<input type="text" name="name" placeholder="반려동물의 이름">
		<input type="text" name="birth" placeholder="반려동물의 생일">
		<input type="text" name="type"  placeholder="반려동물의 종류">
		<input type="text" name="kind"  placeholder="반려동물의 품종">
		<input type="text" name="master"  placeholder="보호자의 이름">
		<input type="text" name="phone"  placeholder="보호자의 연락처">
		<input type="submit" value="확인">
	</form>
</body>
</html>