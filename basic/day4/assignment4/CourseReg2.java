package basic.day4.assignment4;


class CourseReg3 {

    static protected int regId;
    protected String courseName;

    CourseReg3() {
        regId++;
    }

    CourseReg3(String cName) {
        this();
        courseName = cName;

    }

    public void displayDetails1() {
        System.out.println("Registration ID :" + regId);
        System.out.println("CourseName :" + courseName);
    }
}

class Student3 extends CourseReg3 {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    private int semesterFees;
    private int feesPerMonth;

    Student3(int studentId, String cName) {
        super(cName);
        this.studentId = studentId;
    }

    Student3(int studentId, char studentType, String studName, int semFees, String cName) {
        super(cName);
        this.studentId = studentId;
        this.studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
    }

    @Override
    public void displayDetails1() {
        super.displayDetails1();
        System.out.println("Student id,fees,Name,type" + studentId + "::" + semesterFees + "::" + studentName + "::" + studentType + "::");
    }
}

class DayScholar1 extends Student3 {

    private String residentialAddress;

    DayScholar1(int studentId, char studentType, String studName,
                int semFees, String residentialAddress, String cName) {
        super(studentId, studentType, studName, semFees, cName);
        this.residentialAddress = residentialAddress;
    }

    @Override
    public void displayDetails1() {
//need to display the Details of the Student and
//DayScholar
        super.displayDetails1();
        System.out.println("::Resident Address::" + residentialAddress);

    }

}

class CourseReg {

    public static void main(String args[]) {
        DayScholar1 dayscholar = new DayScholar1
                (1001, 'D', "Eugene", 12000, "No32/68 Vijayanagar", "OOP");
        dayscholar.displayDetails1();
    }

}