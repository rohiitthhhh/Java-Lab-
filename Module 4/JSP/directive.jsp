<%-- import attribute --%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%-- contentType attribute --%>
<%@ page contentType="text/html; charset=UTF-8" %>

<%-- errorPage attribute --%>
<%@ page errorPage="error.jsp" %>

<%-- other page directive attributes --%>
<%@ page language="java" %>
<%@ page session="true" %>
<%@ page isThreadSafe="true" %>

<html>
<head>
    <title>JSP Directives</title>
</head>
<body>

<h2>JSP Directives Demo</h2>

<h3>1. page Directive</h3>

<p><b>import:</b> Used to import Java classes</p>
<%
    Date now = new Date();
    SimpleDateFormat sdf =
        new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
%>
<p>Current Date: <%= sdf.format(now) %></p>

<p><b>contentType:</b> text/html; charset=UTF-8</p>
<p><b>errorPage:</b> error.jsp (handles exceptions)</p>
<p><b>session:</b> true (session enabled)</p>

<h3>2. include Directive</h3>
<p>Includes content at translation time:</p>
<p><%-- <%@ include file="header.jsp" %> --%>
   Syntax: &lt;%@ include file="header.jsp" %&gt;</p>

<h3>3. taglib Directive</h3>
<p>Used to include tag libraries like JSTL:</p>
<p>Syntax: &lt;%@ taglib uri="..." prefix="c" %&gt;</p>

<hr>

<%-- Demonstrate error page by uncommenting below --%>
<%-- <%= 10/0 %> --%>

<p>Session ID: <%= session.getId() %></p>

</body>
</html>
