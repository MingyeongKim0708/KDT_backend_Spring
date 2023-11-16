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
		$('#b1').click(function() {
			$.ajax({
				url : "test",
				//data : {},
				success : function (response) { //브라우저가 http 통신 결과를 받아온다
				
				} //success
			}) //ajax
		}) //b1
	}) //$
	
</script>

</head>
<body>
	<button id="b1">컴퓨터 구매 항목 확인</button>
	<hr color="red">
	<div id="result">ajax 통신 결과 들어가는 곳.</div>
</body>
</html>