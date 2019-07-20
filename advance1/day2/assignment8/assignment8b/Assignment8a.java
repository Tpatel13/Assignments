package advance1.day2.assignment8.assignment8b;

public class Assignment8a {
    public static void main(String[] args) {

        //Calling only default constructors only
        Loan person1=new Loan();
        Loan person2=new Loan();
        Loan person3=new Loan(1,1,1,1,1,1);
        Loan person4=new Loan();
        Loan person5=new Loan();
        Loan person6=new Loan();


        System.out.println("Total Loans :: "+person1.loanCounter);
    }
}
