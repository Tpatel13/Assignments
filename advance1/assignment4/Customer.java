package advance1.assignment4;

public class Customer {

    private String customerID;
    private String customerName;
    private String address;
    private int pinCode;
/**
 * This method creates an object of Customer Class and sets its
 *instance variable and display the same.
 * @param args The command line arguments
 */


public static void main (String [] args){
    Customer customer = new Customer();
    customer.customerID = "1234";
    customer.customerName = "Jayant";
    customer.address = "PHA-Sawan Apts., Yadavgiri, Mysore";

    customer.pinCode = 570020;
    System.out.println("Customer ID " + customer.customerID);
    System.out.println("Customer Name " + customer.customerName);
    System.out.println("Customer Address " + customer.address);
    System.out.println("Customer Pin Code " + customer.pinCode);

}
}
