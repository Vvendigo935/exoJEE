<%@ page import="java.util.List" %>
<%@ page import="org.example.exo2jee.entity.Person" %>
<jsp:useBean id="persons" type="java.util.List" scope="request"/>
<jsp:useBean id="name" type="java.lang.String" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Persons</title>
  <link rel="stylesheet" type="text/css" href="style/style.css">
</head>

<body>

<h1>Persons</h1>

<% for (Object p: persons) {%>
<p><%= p%></p>
<% } %>
<p></p>

</body>
</html>
