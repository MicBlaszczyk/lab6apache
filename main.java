import java.sql.*;
import java.util.Scanner;

class main {
    public static void main(String args[]) {

        Statement statement;
        Connection conn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://10.0.10.3:3306/mydb", "root", null
            );

            //String ct = "CREATE TABLE IF NOT EXISTS users (username VARCHAR(30), password VARCHAR(30), name VARCHAR(30));";

            //statement = conn.createStatement();

            //statement.executeUpdate(ct);

            Scanner in = new Scanner(System.in);
            while(true){
  System.out.println("'a' to add, 'p' to print all rows");
                String choice = in.nextLine();
}
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
