<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<img alt="no" src="resources/img/ok.png" width="100">
	<br>
	<h3>북마크정보검색</h3>
	<form action="one">
		아이디 : <input type="text" name="id"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>북마크전체검색</h3>
	<a href="list"><button>전체 검색 요청</button></a>
	<hr>

	<h3>북마크 추가</h3>
	<form action="insert">
		아이디 : <input type="text" name="id"><br>
		이름 : <input type="text" name="name"><br>
		URL : <input type="text" name="url"><br>
		IMG : <input type="text" name="img"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>북마크 수정</h3>
	<form action="update">
		아이디 : <input name="id"><br>
		이름 : <input name="name"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>북마크 삭제</h3>
	<form action="delete">
		아이디 : <input name="id"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>