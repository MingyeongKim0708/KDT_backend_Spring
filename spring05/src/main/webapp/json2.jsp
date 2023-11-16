<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    JSONObject jobject1 = new JSONObject();
	jobject1.put("id","root"); // map --> HashMap put(key, value)
	jobject1.put("pw","1234");
	jobject1.put("tel","011");
	
    JSONObject jobject2 = new JSONObject();
	jobject2.put("id","admin");
	jobject2.put("pw","5678");
	jobject2.put("tel","012");
	
	JSONArray array = new JSONArray(); //대문자 JSONArray인 것 주의
	array.add(jobject1); // list --> 순서! ArrayList(검색, 수정 위주일 때 좋음), LinkedList(삽입, 삭제가 많을 경우 좋음) add(data)
	array.add(jobject2);
	
    out.println(array.toJSONString()); //{id:root, pw:1234, tel:011}
    %>
