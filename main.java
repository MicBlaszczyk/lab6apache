//STEP 1. Import required packages
import java.sql.*;
public class main {
    static String template = "jdbc:mysql://http://10.0.10.3:3306/%s?useEncoding=true&characterEncoding=UTF-8&user=%s&password=%s";

    
    public static void main(String[] args){
        dbConnector();
    }
    
    public static Connection dbConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(String.format(template, "mydb", "mbl", "root"));
            System.out.println("Connected succesfully");
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
