package atm;
import java.sql.SQLException;
public class mainatm {

        public static void main(String[] args) {
            try {
                BankAccount account = new BankAccount("user1");  // Username to log in
                ATM atm = new ATM(account);
                atm.start();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

