<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "header.jsp" %>
<script type="text/javascript">
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url : "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json",
			data : {
				key : "4b4e5cbc0d26f56120f8c3aa06bd699b",
				targetDt : "20231209"
			},
			dataType : "json",
			success : function(json) {
				/* console.log(json) */
				console.log(json.boxOfficeResult.dailyBoxOfficeList[0].movieNm)
				console.log(json.boxOfficeResult.dailyBoxOfficeList[0].openDt)
				console.log(json.boxOfficeResult.dailyBoxOfficeList[0].rankOldAndNew)
				console.log(json.boxOfficeResult.dailyBoxOfficeList[0].scrnCnt)
			}
		})//ajax
	})//b1
	
	$('#b2').click(function() {
		$.ajax({
			url : "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json",
			data : {
				key : "4b4e5cbc0d26f56120f8c3aa06bd699b",
				targetDt : "20231209"
			},
			dataType : "json",
			success : function(json) {
				box_list = json.boxOfficeResult.dailyBoxOfficeList
				for (var i = 0; i < box_list.length; i++) {
					console.log(i+1+"위 : " + json.boxOfficeResult.dailyBoxOfficeList[i].movieNm)
				}
			}
		})//ajax
	})//b2
})
</script>

</head>
<body>
<button id="b1">박스오피스 가지고 오기(영화진흥위원회)</button>
<button id="b2">박스오피스 10개 가지고 오기(영화진흥위원회)</button>
</body>
</html>