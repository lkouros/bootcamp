
<%@page import="org.springframework.validation.ObjectError"%>
<%@ page import="com.candidjava.spring.bean.User"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.err {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<h2>Simple spring form handling</h2>
	<form action="createmessage" method="POST" modelAttribute="message">
		Sender id:<input type="text" name="sender_id" /><br> 
                Receiver <input type="text" name="receiver_id" /> <br> 
                Data<input type="text" name="data" /><br> 
        <%--      Date : <input type="date" name="date" /><br> --%>
                <input type="submit"/>
	</form>
</body>
</html>