import java.sql.*;

class CRUD {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY, name VARCHAR(30))"
            );

            st.executeUpdate(
                "INSERT INTO student VALUES (1, 'Rohith')"
            );

            st.executeUpdate(
                "UPDATE student SET name='Arun' WHERE id=1"
            );

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name"));
            }

            st.executeUpdate("DELETE FROM student WHERE id=1");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
