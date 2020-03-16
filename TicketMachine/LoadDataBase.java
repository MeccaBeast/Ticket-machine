
import java.util.Scanner;
import java.sql.* ;
import java.lang.String;

public class LoadDataBase
{   
    private static String driver="com.mysql.cj.jdbc.Driver";
    private static String url="jdbc:mysql://mysql.dur.ac.uk/Cnxqv36_...";
    private static String user="nxqv36";
    private static String Password="wh33en";
    static{
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,Password);
    }
    public static void closeAll(Connection conn, Statement stmt, ResultSet rs)throws SQLException{
        if(rs!=null){
            rs.close();
        }
        if(stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
    public int executeSQL(String preparedSql, Object[] param) throws ClassNotFoundException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        /* run and execute SQL */
        try {
            conn = getConnection(); // get Connection
            pstmt = conn.prepareStatement(preparedSql); // get the objection
            if (param != null) {
                for (int i = 0; i < param.length; i++) {
                    pstmt.setObject(i + 1, param[i]); // set parameter
                }
            }
        ResultSet num = pstmt.executeQuery(); // execute SQL query
        } catch (SQLException e) {
            e.printStackTrace(); // handle SQLException
        } finally {
            try {
                LoadDataBase.closeAll(conn, pstmt, null);
            } catch (SQLException e) {    
                e.printStackTrace();
            }
        }
        return 0;
    }
    public static void main(String args[]){
        try{
          
           // Load the database driver
           Class.forName( "com.mysql.cj.jdbc.Driver" ) ;
    
           // Get a connection to the database
           Connection conn = null;
           Statement stmt = null;;
           String url = "jdbc:mysql://mysql.dur.ac.uk/Csgrk85_OOPassignment";
           //String url = "jdbc:mysql://localhost:3306/luis?useUnicode=true&characterEncoding=UTF8&verifyServerCertificate=false&useSSL=false&serverTimezone=UTC";
           String user ="sgrk85";
           String Password ="nobo97dy";
           
           conn = DriverManager.getConnection(url,user,Password);
    
           // Print all warnings
           for( SQLWarning warn = conn.getWarnings(); warn != null; warn = warn.getNextWarning() )
           {
              System.out.println( "SQL Warning:" ) ;
              System.out.println( "State  : " + warn.getSQLState()  ) ;
              System.out.println( "Message: " + warn.getMessage()   ) ;
              System.out.println( "Error  : " + warn.getErrorCode() ) ;
           }
           

           
            while(true){
                System.out.println("---------------");
                System.out.println("1. Insert value");
                System.out.println("2. Delete value");
                System.out.println("3. Update value");
                System.out.println("4. Show List of values");
                System.out.println("5. Exit");
                Scanner scan = new Scanner(System.in);
                System.out.println("---------------");
                System.out.println("Enter Your Menu Choice");
                String key = scan.nextLine();            
             
                switch(key) {
                    case "1":
                        System.out.print("firstname : ");
                        scan = new Scanner(System.in);
                        String firstname = scan.nextLine();
                        System.out.print("surname : ");
                        scan = new Scanner(System.in);
                        String surname = scan.nextLine();
                        System.out.print("username : ");
                        scan = new Scanner(System.in);
                        String username = scan.nextLine();
                        System.out.print("password : ");
                        scan = new Scanner(System.in);
                        String password = scan.nextLine();
                        
                        String query = " insert into Customers (firstname, surname, username, password)" + " values (?, ?, ?, ?)";
                        PreparedStatement preparedStmt = conn.prepareStatement(query);
                        preparedStmt.setString (1, firstname);
                        preparedStmt.setString(2, surname);
                        preparedStmt.setString(3, username);
                        preparedStmt.setString(4, password);
                        preparedStmt.execute();
                        System.out.println("Successfully inserted");
                        preparedStmt.close();
                        break;                      
                    case "2": 
                        System.out.println("Enter the firstname");
                        scan = new Scanner(System.in);
                        firstname = scan.nextLine();
                        
                        query = "DELETE FROM Customers WHERE firstname = ?";
                        preparedStmt = conn.prepareStatement(query);
                        preparedStmt.setString (1, firstname);
                        preparedStmt.executeUpdate();
                        System.out.println("Successfully deleted");
                        preparedStmt.close();
                        break;
                    case "3":
                        System.out.println("Enter the firstname");
                        scan = new Scanner(System.in);
                        //name = scan.nextLine();
                        System.out.println("Enter the age");
                        scan = new Scanner(System.in);
                        //age = scan.nextLine();
                        query = "UPDATE Customers set age = ? WHERE name = ?";
                        preparedStmt = conn.prepareStatement(query);
                        //preparedStmt.setInt(1, Integer.parseInt(age));
                        //preparedStmt.setString (2, name);
                        preparedStmt.executeUpdate();
                        System.out.println("Successfully updated");
                        preparedStmt.close();
                        break;
                    case "4":
                        stmt = conn.createStatement();// Get a statement from the connection
                        ResultSet rs = stmt.executeQuery( "SELECT * FROM Customers" );// Execute the query
                       while( rs.next() ){  // Loop through the result set
                        System.out.println( "name : " +rs.getString("name") ) ;
                        System.out.println( "age : "+ rs.getString("age") ) ;
                       }
                       // Close the result set, statement
                       rs.close();
                       stmt.close();
                       break;
                    case "5":
                        System.out.println("Exiting Program...");
    
                        conn.close(); 
                        
                        System.exit(0); // exit
                        break;
                    default : 
                        System.out.println("This is not a valid Menu Option. Please Select Another");
                        break;
            }
                
                           
         } 
           
       
           // Close the connection
             
        }catch( SQLException se ){
           System.out.println( "SQL Exception:" ) ;
    
           // Loop through the SQL Exceptions
           while( se != null )
           {
              System.out.println( "State  : " + se.getSQLState()  ) ;
              System.out.println( "Message: " + se.getMessage()   ) ;
              System.out.println( "Error  : " + se.getErrorCode() ) ;
    
              se = se.getNextException() ;
           }
        }catch( Exception e ){
          System.out.println( e ) ;
        }

    }
}
        

