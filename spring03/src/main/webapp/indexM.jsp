<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>영화CRUD</h1>
	<img alt="no" src="resources/img/ok.png" width="100">
	<br>
	<h3>영화정보검색</h3>
	<form action="oneM">
		아이디 : <input type="text" name="id"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>영화전체검색</h3>
	<a href="listM"><button>전체 검색 요청</button></a>
	<hr>

	<h3>영화 추가</h3>
	<form action="insertM">
		아이디 : <input type="text" name="id"><br>
		제목 : <input type="text" name="title"><br>
		평점 : <input type="text" name="rate"><br>
		개봉일 : <input type="text" name="date"><br>
		포스터 : <input type="text" name="img"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>영화 수정</h3>
	<form action="updateM">
		아이디 : <input name="id"><br>
		평점 : <input name="rate"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>영화 삭제</h3>
	<form action="deleteM">
		아이디 : <input name="id"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>