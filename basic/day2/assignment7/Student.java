package basic.day2.assignment7;

public class Student {
	private int studentID;
	private char studentType;
    Student(){
    	this.studentID=10;
    	this.studentType='F';
    }
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

}
