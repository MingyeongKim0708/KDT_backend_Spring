<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table border="1">
        <tr style="background: yellow">
        <%-- ${출력하고 속성명} : 세션, 모델만 출력 가능 --%>
            <td width="100">영화제목</td>
            <td width="100">영화가격</td>
        </tr>
        <tr style="background: pink">
        <%-- 모델속성값 꺼내서 프린트 ${속성명} --%>
            <td>${vo.title}</td>
            <td>${vo.price}</td>
        </tr>
        <tr style="background: yellow">
            <td colspan="2"><a href ="#">문자인증받기</a></td>
        </tr>
</table>