import java.util.ArrayList;
import java.util.Scanner;
public class Store
{
    private ArrayList<Customer> namesAndMoney = new ArrayList<Customer>();
    public static void main(String[] args)
    {
        boolean keepGoing = true;
        Store theStore = new Store();
        Scanner sc = new Scanner(System.in);
        while( keepGoing = true)
        {
            System.out.print("Please Input the name of the customer:");
            String customerName = sc.next();
            System.out.print("Please Input the amount spent:");
            double amount = sc.nextDouble();
            if (amount == 0)
            {
                keepGoing = false; 
            }
            else
            {
                theStore.addSale(customerName, amount);
            }
        }
        theStore.nameOfBestCustomer();
    }

    public void addSale(String customerName, double amount)
    {
        Customer cus1 = new Customer(customerName,amount);
        namesAndMoney.add(cus1);
    }

    public String nameOfBestCustomer()
    {
        double bestCustomerAmount;
        String NameOfBest= " ";
        for(int i =0; i<= namesAndMoney.size()-1; i++ )
        {
            if(this.namesAndMoney.get(i).getAmount() > )
            {
                NameOfBest = namesAndMoney.get(1).getName();
            }
        }
        return NameOfBest;
    }
}