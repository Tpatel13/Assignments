package basic.day2.assignment7;

public class PassByVal {

	public static void main(String args[]) {
		int sId = 25;
		PassByVal val = new PassByVal();
		Student s1=new Student();

		val.passTheValueMethod(s1);

		val.passTheValueMethod(s1,25);


		System.out.println(s1.getStudentID());




	}

	public void passTheValueMethod(Student s) {
		s.setStudentID(20);

		System.out.println("The sId are" + s.getStudentID());
	}
	public void passTheValueMethod(Student s,int sID) {
         s.setStudentID(sID);
		System.out.println("The sId are" + s.getStudentID());
	}
}
