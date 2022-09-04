<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="petMan.PetManDAO" %>
 <%@ page import="petMan.PetManDTO" %>
 <%@ page import="petMan.GetPetList" %>
 <%@ page import="java.io.PrintWriter" %>
 <%@ page import="java.util.ArrayList" %>
 
<% 
	GetPetList list = (GetPetList)request.getAttribute("list");
	int listSize = (int)list.getSize();
	ArrayList<String> nl = list.getNameList();
	ArrayList<String> bl = list.getBirthList();
	ArrayList<String> tl = list.getTypeList();
	ArrayList<String> kl = list.getKindList();
	ArrayList<String> ml = list.getMasterList();
	ArrayList<String> pl = list.getPhoneList();
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searched Pet</title>
</head>
<body>
	<h4>반려 동물 검색</h4>
	<table border=2>
		<tr>
			<td width = 100>반려동물이름</td>
			<td width = 100>반려동물생일</td>
			<td width = 100>반려동물종류</td>
			<td width = 100>반려동물품종</td>
			<td width = 100>보호자성함</td>
			<td width = 100>보호자연락처</td>
		</tr>
		<%
			for(int i = 0; i < listSize; i++)
			{
		%>
				<tr>
					<td><%=nl.get(i)%></td>
					<td><%=bl.get(i)%></td>
					<td><%=tl.get(i)%></td>
					<td><%=kl.get(i)%></td>
					<td><%=ml.get(i)%></td>
					<td><%=pl.get(i)%></td>
				</tr>
		<%
			}
		%>
	</table>
</body>
