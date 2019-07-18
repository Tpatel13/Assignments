package basic.day4.assignment5;

public class DayScholar extends PostGradStudent{
    private String residentialAddress;


    DayScholar(int pCourseId,String pCourseName,int pCourseFees,int  sid,char sType,String sName,String rAddress){

      super(pCourseId,pCourseName,pCourseFees,pCourseId,sType,sName);
      this.residentialAddress=rAddress;


    }



    public int getFees()
    {
          return PostCourseFees/6;
    }

    @Override
    public void getStudentDetails()
    {
        super.getStudentDetails();
        System.out.println("Student Fees:"+getFees());
    }



}
