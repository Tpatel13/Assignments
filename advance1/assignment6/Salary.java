package advance1.assignment6;

public class Salary extends Bank {
      private int accountNumber=1;
     final boolean multiCitiChequeBook=false;
     final boolean discount=false;
     final boolean atm=true;


    public Salary() {
    }

    public Salary(String fullName, String emailID, String DOB, char gender, char mStatus) {
        super(fullName, emailID, DOB, gender, mStatus);
        accountNumber++;

    }


    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Account Number ::" + accountNumber);
        System.out.println("Multi city cheque Book " + multiCitiChequeBook);
        System.out.println("Discount : " + discount);
        System.out.println("ATM :: " + atm);

    }

}
