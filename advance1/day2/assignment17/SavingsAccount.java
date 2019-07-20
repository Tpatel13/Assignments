package advance1.day2.assignment17;

public class SavingsAccount extends Account {

    private double minimumBalance=500;
    private int interestRate=12;

    SavingsAccount()
    {

    }


    SavingsAccount(int accoutnNO, Customer customer, double balance){

        super(accoutnNO,customer,balance);

    }


    public void withDraw(double amount)
    {
     if((balance-amount)>=500){
         balance=balance-amount;
         System.out.println("After Withdrawing "+amount+" remaining amount is : "+balance);
     }
     else
         System.out.println("Miniumum balance Should be atleast 500");
    }
    public void clculateInterest()
    {
        System.out.println("Interest is : "+(balance*interestRate)/100);
    }


}
