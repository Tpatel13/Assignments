package advance1.day2.assignment8.assignment8c;

public class Loan {


    static int loanCounter;
    static{

         loanCounter=100;

    }
    private int loanNo,accountNo,customerNo,loanDuration;
    private float loanAmount,interest;


    private Loan()
    {
        loanCounter++;
    }
    public Loan(int loan, int accountNo, int customerNo, int loanDuration, float loanAmount, float interest) {
        loanNo = loan;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanDuration = loanDuration;
        this.loanAmount = loanAmount;
        this.interest = interest;
        loanCounter++;
    }

    public static Loan getLoanInstance(){
        return new Loan();
    }
    public float calculateInstallments(){
    return 0;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public int getLoanCounter()
    {
        return loanCounter;
    }
}

