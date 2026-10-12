import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentResponse extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student Form</title></head>");
        out.println("<body>");
        out.println("<h2>Student Registration Form</h2>");
        out.println("<form method='POST' action='studentResponse'>");

        out.println("Name: <input type='text' name='name'>" +
                    "<br><br>");
        out.println("Roll No: <input type='text' name='rollno'>" +
                    "<br><br>");
        out.println("Course: <input type='text' name='course'>" +
                    "<br><br>");
        out.println("Marks: <input type='text' name='marks'>" +
                    "<br><br>");

        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // Reading parameters from request
        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollno");
        String course = request.getParameter("course");
        String marks = request.getParameter("marks");

        // Generating HTML response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student Details</title></head>");
        out.println("<body>");
        out.println("<h2>Student Details</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Field</th><th>Value</th></tr>");
        out.println("<tr><td>Name</td><td>" +
                    name + "</td></tr>");
        out.println("<tr><td>Roll No</td><td>" +
                    rollNo + "</td></tr>");
        out.println("<tr><td>Course</td><td>" +
                    course + "</td></tr>");
        out.println("<tr><td>Marks</td><td>" +
                    marks + "</td></tr>");
        out.println("</table>");
        out.println("<br><a href='studentResponse'>Back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>StudentResponse</servlet-name>
    <servlet-class>StudentResponse</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>StudentResponse</servlet-name>
    <url-pattern>/studentResponse</url-pattern>
</servlet-mapping>
*/
