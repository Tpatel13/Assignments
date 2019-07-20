package advance1.day2.assignment14;

public class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    Account()
    {}

    public Account(int accountNo, Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public double balanceInquiry()
    {
       return balance;
    }
    public void deposit(double amount)
    {

       balance=balance+amount;
        System.out.println("Balance Deposited and balance is : : "+balance);
    }
}
