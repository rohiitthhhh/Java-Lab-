import java.io.*;
import javax.servlet.*;

public class MyGenericServlet extends GenericServlet {

    public void service(ServletRequest request,
                        ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>GenericServlet</title></head>");
        out.println("<body>");
        out.println("<h2>GenericServlet Demo</h2>");
        out.println("<p>This servlet extends GenericServlet</p>");
        out.println("<p>It is protocol-independent</p>");
        out.println("<p>Uses service() method directly</p>");
        out.println("<p>Server: " +
                    getServletContext().getServerInfo() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>MyGenericServlet</servlet-name>
    <servlet-class>MyGenericServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>MyGenericServlet</servlet-name>
    <url-pattern>/generic</url-pattern>
</servlet-mapping>
*/
