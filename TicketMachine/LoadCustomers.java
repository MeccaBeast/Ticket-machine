import java.util.*;
import java.sql.* ;
public class LoadCustomers extends LoadDataBase
{
    public static CustomerList createCustomerList() throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql="SELECT * FROM Customers";
        PreparedStatement stmt= conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();// Execute the query
        
        CustomerList newCustomerList=new CustomerList();
        while( rs.next() ){  // Loop through the result set
            Customer newCustomer= new Customer(
            rs.getString("firstname"),rs.getString("surname"),
            rs.getString("username"),rs.getString("password")
            );
            newCustomerList.registrate(newCustomer);
        }
        LoadDataBase.closeAll(conn, stmt, rs);
        return newCustomerList;
    }
    public static void addCustomer(String FirstName,String SurName,String UserName,String Password) throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql = " insert into Customers (firstname, surname, username, password)" + " values (?, ?, ?, ?)";
        PreparedStatement stmt= conn.prepareStatement(sql);
        stmt.setString (1, FirstName);
        stmt.setString (2, SurName);
        stmt.setString (3, UserName);
        stmt.setString (4, Password);
        stmt.execute();
        ResultSet rs = null;// Execute the query
        
        LoadDataBase.closeAll(conn, stmt, rs);
    }
    public static void removeCustomerbyFirstName(String FirstName) throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql = "DELETE FROM Customers WHERE firstname = ?";
        PreparedStatement stmt= conn.prepareStatement(sql);
        stmt.setString (1, FirstName);
        stmt.executeUpdate();
        ResultSet rs = null;// Execute the query
        
        LoadDataBase.closeAll(conn, stmt, rs);
    }
}
