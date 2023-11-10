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
		ArrayList<BbsDTO2> list = (ArrayList<BbsDTO2>) request.getAttribute("list");
	//작<-큰
	for (BbsDTO2 bag : list) {
	%>
	게시판 id	<%=bag.getId()%><br>
	<a href="one?id=<%=bag.getId()%>">게시판 title  <%=bag.getTitle()%></a><br>
	게시판 writer	<%=bag.getWriter()%>
	<hr color="red">
	<%
		}
	%>


</body>
</html>