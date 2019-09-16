<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="pack.MyConnectionFactory"%>
    <%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  <h2><font color="black">Hello, ${param.username}!</font></h2>-->
<jsp:useBean id="u" class="pack.Validate" scope="request">


  <jsp:setProperty name="u" property="*" />
  
  </jsp:useBean>
  You entered user name as <jsp:getProperty name="u" property="user" /> <br>

  You entered user password as <jsp:getProperty name="u" property="pass" /> <br>

  <br>

 <!--  You are a <%= u.validate("Admin", "Admin") %> user.  <br>

  <b>Thank You</b>--> 
  <%
  MyConnectionFactory factory = null;
  Connection connection=MyConnectionFactory.getMySqlConnectionFormMydb();
  Statement statement = connection.createStatement();
  ResultSet rs = statement.executeQuery("select * from login");
  int flag= 0;
  while(rs.next()){
  	if(u.validate(rs.getString("user"), rs.getString("pass"))=="VALID"){
  		flag = 1;
  	}
  }
  if(flag == 1){
  	RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
  	rd.forward(request, response);
  }else{
  	request.setAttribute("ERROR", "Invalid user");
  	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
  	rd.forward(request, response);
  }
  %>
  
 
</body>
</html>