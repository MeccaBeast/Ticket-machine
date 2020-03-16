/**
 * Write a description of class LoadCustomers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.sql.* ;
public class LoadJourneys extends LoadDataBase
{
    public static ArrayList<Journey> createJourneyList() throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql="SELECT * FROM Journeys";
        PreparedStatement stmt= conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();// Execute the query
        
        ArrayList<Journey> newJourneyList=new ArrayList<>();
        while( rs.next() ){  // Loop through the result set
            Journey newJourney= new Journey(
            rs.getInt("journeyID"),
            rs.getInt("seatsAvailable"),
            rs.getDouble("journeyPrice"),
            rs.getString("journeyDuration"),
            rs.getString("journeyFrom"),
            rs.getString("journeyTo"),
            rs.getString("journeyDate")
            );
            newJourneyList.add(newJourney);
        }
        LoadDataBase.closeAll(conn, stmt, rs);
        return newJourneyList;
    }
    public static void addJourney(int seatsAvailable,double journeyPrice,int journeyDuration, String journeyDate, String journeyFrom,String journeyTo) throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql = " insert into Journeys (journeyID, seatsAvailable, journeyPrice, int_journeyDuration, journeyDate, journeyFrom, journeyTo)" + " values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt= conn.prepareStatement(sql);
        stmt.setInt (1, (int)(Math.random()*1000000));
        stmt.setInt (2, seatsAvailable);
        stmt.setFloat (3, (float)journeyPrice);
        stmt.setInt (4, journeyDuration);
        stmt.setString (5, journeyDate);
        stmt.setString (6, journeyFrom);
        stmt.setString (7, journeyTo);
        stmt.execute();
        ResultSet rs = null;// Execute the query
        
        LoadDataBase.closeAll(conn, stmt, rs);
    }
    public static void removeJourneybyID(int journeyID) throws Exception{
        Connection conn=LoadDataBase.getConnection();
        String sql = "DELETE FROM Journeys WHERE journeyID = ?";
        PreparedStatement stmt= conn.prepareStatement(sql);
        stmt.setInt (1, journeyID);
        stmt.executeUpdate();
        ResultSet rs = null;// Execute the query
        
        LoadDataBase.closeAll(conn, stmt, rs);
    }
}