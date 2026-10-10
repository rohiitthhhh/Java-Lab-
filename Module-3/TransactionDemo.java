import java.sql.*;

class TransactionDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root", "Rohith@123"
            );

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                "UPDATE accounts SET balance=balance-500 WHERE id=1"
            );

            st.executeUpdate(
                "UPDATE accounts SET balance=balance+500 WHERE id=2"
            );

            con.commit();
            System.out.println("Transaction successful");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
