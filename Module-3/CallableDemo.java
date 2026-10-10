import java.sql.*;

class CallableDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            CallableStatement cs =
                con.prepareCall("{call showStudents()}");

            ResultSet rs = cs.executeQuery();

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
