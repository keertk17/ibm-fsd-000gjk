<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
firstName<form:input path="firstName"/><br/>
lastName<form:input path="lastName"/><br/>
email <form:input path="email"/><br/>
country<form:select path="country">
<form:options items="${student.countryOptions}" />
</form:select><br/>
favoritelanguage
java<form:radiobutton path="favlang" value="java"/>
c#<form:radiobutton path="favlang" value="c#"/>
python<form:radiobutton path="favlang" value="python"/>
<br/>
operatingSystem
linux<form:checkbox path="operatingSystem" value="linux"/>
mac <form:checkbox path="operatingSystem" value="mac"/>
windows<form:checkbox path="operatingSystem" value="windows"/><br/>
 <input type="submit">
</form:form>

</body>
</html>