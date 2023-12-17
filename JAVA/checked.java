import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class checked{
public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/mj";
    String user = "MySQLManoj";
    String password = "manojkumar1311";

    System.out.println("Connecting to database...");

   try {
            Connection connection = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Here's the exception: " + e);
        }
}
}