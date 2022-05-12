<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Simple HTML Page</h2>
<%!int a,b,sum; %>
<%
	//int a;
	//int b;
	 //int sum = a+b;
	 a=10;
	 b=20;
	 sum = a+b;
	out.println("Welcome to JSP page");
	out.println("<font color='red'>Sum of two number is "+sum+"</font>");
%>
<font color='green'>Sum of two number is <%=sum %></font>
<b>Sum of <%=a %> and <%=b %> is <%=sum %></b>
</body>
</html>