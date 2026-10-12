

<%@ page contentType="text/html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>JSTL Demo</title>
</head>
<body>

<h2>JSTL (Standard Tag Library) Demo</h2>

<%-- Set up data --%>
<c:set var="studentName" value="Achyuth" />
<c:set var="marks" value="88" />

<%-- 1. c:if - Conditional --%>
<h3>1. c:if</h3>

<c:if test="${marks >= 40}">
    <p>${studentName} has PASSED with ${marks} marks</p>
</c:if>

<c:if test="${marks < 40}">
    <p>${studentName} has FAILED</p>
</c:if>

<%-- 2. c:choose, c:when, c:otherwise - Switch --%>
<h3>2. c:choose / c:when / c:otherwise</h3>

<c:choose>
    <c:when test="${marks >= 90}">
        <p>Grade: A+ (Outstanding)</p>
    </c:when>
    <c:when test="${marks >= 80}">
        <p>Grade: A (Excellent)</p>
    </c:when>
    <c:when test="${marks >= 70}">
        <p>Grade: B (Good)</p>
    </c:when>
    <c:when test="${marks >= 60}">
        <p>Grade: C (Average)</p>
    </c:when>
    <c:otherwise>
        <p>Grade: F (Fail)</p>
    </c:otherwise>
</c:choose>

<%-- 3. c:forEach - Iteration --%>
<h3>3. c:forEach</h3>

<p>Subjects:</p>

<%
    String[] subjects = {
        "Java", "DBMS", "OS", "Networks", "Web Tech"
    };
    request.setAttribute("subjects", subjects);

    int[] subjectMarks = {85, 90, 78, 92, 88};
    request.setAttribute("subjectMarks", subjectMarks);
%>

<table border="1" cellpadding="5">
    <tr><th>No.</th><th>Subject</th></tr>
    <c:forEach var="subject" items="${subjects}"
               varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${subject}</td>
        </tr>
    </c:forEach>
</table>

<br>

<%-- c:forEach with numbers --%>
<p>Numbers 1 to 5:</p>
<c:forEach var="i" begin="1" end="5" step="1">
    ${i}
</c:forEach>

<%-- 4. c:out - Output --%>
<h3>4. c:out</h3>
<p>Student: <c:out value="${studentName}" /></p>
<p>Marks: <c:out value="${marks}" /></p>

</body>
</html>

<%--
Note: Requires JSTL library.
Add jstl-1.2.jar to WEB-INF/lib/
Download from: https://mvnrepository.com/artifact/javax.servlet/jstl
--%>
