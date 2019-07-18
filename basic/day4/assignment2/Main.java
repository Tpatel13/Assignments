package basic.day4.assignment2;

public class Main {


    public static void main(String[] args) {


        //Note taking user input from Argumants
        String status="Dayscholar";
        Student s;


        if(status.equals("Hostalite"))
        {
            s=new Hostelite(4,'f',"Tirth",500,"Hostelname",404);
            s.displayStudentDetails();
        }
        else if (status.equals("Dayscholar"))
        {
            s=new DayScholar(12,'t',"Vishwa",500,"Address Name");
            s.displayStudentDetails();
        }
    }
}
