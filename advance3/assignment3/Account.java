package advance3.assignment3;



public  class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;


    Account(){

    }
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Account(int accountNo, Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double balanceInquiry() {
        return balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;
        System.out.println("Balance Deposited to account no :" + accountNo + " and balance is : : " + balance);
    }


   // public  void withDraw(double amount) throws InsufficientBalanceExcpetion;
}
