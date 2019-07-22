package basic.day3.assignment7;


public class CourseManagement {
    public static void main(String args[]) {
        int studentID = Integer.parseInt(args[0]);
        String studentName = args[1], status = args[2];
        long fees = Integer.parseInt(args[3]);
        Student student = new Student();

        if (status.equals("hostile")) {

            student.setFees(fees);
            student.setResientialStatus(status);
            student.setStudentID(studentID);
            student.setStudentName(studentName);
            System.out.println("Student id" + student.getStudentID() + " Student Name " + student.getStudentName() + "Student Status and Fees " + student.getResientialStatus() + " " + student.getFees());


        } else
            System.out.println("It is only availabe for hostile studnets");


    }


}


class Student {


    private static int studentCounter;
    private int studentID;
    private String studentName;
    private String resientialStatus;
    private double feesPerMonth;

    Student() {

    }


    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getResientialStatus() {
        return resientialStatus;
    }

    public void setResientialStatus(String resientialStatus) {
        this.resientialStatus = resientialStatus;
    }

    public double getFees() {
        return feesPerMonth;
    }

    public void setFees(long fees) {
        this.feesPerMonth = fees;
    }


}