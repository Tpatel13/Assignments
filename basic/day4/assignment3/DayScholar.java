package basic.day4.assignment3;

public class DayScholar extends Student{

    private String residentialAddress;

    public DayScholar(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public DayScholar(int studentId, char studenttype, String studentName, double feesPerMonth, String residentialAddress) {
        super(studentId, studenttype, studentName, feesPerMonth);
        this.residentialAddress = residentialAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println(":: Residential Address :::"+residentialAddress);
    }
}
