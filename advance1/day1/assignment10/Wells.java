package advance1.day1.assignment10;


public class Wells {

    public static void main(String[] args) {
        EmployeeGradeA Elvis=new EmployeeGradeA(1,"Tirth",0,4,4);


        Elvis.calculateAverageFeedback();
        Elvis.calculateGrade();
        Elvis.displayInfo();

        //For problem 10B
        EmployeeGradeB ram=new EmployeeGradeB();
        ram.calculateAverageFeedback();
        ram.calculateGrade();
        ram.displayInfo();

        //For Problem 10C
        // EmployeeGradeC emp=new EmployeeGradeC();
        EmployeeGradeC emp2=new EmployeeGradeC(1,"Tirth",0,4,4);


        //For Problem 10D
        //Commenting Default constructor,because there is no default constructor.
        // EmployeeGrade ram=new EmployeeGrade();

    }
}
