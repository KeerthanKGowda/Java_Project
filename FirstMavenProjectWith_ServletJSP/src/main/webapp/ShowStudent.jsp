<%@page import="Studentobjectmodel.student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightpink">

	<%
	//student stud=(student)request.getAttribute("Student"); //using requestdispatcher
	
	student stud=(student)session.getAttribute("Student"); //using sendredirect with session 
	
	out.print(stud);
	
	%>

</body>
</html>