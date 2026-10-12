import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html>");
        out.println("<head><title>GET Request</title></head>");
        out.println("<body>");
        out.println("<h2>GET Request Received</h2>");

        if (name != null) {
            out.println("<p>Hello, " + name + "!</p>");
            out.println("<p>Data sent via URL (visible)</p>");
        }

        out.println("<h3>GET Form</h3>");
        out.println("<form method='GET' action='request'>");
        out.println("Name: <input type='text' name='name'>");
        out.println("<input type='submit' value='GET Submit'>");
        out.println("</form>");

        out.println("<h3>POST Form</h3>");
        out.println("<form method='POST' action='request'>");
        out.println("Name: <input type='text' name='name'>");
        out.println("<input type='submit' value='POST Submit'>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html>");
        out.println("<head><title>POST Request</title></head>");
        out.println("<body>");
        out.println("<h2>POST Request Received</h2>");
        out.println("<p>Hello, " + name + "!</p>");
        out.println("<p>Data sent in body (not visible " +
                    "in URL)</p>");
        out.println("<a href='request'>Go Back</a>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doHead(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        // HEAD returns headers only, no body
        response.setContentType("text/html");
        response.setHeader("X-Custom", "HeadResponse");
        response.setIntHeader("Content-Length", 0);
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>RequestServlet</servlet-name>
    <servlet-class>RequestServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>RequestServlet</servlet-name>
    <url-pattern>/request</url-pattern>
</servlet-mapping>
*/
