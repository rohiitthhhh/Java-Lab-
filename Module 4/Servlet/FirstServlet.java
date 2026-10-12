import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h2>First Servlet</h2>");
        request.setAttribute("message", "Hello from FirstServlet!");
        RequestDispatcher rd = request.getRequestDispatcher("/second");
        rd.include(request, response);
        out.println("<p>Back in FirstServlet</p></body></html>");
    }
}