import java.util.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Customer
{
    private String firstname;
    private String surname;
    private String username;
    private String password;
    
    // constructor
    public Customer(String fn,String sn,String un,String pw)
    {
        firstname = fn;
        surname = sn;
        username = un;
        password = pw;
    }
    // get value of firstname
    public String getFirstName()
    {
        return firstname;
    }
    // get value of firstname
    public String getSurname()
    {
        return surname;
    }
    // get value of firstname
    public String getUsername()
    {
        return username;
    }
    // get value of firstname
    public String getPassword()
    {
        return password;
    }
    // change value of firstname
    public String changeFirstname(String nfn)
    {
        firstname = nfn;
        return firstname;
    }
    // change value of firstname
    public String changeSurname(String nsn)
    {
        surname = nsn;
        return surname;
    }
    // change value of firstname
    public String changeUsername(String nun)
    {
        username = nun;
        return username;
    }
    // change value of firstname
    public String changePassword(String npw)
    {
        password = npw;
        return password;
    }
    // check validation of email
    private boolean emailValidator() 
    {
        boolean isValid = false;
        try {
        //
        // Create InternetAddress object and validated the supplied
        // address which is this case is an email address.
            InternetAddress internetAddress = new InternetAddress(username);
            internetAddress.validate();
            isValid = true;
        } catch (AddressException e) {
            System.out.println("You are in catch block -- Exception Occurred for: " + username);
        }
        return isValid;
    }
    // print out values of all the parameters as String type
    public String toString(){     
        return "Firstname: " + firstname + " Surname:" + surname + "Username:" + username + "Password:" + password; 
    }

}
