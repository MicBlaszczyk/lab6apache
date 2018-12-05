//STEP 1. Import required packages
import java.sql.*;

public class main {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://10.0.10.3:3306";

    //  Database credentials
    static final String USER = "mbl";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            System.out.println("------TRY------");
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 6: Clean-up environment
            stmt.close();
            conn.close();
        }catch(SQLException se){
            System.out.println("------SQLExeption------");
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            System.out.println("------Exept------");
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            System.out.println("------FINALLY------");
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main


}//end FirstExample
