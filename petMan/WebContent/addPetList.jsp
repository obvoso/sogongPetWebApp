<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="petMan.PetManDAO" %>
 <%@ page import="petMan.PetManDTO" %>
 <%@ page import="java.io.PrintWriter" %>
 <%
 	String name = (String) request.getAttribute("newPet");

 	PrintWriter script = response.getWriter();
	script.println("<script>");
 	script.println("alert('" + name + "등록이 완료되었습니다.');");
 	script.println("location.href = 'index.jsp';");
 	script.println("</script>");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>