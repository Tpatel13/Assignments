package advance1.day2.assignment14;

/**
 * This class is a starter classes that instantiate the Account.
 * Using the instance, it invokes the corresponding banking
 * operations.
 * Date : <<Replace with the date you do this assignment>>
 * @author <<Replace with your Employee No. and Name>>
 * @version 1.0
 */
public class WellsBank {
    /**
     * Instantiate the Account object. Call the corresponding methods that
     * does the various banking operations.
     * @param args The command line arguments
     */
    public static void main (String[] args) {
// To-do: Create an instance (john) for Customer class. Call the

//        overloaded constructor
//
//        SavingsAccount johnSA = new SavingsAccount(101,john,1000);
//        johnSA.deposit(1000);
//// To-do: display the balance available in account no 101
//// To-do: call the method to withdraw Rs.1600.
//// To-do: display the balance available.
//// To-do: Create an instance (jenny) for Customer class. Call
//        the overloaded constructor
//        OverdraftAccount jennyOA = new
//
//                OverdraftAccount(201,jenny,500,2000);
//
//// To-do: deposit Rs. 1500 to the account
//// To-do: display the balance available in account no 201
//        Note: available balance for Overdraft Account is
//        balance+ Allowed negative amount
// To-do: call the method to withdraw Rs. 1000
// To-do: display the balance available
// To-do: call the method to withdraw Rs. 4000
// To-do: display the balance available
// To-do: call the method to withdraw Rs. 3000
// To-do: display the balance available







        Customer john=new Customer(1,"JOHN","Irving",91776);
        SavingsAccount johnSA = new SavingsAccount(101,john,1000);

        Customer jenny=new Customer(2,"Jenny","Austin",91776);

         CurrentAccount jennyOA=new CurrentAccount(201,jenny,500,2000);
         jennyOA.deposit(1500);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());;
        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());
        jennyOA.withDraw(900);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.withDraw(1000);

        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.deposit(1100);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());

        jennyOA.withDraw(1000);
        System.out.println("Eligibility amount is "+jennyOA.getEligiblityAmount());



    }
}