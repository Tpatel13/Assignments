package basic.day3.assignment1;

public class Student {
   private static int studentID=550;
   private static int studentCount;
   static{studentCount=10;}
   private char studentType;
   private String studentName;
   
   Student(){
	   this.studentID++;
	   studentCount++;
   }
   Student(char sType, String Lname, String Fname)
   {
	   this();
	   this.studentName=Lname+Fname;
	   this.studentType=sType;
	   
   }
   
   public void displayDetails(Student s)
   {
	   System.out.println("ID is "+s.studentID+"Type is "+s.studentType+" and Full Name is "+s.studentName);

   }
   
   public static int getStudentCount(){
       return studentCount;
   }
}
