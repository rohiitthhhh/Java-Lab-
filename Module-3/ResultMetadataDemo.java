import java.sql.*;

class ResultMetadataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            ResultSetMetaData md = rs.getMetaData();

            int count = md.getColumnCount();

            for (int i = 1; i <= count; i++) {
                System.out.println("Column: " + md.getColumnName(i));
                System.out.println("Type: " + md.getColumnTypeName(i));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
