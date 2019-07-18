package basic.day2.assignment9;

public class Student {
   private static int studentID=550;
   private char studentType;
   private String studentName;
   
   Student(){
	   this.studentID++;
   }
   Student(char sType,String Lname,String Fname)
   {
	   this();
	   this.studentName=Lname+Fname;
	   this.studentType=sType;
	   
   }
   
   public void displayDetails(Student s)
   {
	   System.out.println("ID is "+s.studentID+"Type is "+s.studentType+" and Full Name is "+s.studentName);
   }
   
   
}
