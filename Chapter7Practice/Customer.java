

public class Customer
{
   private String name;
   private double amount;
    public Customer(String nameOfCustomer, double amountSpent)
    {
        // initialise instance variables
        name = nameOfCustomer;
        amount = amountSpent;
    }
    public String getName()
    {
        // put your code here
        return name;
    }
    public double getAmount()
    {
        return amount;
    }
}
