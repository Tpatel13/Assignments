package basic.day4.assignment5;

public class PostGradStudent extends Student{
    protected int PostCourseID;
    protected String PostCoursename;
    protected int PostCourseFees;

    PostGradStudent(){

    }


    public int getPostCourseID() {
        return PostCourseID;
    }

    public void setPostCourseID(int postCourseID) {
        PostCourseID = postCourseID;
    }

    public String getPostCoursename() {
        return PostCoursename;
    }

    public void setPostCoursename(String postCoursename) {
        PostCoursename = postCoursename;
    }

    public int getPostCourseFees() {
        return PostCourseFees;
    }

    public void setPostCourseFees(int postCourseFees) {
        PostCourseFees = postCourseFees;
    }

    public PostGradStudent(int postCourseID, String postCoursename, int postCourseFees,int sID,char sType,String sName) {
        super(sID,sName,sType);
        PostCourseID = postCourseID;
        PostCoursename = postCoursename;
        PostCourseFees = postCourseFees;
    }

    public void getStudentDetails()
    {
        System.out.println("Course id:"+PostCourseID);

        System.out.println("Course Name:"+PostCoursename);
        System.out.println("Course Fees:"+PostCourseFees);
        System.out.println("Student ID :"+studentID);
        System.out.println("Student Type:"+studentType);
        System.out.println("Student Name:"+studentName);
    }
}
