package advance1.assignment11;


public class Wells {

    public static void main(String[] args) {


        EmployeeGrade [] employee=new EmployeeGrade[5];

         for(int i=0;i<employee.length;i++)
         {
             employee[i]=new EmployeeGrade(1,"Tirth",1,2,3);
             employee[i].calculateAverageFeedback();
             employee[i].calculateGrade();
             employee[i].displayInfo();

         }
    }
}
