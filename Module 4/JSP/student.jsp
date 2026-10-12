

<%@ page contentType="text/html" %>

<html>
<head>
    <title>Student Information - JSP</title>
</head>
<body>

<h2>Student Information (JSP Page)</h2>

<%-- JSP Scriptlet --%>
<%
    String name = "Achyuth";
    int rollNo = 23;
    String course = "MCA";
    double marks = 88.5;
%>

<table border="1" cellpadding="5">
    <tr><th>Field</th><th>Value</th></tr>
    <tr><td>Name</td><td><%= name %></td></tr>
    <tr><td>Roll No</td><td><%= rollNo %></td></tr>
    <tr><td>Course</td><td><%= course %></td></tr>
    <tr><td>Marks</td><td><%= marks %></td></tr>
</table>

<hr>

<h3>JSP Life Cycle</h3>

<p>1. <b>Translation</b> - JSP is converted to a
   Servlet (.java file)</p>
<p>2. <b>Compilation</b> - The Servlet is compiled
   to a .class file</p>
<p>3. <b>Execution</b> - The compiled Servlet handles
   requests</p>

<p>Current Time: <%= new java.util.Date() %></p>
<p>Page accessed: <%= application.getServerInfo() %></p>

</body>
</html>
