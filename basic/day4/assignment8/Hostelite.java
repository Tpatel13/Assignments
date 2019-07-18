package basic.day4.assignment8;

public class Hostelite extends Student {

    private String hostelName;
    private int roomNumber;

    Hostelite() {

    }

    public Hostelite(int id, char type, String name, double fees, String hostelName, int roomNumber) {
        this.studentId=id;

        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        calculateFees(fees);
    }

    public String getHostelName() {
        return hostelName;

    }

    @Override
    public double calculateFees(double fees) {
        feesPerMonth = fees / 6.0;
        // Add hostel fees Rs.1200

        return (feesPerMonth = feesPerMonth+ 1200);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("::Hostel name and Room number :: " +hostelName+"::"+roomNumber);
    }
}
