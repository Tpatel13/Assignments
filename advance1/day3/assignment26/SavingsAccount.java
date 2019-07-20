package advance1.day3.assignment26;

public class SavingsAccount extends Account {

    private double minimumBalance = 500;
    private int interestRate = 12;

    public SavingsAccount() {

    }


    public SavingsAccount(int accoutnNO, Customer customer, double balance) {

        super(accoutnNO, customer, balance);

    }


    public void withDraw(double amount) throws InsufficientBalanceExcpetion {
        if ((balance - amount) >= 500) {
            balance = balance - amount;
            System.out.println("After Withdrawing " + amount + " remaining amount is : " + balance);
        } else
            throw new InsufficientBalanceExcpetion();
    }

    public void clculateInterest() {
        System.out.println("Interest is : " + (balance * interestRate) / 100);
    }


}
