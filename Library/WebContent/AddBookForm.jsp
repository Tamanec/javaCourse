<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="addBookBean" class="com.epam.edu.jspBeans.AddBookBean" scope="request">
    <jsp:setProperty name="AddBookBean" property="*"/>
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Insert title here</title>
</head>
<body>
	<form action="AddBookServlet">
		<div>
			<label for="name">Название:</label>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<input type="submit" value="Добавить" />
		</div>
	</form>
</body>
</html>