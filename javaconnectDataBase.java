package attendance;

import java.sql.*;
public class javaconnectDataBase {
    Connection con;
  
    public static Connection ConnectDB() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:/Users/nishtha/Desktop/OJ Project/Attendance/Attendance.db ";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectDB();
    }
}
