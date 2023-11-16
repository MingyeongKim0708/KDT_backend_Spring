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
				url : "json.jsp",
				dataType : "json",
				success : function(json) {
					$("#result").html(json.tel)
				}//success
			})//ajax
		}) //b1
		
		$('#b2').click(function() {
			$.ajax({
				url : "json2.jsp",
				dataType : "json",
				success : function(array) {
					$("#result").html(array[0].tel)
				}//success
			})//ajax
		}) //b

		$('#b3').click(function() {
			$.ajax({
				url : "json2.jsp",
				success : function(array) {
					$("#result").empty()
				}//success
			})//ajax
		}) //b
	}) //$
	
</script>

</head>
<body>
	<button id="b1">json으로 받아오기</button>
	<button id="b2">json array 받아오기</button>
	<button id="b3">비우기</button>
	<hr color="red">
	<div id="result">ajax 통신 결과 들어가는 곳.</div>
</body>
</html>