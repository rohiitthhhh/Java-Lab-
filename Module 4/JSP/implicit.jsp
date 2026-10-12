
<%@ page contentType="text/html" %>
<%@ page errorPage="error.jsp" %>

<html>
<head>
    <title>JSP Implicit Objects</title>
</head>
<body>

<h2>JSP Implicit Objects Demo</h2>

<%-- 1. request object --%>
<h3>1. request</h3>
<p>Method: <%= request.getMethod() %></p>
<p>URI: <%= request.getRequestURI() %></p>
<p>Protocol: <%= request.getProtocol() %></p>
<p>Remote Host: <%= request.getRemoteHost() %></p>

<%-- 2. response object --%>
<h3>2. response</h3>
<p>Content Type: <%= response.getContentType() %></p>
<p>Character Encoding:
   <%= response.getCharacterEncoding() %></p>

<%-- 3. session object --%>
<h3>3. session</h3>
<%
    session.setAttribute("studentName", "Achyuth");
%>
<p>Session ID: <%= session.getId() %></p>
<p>Student Name:
   <%= session.getAttribute("studentName") %></p>
<p>Is New: <%= session.isNew() %></p>

<%-- 4. application object --%>
<h3>4. application</h3>
<%
    application.setAttribute("college", "MCA College");
%>
<p>Server Info: <%= application.getServerInfo() %></p>
<p>College:
   <%= application.getAttribute("college") %></p>

<%-- 5. out object --%>
<h3>5. out</h3>
<%
    out.println("<p>This is printed using out object</p>");
    out.println("<p>Buffer Size: " +
                out.getBufferSize() + " bytes</p>");
%>

<%-- 6. config object --%>
<h3>6. config</h3>
<p>Servlet Name: <%= config.getServletName() %></p>

<%-- 7. pageContext object --%>
<h3>7. pageContext</h3>
<%
    pageContext.setAttribute("dept", "IT");
%>
<p>Department:
   <%= pageContext.getAttribute("dept") %></p>

<%-- 8. exception object --%>
<h3>8. exception</h3>
<p>Available only in error pages
   (isErrorPage="true")</p>
<p>See error.jsp for usage</p>

</body>
</html>
