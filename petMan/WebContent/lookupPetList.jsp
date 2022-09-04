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
	
	GetPetList list2 = (GetPetList)request.getAttribute("list2");
	int listSize2 = (int)list.getSize();
	ArrayList<String> nl2 = list2.getNameList();
	ArrayList<String> bl2 = list2.getBirthList();
	ArrayList<String> tl2 = list2.getTypeList();
	ArrayList<String> kl2 = list2.getKindList();
	ArrayList<String> ml2 = list2.getMasterList();
	ArrayList<String> pl2 = list2.getPhoneList();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lookup Pet</title>
</head>
<body>
	<h4>최근 등록순 정렬 </h4>
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
			for(int i = listSize - 1; i >= 0; i--)
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
	</table><br><br>
	<h4>반려 동물 이름 정렬 </h4>
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
			for(int i = 0; i < listSize2; i++)
			{
		%>
				<tr>
					<td><%=nl2.get(i)%></td>
					<td><%=bl2.get(i)%></td>
					<td><%=tl2.get(i)%></td>
					<td><%=kl2.get(i)%></td>
					<td><%=ml2.get(i)%></td>
					<td><%=pl2.get(i)%></td>
				</tr>
		<%
			}
		%>
	</table>
</body>
</html>