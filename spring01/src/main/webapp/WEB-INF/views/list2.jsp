<%@page import="com.multi.mvc01.ProductDTO"%>
<%@page import="com.multi.mvc01.BbsDTO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
	<%
		ArrayList<ProductDTO> list = (ArrayList<ProductDTO>) request.getAttribute("list");
	//작<-큰
	%>

	<table border="1" align="center">
		<tr bgcolor="pink" align="center">
			<td width=150>제품id</td>
			<td width=150>제품title</td>
			<td width=150>제품img</td>
		</tr>
		<%
			for (ProductDTO bag : list) {
		%>
		<tr bgcolor="lightblue" align="center">
			<td><%=bag.getId()%></td>
			<td><a href="one2?id=<%=bag.getId()%>"><%=bag.getTitle()%></a><br></td>
			<td><img src="resources/img/<%= bag.getImg() %>" width="150"></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>