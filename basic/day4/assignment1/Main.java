package basic.day4.assignment1;

public class Main {


    public static void main(String[] args) {
        Hostelite s1=new Hostelite(12,'t',"Tirth",400,"MY hostel",404);

        System.out.println("Name is :" + s1.getStudentName());

        System.out.println("ID is :" + s1.getStudentId());
        System.out.println("Type is :" + s1.getStudenttype());
        System.out.println("Fees is :" + s1.getFeesPerMonth());
        System.out.println("NHostelname is :" + s1.getHostelName());
        System.out.println("Room number is :" + s1.getRoomNumber());
    }
}
