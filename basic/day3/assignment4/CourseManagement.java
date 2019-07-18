package basic.day3.assignment4;



public class CourseManagement {
	public static void main(String args[]) {
		Student student=new Student();
		String fName="First name",lName="Last Name";

		student.setStudentName(fName,lName);

		System.out.println(student.getStudentName());

		Student student2;

		student2=new Student(10,'F',"Tirth","Patel");

        student2.getStudentInfo();
	}

}
