<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h3>상품수정요청이 되었습니다. 수정된 상품 개수 : ${result }개</h3>
<%
	int result = (int)request.getAttribute("result");
	if(result == 1){
		out.print("<h3>수정성공</h3>");
		out.print("<img src = resources/img/ok.png width=50px>");
	}else{
		out.print("<h3>수정실패</h3>");
		out.print("<img src = resources/img/no.png width=50px>");		
	}
%>
<br>
<a href = "product.jsp">등록화면으로</a>
</body>
</html>