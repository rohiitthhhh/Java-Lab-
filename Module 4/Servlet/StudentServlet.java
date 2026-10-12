import java.io.*;
import javax.servlet.http.*;
public class StudentServlet extends HttpServlet {
 protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
  response.setContentType("text/html"); PrintWriter out=response.getWriter();
  out.println("<h2>Student Information</h2><table border='1'>");
  out.println("<tr><th>Roll No</th><th>Name</th><th>Course</th><th>Marks</th></tr>");
  out.println("<tr><td>101</td><td>Achyuth</td><td>MCA</td><td>88.5</td></tr>");
  out.println("<tr><td>102</td><td>Naveen</td><td>MCA</td><td>92.0</td></tr>");
  out.println("<tr><td>103</td><td>Priya</td><td>MCA</td><td>85.0</td></tr></table>");
 }
}