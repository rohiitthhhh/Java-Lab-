import java.sql.*;

class ResultNavigation {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            Statement st = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            if (rs.next())
                System.out.println("Next: " + rs.getString("name"));

            if (rs.first())
                System.out.println("First: " + rs.getString("name"));

            if (rs.last())
                System.out.println("Last: " + rs.getString("name"));

            if (rs.previous())
                System.out.println("Previous: " + rs.getString("name"));

            if (rs.absolute(1))
                System.out.println("Absolute: " + rs.getString("name"));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
