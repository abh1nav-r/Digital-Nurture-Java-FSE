import java.sql.*;

public class TransactionExample {

    static void transfer(Connection con, int senderId, int receiverId, double amount) {

        try {
            con.setAutoCommit(false);

            String debitQuery =
                    "UPDATE accounts SET balance = balance - ? WHERE id = ?";

            PreparedStatement debitStmt =
                    con.prepareStatement(debitQuery);

            debitStmt.setDouble(1, amount);
            debitStmt.setInt(2, senderId);

            debitStmt.executeUpdate();

            String creditQuery =
                    "UPDATE accounts SET balance = balance + ? WHERE id = ?";

            PreparedStatement creditStmt =
                    con.prepareStatement(creditQuery);

            creditStmt.setDouble(1, amount);
            creditStmt.setInt(2, receiverId);

            creditStmt.executeUpdate();

            con.commit();

            System.out.println("Transaction successful");

        } catch (Exception e) {
            try {
                con.rollback();
                System.out.println("Transaction failed");
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/bankdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(url, username, password);

            transfer(con, 1, 2, 500);

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}