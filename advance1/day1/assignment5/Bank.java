package advance1.day1.assignment5;

public class Bank  {

    public static int customerID=1;
    private String fullName,emailID,DOB;
    private char gender,mStatus;


    Bank()
    {
      customerID++;
    }

    public Bank(String fullName, String emailID, String DOB, char gender, char mStatus) {
        this();
        this.fullName = fullName;
        this.emailID = emailID;
        this.DOB = DOB;
        this.gender = gender;
        this.mStatus = mStatus;
    }


    public void displayDetails()
    {
        System.out.println("Full Name and Customer ID ::  "+fullName+"  ::  "+customerID);
        System.out.println("emailID ::"+emailID);
        System.out.println("DOB :: "+DOB);
        System.out.println("Gender :: "+gender);
        System.out.println("Maritial Status ::"+mStatus);
    }
}
