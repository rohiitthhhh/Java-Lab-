import java.sql.*;
import java.util.*;

public class StudentDAO {
    private String url = "jdbc:mysql://localhost:3306/college";
    private String user = "jdbcuser";
    private String password = "Achu@123";

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    public void addStudent(Student s) {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES (?, ?, ?)");
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setDouble(3, s.getMarks());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try {
            Connection con = getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                list.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getDouble("marks")));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void updateStudent(Student s) {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE student SET name=?, marks=? WHERE id=?");
            ps.setString(1, s.getName());
            ps.setDouble(2, s.getMarks());
            ps.setInt(3, s.getId());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteStudent(int id) {
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM student WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}