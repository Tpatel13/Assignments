package codingtask.problem3;

public class Account {
    private int accountNumber;
    public static int totalAccounts;
    private int balance;

    public Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }


    public void deposit(int amount) throws InvilidAmountException {

        //If negative amount is allow then
//        this.balance += amount;
//           System.out.println("New Balance of account " + accountNumber + " is $" + balance);




        //If negative amount is not allowed then ..
        //We can handle it with 2 ways .


        //1 is ,when negative amount is given bank will withdrew same amount
//        if (amount <= 0) {
//            System.out.println("Trying to add Negative amount so withdrawing... " + amount);
//           withdraw(Math.abs(amount));
//        } else {
//            this.balance += amount;
//            System.out.println("New Balance of account " + accountNumber + " is $" + balance);
//        }


        //2 Throw the exception
        if (amount < 0) throw new InvilidAmountException();
        else {
            this.balance += amount;
            System.out.println("New Balance of account " + accountNumber + " is $" + balance);
        }


    }

    public void withdraw(int amount) throws BalanceException {

        if ((balance - amount) >= 0) {
            this.balance = balance - amount;
            System.out.println("After withdrew of : " + amount + "  new balance of account " + accountNumber + "  is $" + this.balance);
        } else {

            throw new BalanceException();
        }
    }

}
