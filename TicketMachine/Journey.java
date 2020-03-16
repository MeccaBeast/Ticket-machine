import java.util.*;
import java.security.SecureRandom;
import java.math.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Journey
{
    private int as;
    private double jp;
    private String jd1;
    private String jd2;
    private String jf;
    private String jt;
    private int id;
    private int count = 0;
    
    public Journey(int uid,int aas,double price,String duration,String from,String to,String d)
    {
        id = uid;
        jp = price;
        jd1 = duration;
        jf = from;
        jt = to;
        jd2 = d;
        as = aas;
        count++;
    }

    /*public String generateID()
    {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        String i = "";
        try{
            secureRandom.nextBytes(token);
        }catch(InputMismatchException e){
            System.out.println("Invalid input!");
        }
        i = new BigInteger(1, token).toString(16);
        return i;
    }*/
    
    public String getDate()
    {
        /*Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        try{
            date = format.parse(jd2);
        }catch(ParseException e){
            System.out.println("Throws an exception!");
        }*/
        return jd2;
    }
    
    public void setAvailableSeat(int seatNum){
        as = seatNum;
    }
        
    
    public int getID()
    {
        return id;
    }
    
    public int getAvailableSeat()
    {
        return as;
    }
    
    public double getPrice()
    {
        return jp;
    }
    
    public String getDuration()
    {
        return jd1;
    }
    
    public String getFrom()
    {
        return jf;
    }
    
    public String getTo()
    {
        return jt;
    }
    
    public int getNumberOfBooking()
    {
        return count;
    }
}
