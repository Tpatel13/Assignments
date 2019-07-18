package basic.day4.assignment5;

public class Student {

    protected static int studentID;
    protected String studentName;
    protected char studentType;

    public static int getStudentID() {
        return studentID;
    }

    public static void setStudentID(int studentID) {
        Student.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    Student()
    {
        studentID++;
    }
    public Student(int studentID, String studentName, char studentType) {
        this();
        this.studentName = studentName;
        this.studentType = studentType;
    }

}
