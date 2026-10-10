import java.sql.*;
import java.util.Scanner;

class JDBCExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            System.out.print("Enter student ID: ");
            int id = Integer.parseInt(sc.nextLine());

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM student WHERE id=?"
            );

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
                System.out.println(rs.getString("name"));
            else
                System.out.println("Student not found");

            con.close();
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
