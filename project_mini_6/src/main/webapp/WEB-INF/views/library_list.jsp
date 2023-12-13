<%@page import="com.multi.mini6.LibraryVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
ArrayList<LibraryVO> list = (ArrayList<LibraryVO>)request.getAttribute("list");
%>
<h3>전체 도서관 조회</h3>
<a href = "library_index.jsp">첫 페이지로</a>
	<table border="1" align="center">
		<tr bgcolor="pink" align="center">
			<td width=150>도서관 코드</td>
			<td width=300>도서관명</td>
			<td width=300>도서관주소</td>
			<td width=150>도서관전화번호</td>
		</tr>
		<%
		for(LibraryVO bag : list){
		%>
		<tr bgcolor="white" align="center">
			<td><%=bag.getLib_code() %></td>
			<td><a href = "library_one?lib_code=<%= bag.getLib_code()%>"><%=bag.getLib_name() %></a></td>
			<td><%=bag.getLib_address() %></td>
			<td><%=bag.getLib_tel() %></td>
		</tr>
		<% } %>
	</table>

</body>
</html>