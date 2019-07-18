package basic.day2;

public class Assignment6 {
	
	String name;
	Assignment6(String parameterVal)
	{

	name = parameterVal;

	}
	Assignment6()
	{

	this("student");

	}
	public static void main(String args[]) {
	Assignment6 Assignment61 = new Assignment6("Faculty");
	Assignment6 Assignment62 = new Assignment6();
	System.out.println(Assignment61.name);
	System.out.println(Assignment62.name);
	}

}
