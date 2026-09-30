package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSelectExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "Nithya_369@bl"; // ✅ ensure this matches your MySQL root password

        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // Print success message
            System.out.println("Database connected successfully");

            // Close connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
