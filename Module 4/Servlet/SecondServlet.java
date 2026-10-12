import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        // Get attribute set by FirstServlet
        String message =
            (String) request.getAttribute("message");

        out.println("<hr>");
        out.println("<h3>Second Servlet Output</h3>");
        out.println("<p>Message from FirstServlet: " +
                    message + "</p>");
        out.println("<p>SecondServlet processed the " +
                    "request successfully</p>");
        out.println("<hr>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>SecondServlet</servlet-name>
    <servlet-class>SecondServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>SecondServlet</servlet-name>
    <url-pattern>/second</url-pattern>
</servlet-mapping>
*/
