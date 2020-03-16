import java.util.*;
import java.io.*;
import java.lang.Object;
import java.util.regex.Matcher;

public class BookingList
{
    private List<Booking> books;
    private Booking booking;
    
    public BookingList()
    {
        this.books = new ArrayList<Booking>();
    }
    
    public void addBook()
    {
        this.books.add(booking);
    }
    
    public Booking getBook(){
        return booking;
    }
    
    public Booking findByTo(String detail)
    {
       for (Booking u : this.books) {
           if (u.getInfoTo().equals(detail)) {
               return u;
            }
        }
        return null;
    }
    
    public void removeCustomerbyUn(String un)
    {
       ListIterator<Booking> iter = this.books.listIterator();
       
       try{
           while(iter.hasNext()){
               if(iter.next().getInfoUn().equals(un)){
                   iter.remove();
               }
           }
       }catch(IllegalArgumentException e){
               System.out.print("Invalid input!");
       }
    }
    
    public int numOfBooking()
    {
        return this.books.size();
    }
    
    public ArrayList<Booking> findJourney()
    {
        ArrayList<Booking>ab = new ArrayList<>();
        for(Booking booking: books){
            if(booking.getJourney().getNumberOfBooking()<4)
            ab.add(booking);
        }
        return ab;
    }
    
    public void getCustomerName(String date)
    {
        ListIterator<Booking> iter = this.books.listIterator();
        
        try{
           while(iter.hasNext()){
               if(iter.next().getBookingDate().equals(date)){
                   System.out.print(iter.next().getCustomer().getFirstName() + iter.next().getCustomer().getSurname());
               }
           }
       }catch(IllegalArgumentException e){
               System.out.print("Invalid input!");
       }
    }
}
