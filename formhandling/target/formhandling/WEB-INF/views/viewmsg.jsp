<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>User Info</h2>

<strong>User Name </strong>: ${message.sender_id} <br>
<strong>Gender </strong> : ${message.receiver_id}<br>
<strong>Email </strong> : ${message.data}<br>
<strong>Email </strong> : ${message.date}<br>

</html>