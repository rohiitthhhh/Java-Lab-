import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentCRUDServlet extends HttpServlet {
    private StudentDAO dao = new StudentDAO();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("delete".equals(action)) {
            try {
                dao.deleteStudent(Integer.parseInt(request.getParameter("id")));
            } catch (NumberFormatException e) {
                response.sendError(400, "Invalid ID");
                return;
            }
            response.sendRedirect("StudentCRUD");
            return;
        }

        List<Student> students = dao.getAllStudents();
        request.setAttribute("students", students);
        request.getRequestDispatcher("/MVC CRUD/index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            double marks = Double.parseDouble(request.getParameter("marks"));

            if (name == null || name.trim().isEmpty() || marks < 0 || marks > 100) {
                response.sendError(400, "Invalid details");
                return;
            }

            Student student = new Student(id, name.trim(), marks);

            if ("update".equals(request.getParameter("action"))) {
                dao.updateStudent(student);
            } else {
                dao.addStudent(student);
            }

            response.sendRedirect("StudentCRUD");
        } catch (NumberFormatException e) {
            response.sendError(400, "Invalid ID or marks");
        }
    }
}