package basic.day3.assignment4;

public class Student {
    private int studentID;
    private char studentType;
    private String studentName;


    Student() {
        this.studentID = 10;
        this.studentType = 'F';

    }
    Student(int id,char type,String fName,String lName){
         this.studentID=id;
         this.studentType=type;
         this.studentName=fName+lName;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String firstName, String lastName) {
        studentName = firstName + lastName;
    }
    public void getStudentInfo()
  {
      System.out.println("ID"+studentID+" Type "+studentType+"Full Name "+studentName);
  }
}
