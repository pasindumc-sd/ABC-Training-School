package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {

    private static DBConnection instance;
    private Connection conn;

    private DBConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc_training_school_database", "root", "");
            System.out.println("Connected");
            JOptionPane.showMessageDialog(null, "Database Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Database connection is not available. Please check the server status.", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return conn;
    }
}
