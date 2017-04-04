<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<center>
<c:choose>
<c:when test="${sessionScope.mvo==null }">
<h3><font color=olive>Hello! 이곳은 MySite입니다!</font></h3>
원하는 웹페이지를 추가하여 쉽고 편하게 즐기세요!<br>
회원가입을 원하시는분은 97crimsonkim@gmail.com 으로 원하시는  id,password와 비밀번호를 전송바랍니다
<br>
<form method="post" action="${pageContext.request.contextPath }/DispatcherServlet">
<input type="hidden" name="command" value="login">
ID:<input type="text" name="id">
<input type="password" name="password">
<input type="submit" value="login">	
</form>
</c:when>
<c:otherwise>
<h3>${sessionScope.mvo.name } 님 안녕하세요!</h3>
<a href="${pageContext.request.contextPath }/DispatcherServlet?command=logout">로그아웃하기</a>
</c:otherwise>
</c:choose>
</center>