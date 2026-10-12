import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Read existing cookies
        Cookie[] cookies = request.getCookies();
        String savedName = null;
        String savedColor = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("username".equals(c.getName()))
                    savedName = c.getValue();
                if ("color".equals(c.getName()))
                    savedColor = c.getValue();
            }
        }

        out.println("<html>");
        out.println("<head><title>Cookie Demo</title></head>");
        out.println("<body>");
        out.println("<h2>Cookie Demo</h2>");

        if (savedName != null) {
            out.println("<p>Welcome back, " +
                        savedName + "!</p>");
            out.println("<p>Your favorite color: " +
                        savedColor + "</p>");
        }

        out.println("<h3>Set Preferences</h3>");
        out.println("<form method='POST' action='cookie'>");
        out.println("Name: <input type='text' name='name'" +
                    " value='" +
                    (savedName != null ? savedName : "") +
                    "'><br><br>");
        out.println("Favorite Color: <input type='text' " +
                    "name='color' value='" +
                    (savedColor != null ? savedColor : "") +
                    "'><br><br>");
        out.println("<input type='submit' " +
                    "value='Save Preferences'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String color = request.getParameter("color");

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie colorCookie = new Cookie("color", color);

        // Set cookie to expire in 1 hour
        nameCookie.setMaxAge(3600);
        colorCookie.setMaxAge(3600);

        // Add cookies to response
        response.addCookie(nameCookie);
        response.addCookie(colorCookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Cookie Saved</title></head>");
        out.println("<body>");
        out.println("<h2>Preferences Saved!</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Color: " + color + "</p>");
        out.println("<a href='cookie'>Go Back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}

/*
web.xml configuration:

<servlet>
    <servlet-name>CookieServlet</servlet-name>
    <servlet-class>CookieServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>CookieServlet</servlet-name>
    <url-pattern>/cookie</url-pattern>
</servlet-mapping>
*/
