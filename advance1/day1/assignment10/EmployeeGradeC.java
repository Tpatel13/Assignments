package advance1.day1.assignment10;

public class EmployeeGradeC {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback,customer2Feedback,customer3Feedback=-1,averageFeedBack;
    private char grade;

    public EmployeeGradeC()
    {
        this.employeeNo=101;
        this.employeeName="RAM";
        this.customer1Feedback=4.3f;
        this.customer2Feedback=4.1f;
        this.customer3Feedback=4.0f;
    }
    public EmployeeGradeC(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }

    public void initilizeEmployeee(int employeeNo, String
            employeeName, float customer1Feedback, float
                                           customer2Feedback)
    {
        this.employeeName=employeeName;
        this.employeeNo=employeeNo;
        this.customer1Feedback=customer1Feedback;
        this.customer2Feedback=customer2Feedback;

    }
    public void calculateAverageFeedback(){
          if(this.customer3Feedback!=-1)
          this.averageFeedBack=(this.customer1Feedback+this.customer3Feedback+this.customer2Feedback)/3;
         else
              this.averageFeedBack=(this.customer1Feedback+this.customer2Feedback)/2;

    }

    public void calculateGrade()
    {
        grade=(this.averageFeedBack>3.5)?'A':(this.averageFeedBack>2.5)?'B':'C';

    }
    public void displayInfo()
    {
        System.out.println("Employee No :"+this.employeeNo+" \n "+
                "Employee name : "+this.employeeName +"\n"+
                "Avg. Feedback : "+this.averageFeedBack+" \n "
        +"Grade :"+this.grade);
    }
}

