import java.io.*;
import javax.servlet.http.*;

public class ErrorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String action = request.getParameter("action");

        if ("arithmetic".equals(action)) {
            int zero = 0;
            int result = 10 / zero;
            response.getWriter().println(result);
        } else if ("null".equals(action)) {
            String value = null;
            value.length();
        } else if ("404".equals(action)) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Page not found");
        } else {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body><h2>Error Handling</h2>");
            out.println("<a href='error?action=arithmetic'>ArithmeticException</a><br>");
            out.println("<a href='error?action=null'>NullPointerException</a><br>");
            out.println("<a href='error?action=404'>404 Error</a>");
            out.println("</body></html>");
        }
    }
}