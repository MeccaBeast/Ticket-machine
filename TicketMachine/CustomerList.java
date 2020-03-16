import java.util.*;
import java.io.*;

public class CustomerList
{
    private List<Customer> customers;
    
    public CustomerList(){
        customers = new ArrayList<Customer>();
    }

    public void registrate(Customer newCustomer){
        customers.add(newCustomer);
    }
    
    public void removeCustomerbySurname(String Surname){
        ListIterator<Customer> iter = customers.listIterator();
        int i = 0;
        try{
            while(iter.hasNext()){
                if(iter.next().getSurname().equals(Surname)){
                    iter.remove();
                    i++;
                }
            }
            if(i > 1){
                System.out.print("There are total" + i + "persons with this surname.");
            }else{
                System.out.print("Only one person have this name.");
            }
        }catch(IllegalArgumentException e){
                System.out.print("Invalid input!");
        }
    }
    
    public int numberOfCustomers(){
        return customers.size();
    }
    
    public void customerDetail(String Username){
        ListIterator<Customer> iter = customers.listIterator();
            try
            {
                while(iter.hasNext()){
                    if(iter.next().getUsername().equals(Username))
                    {
                        iter.toString();
                    }
                }
            }catch(IllegalArgumentException e){
                System.out.print("Invalid input!");
            }
    }
    
    public Customer login_check(String Username,String Password){
        for(Customer customer:customers){
            if(customer.getUsername().equals(Username)&&customer.getPassword().equals(Password))
            return customer;
        }
        return null;
    }
}
