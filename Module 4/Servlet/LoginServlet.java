import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Login Page</title></head>");
        out.println("<body>");
        out.println("<h2>Login</h2>");
        out.println("<form method='POST' action='login'>");
        out.println("Username: <input type='text' " +
                    "name='username'><br><br>");
        out.println("Password: <input type='password' " +
                    "name='password'><br><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Simple authentication check
        if ("admin".equals(username) &&
            "admin123".equals(password)) {

            HttpSession session = request.getSession();
            session.setAttribute("user", username);

            response.sendRedirect("home");
        }
        else {
            out.println("<html>");
            out.println("<head><title>Login Failed</title></head>");
            out.println("<body>");
            out.println("<h2>Login Failed!</h2>");
            out.println("<p>Invalid username or password</p>");
            out.println("<a href='login'>Try Again</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>LoginServlet</servlet-name>
    <servlet-class>LoginServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>LoginServlet</servlet-name>
    <url-pattern>/login</url-pattern>
</servlet-mapping>
*/
