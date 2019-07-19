package advance1.assignment5;

public class NonSalary extends Bank {
    private int accountNumber = 0;
    final boolean multiCitiChequeBook = false;
    final boolean discount = true;
    final boolean atm = true;
    final int minBalance = 10000;

    public NonSalary() {

    }

    public NonSalary(String fullName, String emailID, String DOB, char gender, char mStatus, int minBalance) {


        super(fullName, emailID, DOB, gender, mStatus);
        accountNumber++;


    }

    public void displayDetails() {
        System.out.println("Account Number ::" + accountNumber);
        System.out.println("Multi city cheque Book " + multiCitiChequeBook);
        System.out.println("Discount : " + discount);
        System.out.println("ATM :: " + atm);

    }
}
