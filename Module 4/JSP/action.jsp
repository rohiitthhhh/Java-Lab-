<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>JSP Actions</h2>

<jsp:useBean id="student" class="model.StudentBean" scope="page"/>
<jsp:setProperty name="student" property="id" value="101"/>
<jsp:setProperty name="student" property="name" value="Achyuth"/>
<jsp:setProperty name="student" property="marks" value="88.5"/>

<p>ID: <jsp:getProperty name="student" property="id"/></p>
<p>Name: <jsp:getProperty name="student" property="name"/></p>
<p>Marks: <jsp:getProperty name="student" property="marks"/></p>

<jsp:include page="student.jsp"/>
</body>
</html>