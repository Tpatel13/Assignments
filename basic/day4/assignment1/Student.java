package basic.day4.assignment1;

public class Student {

    protected int studentId;
    protected char studenttype;
    protected String studentName;
    protected double feesPerMonth;

    Student()
    {

    }

    public Student(int studentId, char studenttype, String studentName, double feesPerMonth) {
        this.studentId = studentId;
        this.studenttype = studenttype;
        this.studentName = studentName;
        this.feesPerMonth = feesPerMonth;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudenttype() {
        return studenttype;
    }

    public void setStudenttype(char studenttype) {
        this.studenttype = studenttype;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }


}
