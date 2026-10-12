<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h2>JSP Expression Language</h2>

<jsp:useBean id="student" class="model.StudentBean" scope="request"/>
<jsp:setProperty name="student" property="id" value="101"/>
<jsp:setProperty name="student" property="name" value="Achyuth"/>
<jsp:setProperty name="student" property="marks" value="88.5"/>

<p>ID: ${student.id}</p>
<p>Name: ${student.name}</p>
<p>Marks: ${student.marks}</p>
<p>Marks + 10 = ${student.marks + 10}</p>
<p>Marks greater than 80 = ${student.marks > 80}</p>
<p>Name: ${param.name}</p>
<p>Age: ${param.age}</p>

<% session.setAttribute("course", "MCA"); application.setAttribute("college", "MCA College"); %>

<p>Session course: ${sessionScope.course}</p>
<p>Application college: ${applicationScope.college}</p>
<p>Is name empty: ${empty param.name}</p>

</body>
</html>