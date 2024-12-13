package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {

    private static Connection connection;
    
    // Private constructor to prevent instantiation
    private SingletonConnection() {
    }

    // Method to get the single instance of the Connection
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/gestion_stock_ventes", // Database URL
                        "root", 
                        "" 
                );
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new SQLException("MySQL Driver not found.");
            }
        }
        return connection;
    }

    // Method to close the connection
    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
