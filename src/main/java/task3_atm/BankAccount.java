package task3_atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

    public class BankAccount {
        private String username;
        private double balance;

        public BankAccount(String username) throws SQLException {
            this.username = username;
            loadAccount();
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) throws SQLException {
            if (amount > 0) {
                balance += amount;
                updateAccount();
            }
        }

        public boolean withdraw(double amount) throws SQLException {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                updateAccount();
                return true;
            } else {
                return false;
            }
        }

        private void loadAccount() throws SQLException {
            try (Connection connection = DatabaseConfig.getConnection()) {
                String sql = "SELECT balance FROM accounts WHERE username = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    balance = resultSet.getDouble("balance");
                } else {
                    throw new SQLException("Account not found.");
                }
            }
        }

        private void updateAccount() throws SQLException {
            try (Connection connection = DatabaseConfig.getConnection()) {
                String sql = "UPDATE accounts SET balance = ? WHERE username = ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setDouble(1, balance);
                statement.setString(2, username);
                statement.executeUpdate();
            }
        }
    }


