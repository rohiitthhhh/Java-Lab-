import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>HttpServlet</title></head>");
        out.println("<body>");
        out.println("<h2>HttpServlet Demo</h2>");
        out.println("<p>This servlet extends HttpServlet</p>");
        out.println("<p>It is HTTP-specific</p>");
        out.println("<p>Supports doGet(), doPost(), " +
                    "doPut(), doDelete()</p>");
        out.println("<p>Method used: " +
                    request.getMethod() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>MyHttpServlet</servlet-name>
    <servlet-class>MyHttpServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>MyHttpServlet</servlet-name>
    <url-pattern>/http</url-pattern>
</servlet-mapping>
*/
