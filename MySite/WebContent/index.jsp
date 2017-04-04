<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MySite</title>
</head>
<body>
<!-- ${pageContext.request.contextPath } -->
<jsp:forward page="DispatcherServlet?command=clientSite"/>

<!-- <center>
<iframe id=myIFrame width="60%" height=700; frameborder=1 src="http://appft.uspto.gov/netahtml/PTO/search-bool.html"></iframe>
</center><br>
<center>미국특허청</center>
<br>
<center>
<iframe id=myIFrame style='width:60%' height=700; frameborder=1 src="http://comic.naver.com/webtoon/weekdayList.nhn?week=mon"></iframe>
</center><br>
<center>월요웹툰</center><br>
<center>
<iframe id=myIFrame style='width:60%' height=700; frameborder=1 src="http://dcinside.com"></iframe>
</center>
 -->
 </body>
</html>