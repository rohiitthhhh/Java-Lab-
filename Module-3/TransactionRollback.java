import java.sql.*;

class TransactionRollback {
    public static void main(String[] args) {
        Connection con = null;

        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            con.setAutoCommit(false);

            PreparedStatement p1 = con.prepareStatement(
                "UPDATE accounts SET balance=balance-500 WHERE id=1 AND balance>=500"
            );

            int rows = p1.executeUpdate();

            if (rows != 1)
                throw new SQLException("Insufficient balance or account missing");

            PreparedStatement p2 = con.prepareStatement(
                "UPDATE accounts SET balance=balance+500 WHERE id=2"
            );

            if (p2.executeUpdate() != 1)
                throw new SQLException("Destination account missing");

            con.commit();
            System.out.println("Transfer successful");
        } catch (Exception e) {
            System.out.println(e);

            if (con != null) {
                try {
                    con.rollback();
                    System.out.println("Transaction rolled back");
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
