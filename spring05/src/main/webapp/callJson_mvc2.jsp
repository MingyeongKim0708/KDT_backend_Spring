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
				url : "string",
				success : function(string) {
					alert(string);
					$('#result').text(string);
					//winner이면 winner이미지를, 아니면 loser 이미지 넣기
					let img = "<img src = 'resources/img/no.png' width=200>";
					if(string == 'winner'){
						img= "<img src = 'resources/img/ok.png' width=200>";
					}
					$('#result').append(img);
				}//success
			})//ajax
		}) //b1
		
		$('#b2').click(function() {
			$.ajax({
				url : "json1",
				success : function(json) {
					//alert(json);
					//$('#result').text(json);
					//json을 프린트할 일이 있으면 브라우저 콘솔창 이용
					console.log(json);
					
					id_value = json.id;
					title_value = json.title;
					content_value = json.content;
					writer_value = json.writer;
					
					data = id_value + " " + title_value + " " + content_value + " " + writer_value;
					$('#result').append(data + "<br>");
				}//success
			})//ajax
		}) //b2
		
		
		$('#b3').click(function() {
			$.ajax({
				url : "json2",
				success : function(array) {
					
					console.log(array); //5

					//for each
					$(array).each(function(i, json) { //function(인덱스 저장변수, 하나씩 꺼내서 넣어줄 변수)
						id_value = json.id;
						title_value = json.title;
						content_value = json.content;
						writer_value = json.writer;
					
					data = id_value + " " + title_value + " " + content_value + " " + writer_value;
					$('#result').append(data + "<br>");
					})
				}//success
			})//ajax
		}) //b3
		
		
	}) //$
	
</script>

</head>
<body>
	<button id="b1">JSON으로 받아오기(String)</button>
	<button id="b2">JSON으로 받아오기(json)</button>
	<button id="b3">JSON으로 받아오기(array)</button>
	<hr color="red">
	<div id="result" style ="background : yellow; width : 800px; height : 200px;">ajax 통신 결과 들어가는 곳.<hr></div>
</body>
</html>