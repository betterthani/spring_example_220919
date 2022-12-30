<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JFTL fmt 라이브러리</title>
</head>
<body>

	<c:set var="num" value="12345678" />
	<h1>숫자 출력</h1>
	<fmt:formatNumber value="${num}" />
	
	<h1>Type</h1>
	숫자 : <fmt:formatNumber value="${num}" type="number" /><br>
	숫자 3자리마다 쉼표 제거 : <fmt:formatNumber value="${num}" type="number" groupingUsed="false" /><br>
	
</body>
</html>