package basic.day3;


public class Assignment8 {
    public static void main(String args[]) {
        int studentID = Integer.parseInt(args[0]);
        String studentName = args[1], status = args[2];
        long fees = Integer.parseInt(args[3]);
        Student student = new Student(1, 'f', "Tirth", "Patel");

        student.setResientialStatus("Day Scholer");
        student.setFees(500);

        if (student.getResientialStatus().equals("Day Scholar")) {
            student.calculateFees(student.getFees());
        } else {
            student.calculateFees(student.getFees(), 100);
        }

        System.out.println("Name :" + student.getStudentName() + "  Status " + student.getResientialStatus() + " Fees " + student.getFees());
    }


}


class Student {


    private int studentID;
    private String studentName;
    private String resientialStatus;
    private char type;
    private String fName, lName;
    private double feesPerMonth;

    Student(int id, char type, String fName, String lName) {
        this.studentID = id;
        this.studentName = fName + lName;
        this.type = type;
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


    public void calculateFees(double semisterFees) {

    }

    public void calculateFees(double semesterFees, double hostelFees) {
        feesPerMonth = semesterFees / 6.0;
        feesPerMonth = feesPerMonth + hostelFees;
    }


}