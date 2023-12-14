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
				box_list = json.boxOfficeResult.dailyBoxOfficeList
				for (let i = 0; i < box_list.length; i++) {
					let rank = box_list[i].rank
					let movieCd = box_list[i].movieCd
					let movieNm = box_list[i].movieNm
					let scrnCnt = box_list[i].scrnCnt
					let openDt = box_list[i].openDt
					
					//location.href = "movie?rank=" + rank + "&movieCd=" + movieCd + "&movieNm=" + movieNm + "&scrnCnt=" + scrnCnt + "&openDt=" + openDt
					
					$.ajax({
						url : "movie",
						data : {
							rank : rank,
							movieCd : movieCd,
							movieNm : movieNm,
							scrnCnt : scrnCnt,
							openDt : openDt
						},
						success : function(x) {
							console.log(x)
						}
					})//ajax
				}//for
			}//success
		})//ajax
	})//b1
})
</script>

</head>
<body>
<button id="b1">박스오피스 저장하기(영화진흥위원회)</button>
<hr color = "red">
<div id="result" style = "background: pink; width : 600px; height : 500px;"></div>
</body>
</html>