<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>password</td>
			<td>qian</td>
			<td>操作</td>	
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>	
				<td>${user.name}</td>	
				<td>${user.password}</td>	
				<td>${user.qian}</td>
				<td>
					<a href="updata.jsp">修改</a>
					<a href="">删除</a>
				</td>					
			</tr>		
		</c:forEach>		
	</table>
</body>
</html>