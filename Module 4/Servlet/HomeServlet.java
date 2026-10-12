import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Check if user is logged in
        if (session == null ||
            session.getAttribute("user") == null) {

            out.println("<html>");
            out.println("<head><title>Access Denied</title></head>");
            out.println("<body>");
            out.println("<h2>Access Denied!</h2>");
            out.println("<p>Please login first</p>");
            out.println("<a href='login'>Login</a>");
            out.println("</body>");
            out.println("</html>");
        }
        else {
            String user =
                (String) session.getAttribute("user");

            out.println("<html>");
            out.println("<head><title>Home</title></head>");
            out.println("<body>");
            out.println("<h2>Welcome, " + user + "!</h2>");
            out.println("<p>This is a protected page</p>");
            out.println("<p>Only authenticated users " +
                        "can see this</p>");
            out.println("<a href='logout'>Logout</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>HomeServlet</servlet-name>
    <servlet-class>HomeServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>HomeServlet</servlet-name>
    <url-pattern>/home</url-pattern>
</servlet-mapping>
*/
