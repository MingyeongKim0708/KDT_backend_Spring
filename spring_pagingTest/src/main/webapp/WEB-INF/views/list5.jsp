<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function() {
	$('.pages').click(function() {
		$.ajax({
			url : "list0", //리스트 가져오기
			data : {
				page : $(this).text()
			},
			success : function(table) {
				$('#result').html(table)
			}
		})
	})
})
</script>
</head>
<body>
	<hr color="red">
	전체 게시물 수 : ${count }개
	<br> 전체 페이지 수 : ${pages }개
	<br>
	<%
		int pages = (int) request.getAttribute("pages"); //int <-- Object
	for (int p = 1; p <= pages; p++) {
	%>
		<button style="background: lime;" class="pages"><%=p%></button>
	<%
		}
	%>
	<hr color="red">
	<div id="result">
	<table border="1">
		<tr>
			<td>행번호</td>
			<td>ID</td>
			<td>이메일</td>
			<td>차이름</td>
		</tr>

		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.row_no }</td>
				<td>${vo.id }</td>
				<td>${vo.email }</td>
				<td>${vo.car }</td>
			</tr>
		</c:forEach>

	</table>
	</div>
</body>
</html>