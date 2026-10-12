import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletLifeCycle extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("init() method called");
    }

    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("service() method called");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet Life Cycle</title></head>");
        out.println("<body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<p>init() - Called when servlet is " +
                    "first loaded</p>");
        out.println("<p>service() - Called for each " +
                    "client request</p>");
        out.println("<p>destroy() - Called when servlet " +
                    "is unloaded</p>");
        out.println("<p>Check server console for messages</p>");
        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
        System.out.println("destroy() method called");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>ServletLifeCycle</servlet-name>
    <servlet-class>ServletLifeCycle</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>ServletLifeCycle</servlet-name>
    <url-pattern>/lifecycle</url-pattern>
</servlet-mapping>
*/
