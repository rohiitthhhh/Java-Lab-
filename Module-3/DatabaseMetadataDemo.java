import java.sql.*;

class DatabaseMetadataDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            DatabaseMetaData md = con.getMetaData();

            System.out.println("Database: " + md.getDatabaseProductName());
            System.out.println("Version: " + md.getDatabaseProductVersion());
            System.out.println("Driver: " + md.getDriverName());
            System.out.println("Transactions: " +
                               md.supportsTransactions());

            ResultSet rs = md.getTables(
                "studentdb", null, "%", new String[]{"TABLE"}
            );

            while (rs.next())
                System.out.println("Table: " + rs.getString("TABLE_NAME"));

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
