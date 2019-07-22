package basic.day2;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String args[])
	{
		
		char grade='b';
		
		Scanner in = new Scanner(System.in);

		
		char marks=in.next().charAt(0);
		 
		
		switch(marks)
		{
		case 'a':
			System.out.println("Marks range is 80 to 100");
			break;
		case 'b':
		    System.out.println("Marks range is 73 to 79");
		    break;
		case 'c':
			System.out.println("Marks range is 65-72");
			break;
		case 'd':
			System.out.println("Marks range is 55-64");
			break;
		case 'e':
		    System.out.println("Marks is less then 55");
		 default:
			 System.out.println("Not valid Grade");
			 break;
		
		}
		 
		 
		
		
		
	}
	

}
