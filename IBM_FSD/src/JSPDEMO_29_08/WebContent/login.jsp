<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
  <form method="get" action="response.jsp">
 
     Enter User Name <input type="text" name="user"> <br>
     Enter Password <input type="password" name="pass"> <br>
     <input type="submit"> 
   
  </form>
<c:if test="${ERROR != NULL }">
		<jsp:include page="error.jsp"></jsp:include>
	</c:if>

</body>
</html>