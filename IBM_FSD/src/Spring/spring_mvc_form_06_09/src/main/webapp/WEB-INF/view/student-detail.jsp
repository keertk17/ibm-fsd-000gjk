<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
FirstName:${tempStudent.firstName}<br/> 
LastName:${tempStudent.lastName}<br/>
Email:${tempStudent.email}<br/>
Country:${tempStudent.country}<br/>
FavLang:${tempStudent.favlang}<br/>
OperatingSystem
<c:forEach items="${tempStudent.operatingSystem}" var="current">
<c:out value="${current}"/>
</c:forEach>
</body>
</html>