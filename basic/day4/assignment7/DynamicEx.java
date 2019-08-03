package basic.day4.assignment7;


public class DynamicEx {

    public static void main(String args[]) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        dayScholar.setResAddress("NO 32/3 Vijayanagar");
        dayScholar.displayDayDetails();
    }
}

class Student {

    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected final int semesterFees = 1200;
    protected int feesPerMonth;

    Student() {

    }

    public void setStudentId(int sId) {
        this.studentId = sId;
    }

    public void setStudentType(char sType) {
        this.studentType = sType;

    }

    public void setStudentName(String sName) {
        this.studentName = sName;

    }

    public final void getDetails() {
        System.out.println("Student ID :" + studentId);
        System.out.println("Student Type :" + studentType);
    }

    public void calculateFees() {
        feesPerMonth = semesterFees / 6;

    }

    public void displayDetail() {

    }

}

final class DayScholar extends Student {

    private String residentialAddress;

    public void setResAddress(String resAddress) {
        this.residentialAddress = resAddress;
    }
//        public void getDetails(){
//            super.getDetails();
//            System.out.println("Student Name "+studentName);
//            System.out.println("Residential Address"+residentialAddress);
//
//        }

    public void displayDayDetails() {
        System.out.println("Student ID :" + studentId);
        System.out.println("Student Type :" + studentType);
        System.out.println("Student Name " + studentName);
        System.out.println("Residential Address" + residentialAddress);

    }

}






