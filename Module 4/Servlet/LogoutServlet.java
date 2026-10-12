import java.io.IOException;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet {
 protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
  HttpSession session=request.getSession(false); if(session!=null)session.invalidate(); response.sendRedirect("login");
 }
}