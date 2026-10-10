import java.sql.*;
import java.util.Scanner;

class PreparedDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            Statement st = con.createStatement();
            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(30))"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?)"
            );

            System.out.print("Enter ID: ");
            ps.setInt(1, sc.nextInt());

            System.out.print("Enter name: ");
            ps.setString(2, sc.next());

            ps.executeUpdate();
            System.out.println("Record inserted");

            PreparedStatement search = con.prepareStatement(
                "SELECT * FROM student WHERE id=?"
            );

            System.out.print("Enter ID to search: ");
            search.setInt(1, sc.nextInt());

            ResultSet rs = search.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
