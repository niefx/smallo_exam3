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
<form action="/add" method="post">
<h3>酒店预订</h3>
	<table class="table table-bordered">
		<tr>
			<td class="table-warning">预定日期</td>
			<td colspan="2"><input type="date" name="riqi"></td>
		</tr>
		<tr>
			<td class="table-warning">姓名：</td>
			<td><input type="text" name="name"></td>
			<td>手机：<input type="text" name="phone"></td>
		</tr>
		<tr>
			<td class="table-warning">房型：</td>
			<td><select name="tid" onchange="gb()">
				<option value="0">--请选择--</option>
			</select></td>
			<td>价格：<span id="price"></span></td>
		</tr>
		<tr>
			<td class="table-warning">备注：</td>
			<td><input type="text" name="beiz"></td>
		</tr>
		<tr>
			<td colspan="100" class="table-success"><input type="submit" value="确认预订"></td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
	//获取所有房型并追加
	$.ajax({
		url:"/seleroomtype",
		type:"post",
		success:function(result){
			for ( var i in result) {
				$("[name='tid']").append("<option> value='"+result[i].tid+"'"+result[i].tname+"</option>")
			}
		}
	})
	
	//根据房型改变获取并追加价格
	function gb() {
		var tid = $('[name="tid"]').val();
		$.post(
			"/seleoneroomtype",
			{tid:tid},
			function(result){
				$("#price").append("<input type='text' value='"+result.tprice+"'>");
			})
		
	}
</script>
</html>