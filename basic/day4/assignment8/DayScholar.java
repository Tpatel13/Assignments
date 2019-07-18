package basic.day4.assignment8;

public class DayScholar extends Student {

    private String residentialAddress;

    public DayScholar(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public DayScholar(int studentId, char studenttype, String studentName, double feesPerMonth, String residentialAddress) {
        super(studentId, studenttype, studentName, feesPerMonth);
        this.residentialAddress = residentialAddress;
        calculateFees(5000);
    }

    @Override
    public double calculateFees(double semesterFees) {
        feesPerMonth = semesterFees / 6.0;
       // Add hostel fees Rs.1200

       return (feesPerMonth = feesPerMonth+ 1200);
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
