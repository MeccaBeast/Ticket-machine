import java.util.*;
import java.math.*;
import java.text.SimpleDateFormat;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Booking
{
    private ArrayList<Customer> customers;
    private ArrayList<Journey> journeys;
    private String jbd;
    private int rs;
    private Customer customer;
    private Journey journey;
    
    public Booking(Customer c,Journey j)
    {
       jbd = "";
       customer = c;
       journey = j;
       customers = new ArrayList<Customer>();
       journeys = new ArrayList<Journey>();
       if(journey.getAvailableSeat()!=0){
                journey.setAvailableSeat(journey.getAvailableSeat()-1);
                journey.getNumberOfBooking();
            }
      
    }

    public void addCustomer()
    {
        customers.add(customer);
    }
    
    public void addJourney()
    {
        journeys.add(journey);
    }
    
    public Journey getJourney()
    {
        return journey;
    }
    
    public Customer getCustomer()
    {
    return customer;
    }
    
    public String getBookingDate()
    {
        jbd = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        return jbd;
    }
    
    public int updateSeat()
    {
        rs = journey.getAvailableSeat();
        if(rs > 0){
            rs = rs-journeys.size();
        }else{
            System.out.println("This train is full now.");
        }
        return rs;
    }
    
    public String getInfoTo()
    {
        return journey.getTo();
    }
    
    public String getInfoFrom()
    {
        return journey.getFrom();
    }
    
    public double getInfoPrice()
    {
        return journey.getPrice();
    }
    
    public String getInfoDuration()
    {
        return journey.getDuration();
    }
    
    public String getInfoDate()
    {
        return journey.getDate();
    }
    
    public int getInfoId()
    {
        return journey.getID();
    }
    
    public String getInfoFn()
    {
        return customer.getFirstName();
    }
    
    public String getInfoSn()
    {
        return customer.getSurname();
    }
    
    public String getInfoUn()
    {
        return customer.getUsername();
    }
    
}
