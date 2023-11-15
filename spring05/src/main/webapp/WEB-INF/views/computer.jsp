<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table border="1">
    <thead>
        <tr style="background: lime">
            <th width="100">항목명</th>
            <th width="100">가격</th>
        </tr>
    </thead>
    <tbody>
        <tr style="background: pink">
        <%-- ${출력하고 속성명} : 세션, 모델만 출력 가능 --%>
            <td>${vo.com}</td>
            <td>${vo.price}</td>
        </tr>
        <tr style="background: pink">
        <%-- 모델속성값 꺼내서 프린트 ${속성명} --%>
            <td>${vo.mouse}</td>
            <td>${vo.price2}</td>
        </tr>
        <tr style="background: yellow">
            <td>총합</td>
            <td>${total}</td>
        </tr>
    </tbody>
</table>