import java.sql.*;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/voterdb";
    private static final String USER = "root";   // your MySQL username
    private static final String PASS = "root";   // your MySQL password

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Database Connection Error: " + e);
            return null;
        }
    }
}
