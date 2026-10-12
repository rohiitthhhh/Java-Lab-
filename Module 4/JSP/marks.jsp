
<%@ page contentType="text/html" %>

<html>
<head>
    <title>Student Marks</title>
</head>
<body>

<h2>Student Marks Calculator</h2>

<%-- JSP Declarations --%>
<%!
    String studentName = "Achyuth";
    int rollNo = 23;

    int[] marks = {85, 90, 78, 92, 88};

    String[] subjects = {
        "Java", "DBMS", "OS", "Networks", "Web Tech"
    };

    int calculateTotal(int[] m) {
        int total = 0;
        for (int mark : m) {
            total += mark;
        }
        return total;
    }

    double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    String getGrade(double avg) {
        if (avg >= 90) return "A+";
        if (avg >= 80) return "A";
        if (avg >= 70) return "B";
        if (avg >= 60) return "C";
        return "F";
    }
%>

<%-- JSP Expressions --%>
<p><b>Name:</b> <%= studentName %></p>
<p><b>Roll No:</b> <%= rollNo %></p>

<table border="1" cellpadding="5">
    <tr><th>Subject</th><th>Marks</th></tr>
    <%
        for (int i = 0; i < subjects.length; i++) {
    %>
    <tr>
        <td><%= subjects[i] %></td>
        <td><%= marks[i] %></td>
    </tr>
    <%
        }
    %>
</table>

<br>
<p><b>Total:</b> <%= calculateTotal(marks) %>
   / <%= marks.length * 100 %></p>
<p><b>Average:</b>
   <%= String.format("%.2f",
       calculateAverage(
           calculateTotal(marks), marks.length)) %>
</p>
<p><b>Grade:</b>
   <%= getGrade(calculateAverage(
       calculateTotal(marks), marks.length)) %>
</p>

</body>
</html>
