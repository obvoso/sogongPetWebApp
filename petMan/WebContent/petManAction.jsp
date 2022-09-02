<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="petMan.petManDAO" %>
 <%@ page import="petMan.petManDTO" %>
 <%@ page import ="java.io.PrintWriter" %>
 <%
 	request.setCharacterEncoding("UTF-8");
 	String name = null;
 	String birth = null;
 	String type = null;
 	String kind = null;
 	String master = null;
 	String phone = null;
 	if (request.getParameter("name") != null) {
 		name = (String) request.getParameter("name");
 	}
 	if (request.getParameter("birth") != null) {
 		birth = (String) request.getParameter("birth");
 	}
 	if (request.getParameter("type") != null) {
 		type = (String) request.getParameter("type");
 	}
 	if (request.getParameter("kind") != null) {
 		kind = (String) request.getParameter("kind");
 	}
 	if (request.getParameter("master") != null) {
 		master = (String) request.getParameter("master");
 	}
 	if (request.getParameter("phone") != null) {
 		phone = (String) request.getParameter("phone");
 	}
 	if (name.equals("") || birth.equals("") || type.equals("") || kind.equals("") || master.equals("") || phone.equals("") || 
 			name == null || birth == null || type == null || kind == null || master == null || phone == null) {
 		PrintWriter script = response.getWriter();
 		script.println("<script>");
 		script.println("alert('모두 입력해주세요.');");
 		script.println("history.back();");
 		script.println("</script>");
 		script.close();
 		return ;
 	}
 	
 	petManDAO petManDAO = new petManDAO();
 	int ret = petManDAO.join(name, birth, type, kind, master, phone);
 	if (ret == 1){
 		PrintWriter script = response.getWriter();
 		script.println("<script>");
 		script.println("alert('등록이 완료되었습니다.');");
 		script.println("location.href = 'index.jsp';");
 		script.println("</script>");
 		script.close();
 		return ;
 	}
 	
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