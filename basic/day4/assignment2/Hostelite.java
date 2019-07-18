package basic.day4.assignment2;



public class Hostelite extends Student {

    private String hostelName;
    private int roomNumber;

    Hostelite() {

    }

    public Hostelite(int id, char type, String name, double fees, String hostelName, int roomNumber) {
        this.studentId=id;

        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;

    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayHostelDetails()
    {
        super.displayStudentDetails();
        System.out.println("Hostel name and Room Number is ::::"+hostelName+"  "+roomNumber);
    }
}
