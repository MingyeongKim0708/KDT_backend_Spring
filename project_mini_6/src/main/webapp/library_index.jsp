<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>도서관 검색</h3>
	<form action="library_one">
		아이디 : <input type="text" name="id"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>도서관 리스트</h3>
	<a href="library_list"><button>전체 검색 요청</button></a>
	<hr>

	<h3>도서관 정보 추가 페이지로 이동 (완료)</h3>
	<a href="library_insert.jsp"><button>도서관 정보 추가</button></a>
	<hr>

	<h3>도서관 정보 수정 페이지로 이동</h3>


	<h3>도서관 정보 삭제</h3>
	<form action="library_delete">
		도서관코드 : <input name="lib_code"><br>
		<button type="submit">서버로 전송</button>
	</form>
</body>
</html>