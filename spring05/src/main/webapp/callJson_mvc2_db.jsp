<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	//jquery는 버튼 하나당 함수 하나, 요청 하나당 함수 하나
	//특정한 이벤트가 발생하기를 기다렸다가 이벤트가 발생하면 자동으로 함수를 실행 시켜주는 방식의 함수를 사용함
	//콜백함수
	$(function () {
		$('#b3').click(function() {
			$.ajax({
				url : "jsonbbs",
				success : function(array) {
					console.log(array);

					header = "<table><tr><td width=150>아이디</td><td width=150>제목</td><td width=150>내용</td><td width=150>작성자</td></tr>"
					$('#result').append(header);
					$(array).each(function(i, json) { //function(인덱스 저장변수, 하나씩 꺼내서 넣어줄 변수)
						id_value = json.id;
						title_value = json.title;
						content_value = json.content;
						writer_value = json.writer;
					
						mid = "<tr><td width=150>" + id_value + "</td><td width=150>" + title_value + "</td><td width=150>" + content_value + "</td><td width=150>" + writer_value + "</td></tr>"
					$('#result').append(mid);
					}) //for
					under = "</table>";
					$('#result').append(under);
				}//success
			})//ajax
		}) //b3
		
		
	}) //$
	
</script>

</head>
<body>
	<button id="b3">JSON으로 받아오기(list)</button>
	<hr color="red">
	<div id="result" style ="background : yellow; width : 800px; height : 200px;">ajax 통신 결과 들어가는 곳.<hr></div>
</body>
</html>