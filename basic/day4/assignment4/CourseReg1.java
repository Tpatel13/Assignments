package basic.day4.assignment4;


class CourseReg1 {

    public static void main(String args[]) {
        Student dayscholar = new DayScholar
                (1001, 'D', "Eugene", 12000, "No 32/68 Vijayanagar");
        dayscholar.displayDetails();
    }

}

class Student {

    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;
    Student()
    {

    }

    Student(int studentId) {
        this.studentId = studentId;
    }

    Student(int studentId, char studentType, String studName, int semFees) {
        this(studentId);
        studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
    }

    void displayDetails() {
        System.out.println("Student id :: "+studentId+":: Student type ::"+semesterFees+"::Student Name "+studentName+"Student Fees Sem::"+semesterFees+"::Student Fees per month ::"+feesPerMonth);

    }

}

class DayScholar extends Student {

    private String residentialAddress;

    DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress) {
        super(studentId,studentType,studName,semFees);
        this.residentialAddress = residentialAddress;


    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Student Address ::"+residentialAddress);
    }

}
