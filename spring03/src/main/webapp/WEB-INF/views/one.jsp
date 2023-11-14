<%@page import="com.multi.mvc03.BookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Bootstrap JS (optional) -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body bgcolor="yellow">
	<!-- model로 views/one.jsp까지 전달한 데이타를 받아서 꺼내서 출력 -->
	<%
		BookDTO dto = (BookDTO) request.getAttribute("dto");
	%>
	<div class="container mt-4">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">아이디</th>
					<th scope="col">이 름</th>
					<th scope="col">URL</th>
					<th scope="col">이미지</th>
					<!-- Added fourth column -->
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=dto.getId()%></td>
					<td><%=dto.getName()%></td>
					<td><%=dto.getUrl()%></td>
					<td><img src="resources/img/<%= dto.getImg() %>" width="300"></td>
					<!-- Added content for the fourth column -->
				</tr>
			</tbody>
		</table>
		<a href="list">
			<button class="btn btn-primary">북마크 목록으로</button>
		</a>

	</div>
</body>
</html>