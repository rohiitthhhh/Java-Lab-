
<%@ page isErrorPage="true" %>
<%@ page contentType="text/html" %>

<html>
<head>
    <title>Error Page</title>
</head>
<body>

<h2>Error Occurred!</h2>

<p>An error has occurred on the page.</p>

<%
    if (exception != null) {
%>
    <p><b>Error Type:</b>
       <%= exception.getClass().getName() %></p>
    <p><b>Message:</b>
       <%= exception.getMessage() %></p>
<%
    }
%>

<a href="directive.jsp">Go Back</a>

</body>
</html>
