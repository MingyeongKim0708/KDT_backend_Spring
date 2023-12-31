<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
<script type="text/javascript" src="resources/js/stomp.js"></script>
<script type="text/javascript"
	src="resources/js/webSocketSendToUserApp.js"></script>
	<script type="text/javascript">
	var stompClient = null;
	
	function connect() {
		//1. 전화기 역할을 하는 Socket객체 생성
		var socket = new SockJS("${pageContext.request.contextPath}/chat2")
		//2. 위 Socket을 가지고 서버와 통신할 수 있는 StompClient 객체
		stompClient = Stomp.over(socket)
		//3. 연결하기. + 데이터가 도착했을 때 자동으로 호출되는 함수를 하나 정의
		stompClient.connect({}, function(frame) { 
			// "{body: ~~~}"
			console.log("연결됨" + frame)
			//stompClient를 이용해서 특정한 채팅방에 가입
			stompClient.subscribe("/topic/messages3", function(messageOutput) {
				console.log(JSON.parse(messageOutput.body))
				json = JSON.parse(messageOutput.body)
				$('#response').append(json.menu + "<br>")
			})
		})
	}
	function disconnect() {
		if (stompClient != null) {
			stompClient.disconnect()
			console.log("연결 끊어짐")
		}
	}
	function sendMessage() {
		//누가
		var from = document.getElementById("from").value
		//var from = $('#from').val()
		//입력한 내용
		var text = document.getElementById("text").value
		//stompClient.send()
		console.log("from : " + from)
		stompClient.send("/app/chat3", {}, JSON.stringify({
			"from" : from,
			"text" : text
		}))
		$('#text').val("") // send하고 나면 리셋하는 역할
	}
	</script>
</head>
<body onload="disconnect()"> <!-- 사이트에 접속하면 한번 무조건 끊음 -->
${pageContext.request.contextPath}
<br><br>
	<div>
		<h3>책추천</h3>
		<hr color = "red">
		<img src = "resources/img/chat3.png" wiedth="500" height="200">
		<hr color = "red">
		<div class="input-group mb-3 input-group-lg">
			<span class="input-group-text">닉네임 입력:</span> 
			<input type="text" class="form-control" id="from" value="guest">
		</div>
		<br />
		<div>
			<button id="connect" onclick="connect();" class="btn btn-danger" style="width:200px">Connect</button>
			<button id="disconnect" disabled="disabled" onclick="disconnect();" style="width:200px" class="btn btn-danger">Disconnect</button>
		</div>
		<br />
		<div id="conversationDiv">
			<input type="text" id="text" placeholder="번호를 선택해주세요" class="form-control" />
			<button id="sendMessage" onclick="sendMessage();"
				class="btn btn-primary">Send</button>
			<div>챗봇 >> )안녕하세요 무슨책을 읽을지 모르시겠다면 1번을 입력해주세요 2)아니요</div>
				
			<p id="response" class="alert alert-success">
			</p>
		</div>
	</div>
</body>
</html>