package advance1.day2.assignment19.com.WellsBank.wellsbank;

import advance1.day2.assignment16.Account;
import advance1.day2.assignment16.CurrentAccount;
import advance1.day2.assignment16.Customer;
import advance1.day2.assignment16.SavingsAccount;

/**
 * This class is a starter classes that instantiate the Account.
 * Using the instance, it invokes the corresponding banking
 * operations.
 * Date : <<Replace with the date you do this assignment>>
 *
 * @author <<Replace with your Employee No. and Name>>
 * @version 1.0
 */
public class WellsBank {
    /**
     * Instantiate the Account object. Call the corresponding methods that
     * does the various banking operations.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {


        Account account=new SavingsAccount();
        Customer john = new Customer(1, "JOHN", "Irving", 91776);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);

        Customer jenny = new Customer(2, "Jenny", "Austin", 91776);

        CurrentAccount jennyOA = new CurrentAccount(201, jenny, 500, 2000);



        //Calling static method.We dont have to make object and then access it
        transaction(johnSA,1000);
    }


    public static void transaction(Account account, double amount){

             account.deposit(3000);
             account.withDraw(3000);

    }


}