<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>

<body>
	<table class="table table-bordered">
		<tr>
			<td colspan="100"><a href="/WEB-INF/view/add.jsp">酒店预订</a></td>
		</tr>
		<tr>
			<td colspan="100">
				<form action="/select" method="post">
					类型<select>
						<option>姓名</option>
					</select>
					内容：<input type="text" name="name">
					房价：<input type="text" name="p1">
						至 <input type="text" name="p2">
					备注：<input type="text" name="beiz">
					预定日期：<input type="date" name="t1">
					       至<input type="date" name="t2">
					<input type="submit" value="查询">
				</form>
			</td>
		</tr>
		<tr class="table-active">
			<td>预定日期</td>
			<td>姓名</td>
			<td>手机</td>
			<td>房型</td>
			<td>房价</td>
			<td>备注</td>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.riqi }</td>
				<td>${s.name }</td>
				<td>${s.phone }</td>
				<td>${s.tname }</td>
				<td>${s.tprice }</td>
				<td>${s.beiz }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>