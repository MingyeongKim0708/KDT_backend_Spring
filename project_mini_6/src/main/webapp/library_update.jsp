<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>도서관 수정</h3>
	<hr color="red">
	<form action="library_insert">
		도서관 코드 <input name="lib_code" value="127058"><br> 
		도서관 이름 <input name="lib_name" value="2.28도서관"><br> 
		시/도 법정동 코드(대구) <input name="lib_region" value="27000"><br>
		시/군/구 법정동 코드(중구) <input name="lib_dtl_region" value="27110"><br>
		도서관 주소 <input name="lib_address" value="대구광역시 중구 2·28길 9"><br>
		도서관 전화번호 <input name="lib_tel" value="053-257-2280"><br>
		도서관 FAX번호 <input name="lib_fax" value="053-257-2284"><br>
		도서관 위도 <input name="lib_latitude" value="35.8592504"><br>
		도서관 경도 <input name="lib_longitude" value="128.5894055"><br>
		도서관 홈페이지 <input name="lib_homepage" value="http://library.daegu.go.kr/2281ib/index.do"><br>
		도서관 휴관일 <input name="lib_closed" value="매주 월요일 / 법정공휴일(일요일을 제외한 관공서 공휴일)."><br>
		도서관 운영시간 <input name="lib_operating_time" value="화~금 09:00~18:00 / 토일 09:00~17:00"><br>
		도서관 소장권수 <input name="lib_bookcount" value="51941"><br>

		<button>도서관 정보 insert</button>
	</form>
</body>
</html>